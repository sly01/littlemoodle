<%-- 
    Document   : listTask
    Created on : Dec 21, 2014, 4:11:41 AM
    Author     : erkoc
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="com.fatih.edu.tr.Task"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          ArrayList<Task> list =(ArrayList<Task>)request.getAttribute("ListTaskServlet");
          
          for(Task task: list){
              out.println(task.getTitle());
              out.println(task.getDescription());
          }
        %>
        
    </body>
</html>
