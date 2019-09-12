package com.example.app.servlets;

import com.example.app.utils.DatabaseConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.*;

@WebServlet(name = "StudentsServlet", urlPatterns = "/students")
public class StudentsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));

        try {
            Connection connection = DatabaseConnection.connect();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM students;");

            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                int d_id = result.getInt("d_id");
                resp.getWriter().printf("%d. %s - %d \n", id, name, d_id);
            }

            statement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
