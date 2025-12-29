<%@ page import="java.util.*, com.studentmap.model.Student" %>
<%
    List<Student> students = (List<Student>) request.getAttribute("students");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Students</title>
    <style>
        body { font-family: Arial; background-color: #f7f7f7; padding: 30px; }
        table { width: 80%; margin: auto; border-collapse: collapse; background-color: #fff; }
        th, td { border: 1px solid #ccc; padding: 8px; text-align: center; }
        th { background-color: #007BFF; color: #fff; }
        tr:nth-child(even) { background-color: #f2f2f2; }
        a { display: block; text-align: center; margin-top: 20px; color: #007BFF; text-decoration: none; }
        a:hover { text-decoration: underline; }
    </style>
</head>
<body>
<h2>All Registered Students</h2>
<table>
<tr><th>ID</th><th>Name</th><th>Email</th><th>Year</th></tr>
<% for (Student s : students) { %>
<tr>
    <td><%= s.getId() %></td>
    <td><%= s.getName() %></td>
    <td><%= s.getEmail() %></td>
    <td><%= s.getYear() %></td>
</tr>
<% } %>
</table>
<a href="index.html">Back to Registration</a>
</body>
</html>
