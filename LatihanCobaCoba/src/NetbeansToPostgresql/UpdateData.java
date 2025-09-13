/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetbeansToPostgresql;

/**
 *
 * @author MyBook Hype AMD
 */
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData extends Koneksi {
    public void updateProduk() {
        connect();
        try {
            String sql = "UPDATE produk SET nama_produk=?, harga=?, stok=? WHERE id_produk=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.print("ID Produk yang akan diubah: ");
            int id = sc.nextInt(); sc.nextLine();
            System.out.print("Nama baru: ");
            String nama = sc.nextLine();
            System.out.print("Harga baru: ");
            int harga = sc.nextInt();
            System.out.print("Stok baru: ");
            int stok = sc.nextInt();

            ps.setString(1, nama);
            ps.setInt(2, harga);
            ps.setInt(3, stok);
            ps.setInt(4, id);

            int row = ps.executeUpdate();
            if (row > 0) {
                System.out.println("Data berhasil diperbarui!");
            } else {
                System.out.println("Data tidak ditemukan.");
            }
        } catch (Exception e) {
            System.out.println("Error update: " + e.getMessage());
        }
    }
}
