/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetbeansToPostgresql;

/**
 *
 * @author MyBook Hype AMD
 */
import java.sql.Statement;

public class CreateTable extends Koneksi {
    public void createProdukTable() {
        connect();
        try {
            String sql = "CREATE TABLE IF NOT EXISTS produk (" +
                         "id_produk SERIAL PRIMARY KEY, " +
                         "nama_produk VARCHAR(100), " +
                         "harga INT, " +
                         "stok INT)";
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Tabel produk berhasil dibuat.");
        } catch (Exception e) {
            System.out.println("Error membuat tabel: " + e.getMessage());
        }
    }
}
