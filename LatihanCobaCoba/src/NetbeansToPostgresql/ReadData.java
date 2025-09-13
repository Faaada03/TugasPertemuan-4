/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetbeansToPostgresql;

/**
 *
 * @author MyBook Hype AMD
 */import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData extends Koneksi {
    public void readProduk() {
        connect();
        try {
            String sql = "SELECT * FROM produk";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("=== Data Produk ===");
            while (rs.next()) {
                System.out.println(rs.getInt("id_produk") + " | " +
                                   rs.getString("nama_produk") + " | " +
                                   rs.getInt("harga") + " | " +
                                   rs.getInt("stok"));
            }
        } catch (Exception e) {
            System.out.println("Error select: " + e.getMessage());
        }
    }
}

