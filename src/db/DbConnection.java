package db;

import java.sql.*;


public class DbConnection {
    private String dbURL = "jdbc:mysql://localhost:3306/lab44";
    private String username = "root";
    private String password = "";
    private Connection connection;
    public DbConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL,username,password);
            if(connection!=null){
                System.out.println("Success");
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertData(String Usr_name,String email,String pass_word,String D_b,String Ci_ty,String Phone_no,String Address_1,String Address_2){
        try {
            String sqlQuery = "INSERT INTO student(Username,Email,Password,Dob,City,Phoneno,Addressline1,Addressline2) VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,Usr_name);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,pass_word);
            preparedStatement.setString(4,D_b);
            preparedStatement.setString(5,Ci_ty);
            preparedStatement.setString(6,Phone_no);
            preparedStatement.setString(7,Address_1);
            preparedStatement.setString(8,Address_2);




            int noOfRowsInserted = preparedStatement.executeUpdate();
            if(noOfRowsInserted>0){
                System.out.println(noOfRowsInserted + " rows inserted!");
            }
            else
            {
                System.out.println("hii");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    public void displayRecords(){
        try {
            String sqlQuery = "SELECT * FROM student";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlQuery);
            while (result.next()){


                System.out.println("email  is "+result.getString("email"));




            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
