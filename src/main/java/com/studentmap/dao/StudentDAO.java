package com.studentmap.dao;

import com.studentmap.model.Student;
import com.studentmap.util.StudentUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public void addStudent(Student student) throws Exception {
        String sql = "INSERT INTO students (name, email, year) VALUES (?, ?, ?)";
        try (Connection conn = StudentUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getEmail());
            stmt.setInt(3, student.getYear());
            stmt.executeUpdate();
        }
    }

    public List<Student> getAllStudents() throws Exception {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection conn = StudentUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setEmail(rs.getString("email"));
                s.setYear(rs.getInt("year"));
                students.add(s);
            }
        }
        return students;
    }
}
