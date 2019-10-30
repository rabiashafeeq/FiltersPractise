package Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "Filter")
public class Filter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String Username=request.getParameter("Username");
        String Email = request.getParameter("Email");
        String Password = request.getParameter("Password");
        String Dob=request.getParameter("Dob");
        String City=request.getParameter("City");
        String Phoneno=request.getParameter("Phoneno");
        String Addressline2=request.getParameter("Addressline2");


        if ((Username.isEmpty() || Username.equals("") ||Email.isEmpty() || Email.equals("")
                || Password.isEmpty() || Password.equals("")
                || Dob.isEmpty() || Dob.equals("")
                || City.isEmpty() || City.equals("")
                || Phoneno.isEmpty() || Phoneno.equals("")
                || Addressline2.isEmpty() || Addressline2.equals("")) )
        {
            response.sendRedirect("home.jsp");
            // will display error

        } else {
            chain.doFilter(req, resp);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Welcome.jsp");
            dispatcher.forward(request, response);


        }
    }


    public void init(FilterConfig config) throws ServletException {

    }
}



