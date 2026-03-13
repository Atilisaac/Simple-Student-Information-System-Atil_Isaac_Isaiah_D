package develop.a.simple.student.information.system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Administrator
 */
public class DBConnection {

    public static Connection getConnection() {
           
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_information_system",
                "root",
                "@Choyisaac12"
            );
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
}


