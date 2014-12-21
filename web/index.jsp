<%-- 
    Document   : index
    Created on : Dec 21, 2014, 1:51:37 AM
    Author     : erkoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <style>
        form { 
                margin: 0 auto; 
                width:250px;
             }
    </style>
    <body>
        <h1 align="center">Login Form</h1>
        
        <form method="POST" action="loginServlet" >
            <table>
                <tr><td>Email</td><td><input type="text" name="email" /></td></tr>
                <tr><td>Password</td><td><input type="password" name="password"/></td></tr>
                <tr><td colspan="4"><input type="submit" value="Login"/></td><td></td></tr>
            </table>
        </form>
    </body>
</html>
