<%-- 
    Document   : newTask
    Created on : Dec 21, 2014, 4:11:35 AM
    Author     : erkoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Task Page</title>
    </head>
    <body>
        <div id="divForm" name="form" style="border: 2px black solid;">
        <form method="post" action="newTaskServlet" enctype="multipart/form-data">
            <table>
                <tr><td><b>Title:</b></td><td><input type="text" name="title"/></td></tr>
                <tr><td><b>Description:</b></td><td><input type="text" name="description"/></td></tr>
                <tr><td><b>Due-Date:</b></td><td><input type="datetime-local" name="due_date"/></td></tr>
                <tr><tr></tr><td><input type="file"  name="file" value="Choose file"/></td></tr>
            <tr><td></td><td><input type="submit" value="Create Task"/></td></tr>
            </table>
        </form>
        </div>
    </body>
</html>
