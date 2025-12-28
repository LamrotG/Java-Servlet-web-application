package com.studentmap.servlet;

import com.studentmap.dao.StudentDAO;
import com.studentmap.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/register")
public class RegisterStudentServlet extends HttpServlet {

    private final StudentDAO studentDAO = new StudentDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String yearStr = request.getParameter("year");

        if (name == null || email == null || yearStr == null ||
            name.isEmpty() || email.isEmpty() || yearStr.isEmpty()) {
            response.sendRedirect("register.jsp?error=Missing+fields");
            return;
        }

        int year = Integer.parseInt(yearStr);

        Student student = new Student(name, email, year);
        studentDAO.insertStudent(student);

        response.sendRedirect("show_all");
    }
}
