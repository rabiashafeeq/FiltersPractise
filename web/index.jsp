<%--
  Created by IntelliJ IDEA.
  User: Rabia
  Date: 10/28/2019
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<style>
  body {font-family: Arial, Helvetica, sans-serif;}
  * {box-sizing: border-box}

  /* Full-width input fields */
  input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background:lightskyblue;
  }

  input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
  }

  hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
  }

  /* Set a style for all buttons */
  button {
    background-color: lightpink;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
  }

  button:hover {
    opacity:1;
  }

  /* Extra styles for the cancel button */
  .cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
  }

  /* Float cancel and signup buttons and add an equal width */
  .cancelbtn, .signupbtn {
    float: left;
    width: 50%;
  }

  /* Add padding to container elements */
  .container {
    padding: 16px;
  }

  /* Clear floats */
  .clearfix::after {
    content: "";
    clear: both;
    display: table;
  }

  /* Change styles for cancel button and signup button on extra small screens */
  @media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
      width: 100%;
    }
  }
  .dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
  }

  .dropdown {
    position: relative;
    display: inline-block;
  }

  .dropdown-content {
    display: none;
    position: absolute;
    background-color: #f1f1f1;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
  }

  .dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
  }

  .dropdown-content a:hover {background-color: #ddd;}

  .dropdown:hover .dropdown-content {display: block;}

  .dropdown:hover .dropbtn {background-color: #3e8e41;}
</style>
<body>

<form action="callservlet" method="post">
  <div class="container">
    <h1>Sign up form</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    Username:<input type="text" placeholder="Enter username" name="Username">
    Email:    <input type="text" placeholder="Enter Email" name ="Email" >
    Password: <input type="password" placeholder="Enter Password" name = "Password" >
    Dob:<input type="text" placeholder="enter date of birth" name="Dob">
    City:<input type="text" placeholder="enter City" name="City">
    Phoneno: <input type="text" placeholder="enter phone no" name="Phoneno">
    Addressline1: <input type="text" placeholder="enter Addressline" name="Addressline1">
    Addressline2: <input type="text" placeholder="enter Addressline" name="Addressline2">




















    <div class="clearfix">

      <button type="submit" class="signupbtn"> Sign Up </button>
    </div>

  </div>

</form>

</body>
</html>