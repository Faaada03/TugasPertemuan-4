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
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData extends Koneksi {
    public void deleteProduk() {
        connect();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== MENU DELETE ===");
        System.out.println("1. Hapus berdasarkan ID");
        System.out.println("2. Hapus semua data");
        System.out.print("Pilih: ");
        int pilih = sc.nextInt();

        try {
            if (pilih == 1) {
                // Delete by ID
                String sql = "DELETE FROM produk WHERE id_produk=?";
                PreparedStatement ps = conn.prepareStatement(sql);

                System.out.print("Masukkan ID Produk yang akan dihapus: ");
                int id = sc.nextInt();

                ps.setInt(1, id);

                int row = ps.executeUpdate();
                if (row > 0) {
                    System.out.println("Data dengan ID " + id + " berhasil dihapus!");
                } else {
                    System.out.println("Data dengan ID tersebut tidak ditemukan.");
                }

            } else if (pilih == 2) {
                // Delete all
                String sql = "DELETE FROM produk";
                Statement stmt = conn.createStatement();
                int row = stmt.executeUpdate(sql);

                System.out.println("Semua data (" + row + " baris) berhasil dihapus!");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } catch (Exception e) {
            System.out.println("Error delete: " + e.getMessage());
        }
    }
}
