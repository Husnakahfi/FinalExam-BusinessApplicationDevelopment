/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexam.bad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/sm_inventaris";
    private static final String USER = "root"; // username 
    private static final String PASSWORD = ""; // password 
    private static String SELECT;
    
   public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("JDBC Driver tidak ditemukan");
        }
    }
    
    public static void main(String[] args) {
        try {
            Connection connection = getConnection();
            if (connection != null) {
                System.out.println("Koneksi berhasil!");
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
