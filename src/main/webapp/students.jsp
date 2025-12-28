<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.studentmap.model.Student" %>

<!DOCTYPE html>
<html>
<head>
    <title>All Students</title>
</head>
<body>

<h2>Registered Students</h2>

<table border="1" cellpadding="5">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Year</th>
    </tr>

    <%
        List<Student> students = (List<Student>) request.getAttribute("students");
        if (students != null) {
            for (Student s : students) {
    %>
    <tr>
        <td><%= s.getName() %></td>
        <td><%= s.getEmail() %></td>
        <td><%= s.getYear() %></td>
    </tr>
    <%
            }
        }
    %>
</table>

<br>
<a href="register.jsp">Register New Student</a>

</body>
</html>
