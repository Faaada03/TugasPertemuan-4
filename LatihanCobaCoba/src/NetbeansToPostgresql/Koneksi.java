/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetbeansToPostgresql;

/**
 *
 * @author MyBook Hype AMD
 */
// File: Koneksi.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    protected Connection conn;

    public void connect() {
        try {
           
            String url = "jdbc:postgresql://localhost:5432/DB_PBO_PRAK4";
            String user = "postgres";
            String password = "123ADMIN3"; 

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
}
