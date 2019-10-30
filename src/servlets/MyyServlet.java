package servlets;

import db.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyyServlet")
public class MyyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String  Username=request.getParameter("Username");
        String Email=request.getParameter("Email");
        String Password=request.getParameter("Password");
        String Dob=request.getParameter("Dob");
        String City=request.getParameter("City");
        String Phoneno=request.getParameter("Phoneno");
        String Addressline1=request.getParameter("Addressline1");
        String Addressline2=request.getParameter("Addressline2");


        DbConnection dbConnection=new DbConnection();
        dbConnection.insertData(Username,Email,Password,Dob,City,Phoneno,Addressline1,Addressline2);
        PrintWriter out =response.getWriter();
        out.write( "Record save succesfully");

        out.write("Username is" +Username);
        out.write("email is"+Email);
        out.write("passwordis"+Password);
        out.write("Dob is "+Dob);
        out.write("City is "+City);
        out.write("Phoneno is"+Phoneno);
        out.write("Addressline1 is"+Addressline1);
        out.write("Addressline2 is" +Addressline2);

    }







    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        out.write(  "you are in servlettttt" );
    }
}

