<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
</head>
<body>

<h2>Register Student</h2>

<form action="register" method="post">
    <label>Name:</label><br>
    <input type="text" name="name" required><br><br>

    <label>Email:</label><br>
    <input type="email" name="email" required><br><br>

    <label>Year:</label><br>
    <input type="number" name="year" required><br><br>

    <button type="submit">Register</button>
</form>

<br>
<a href="show_all">View All Students</a>

</body>
</html>
