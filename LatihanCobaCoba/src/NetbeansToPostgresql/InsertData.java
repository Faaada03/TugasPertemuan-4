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

public class InsertData extends Koneksi {
    public void insertProduk() {
        connect();
        try {
            String sql = "INSERT INTO produk (nama_produk, harga, stok) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);

            int counter = 0; 
            String lanjut;

            do {
                if (counter >= 10) {
                    System.out.println("\nSudah mencapai batas maksimal 10 data.");
                    break;
                }

                System.out.println("\nInput data ke-" + (counter + 1));

                System.out.print("Nama Produk: ");
                String nama = sc.nextLine();

                System.out.print("Harga: ");
                int harga = sc.nextInt();

                System.out.print("Stok: ");
                int stok = sc.nextInt();
                sc.nextLine(); 

                ps.setString(1, nama);
                ps.setInt(2, harga);
                ps.setInt(3, stok);

                ps.executeUpdate();
                counter++;

                System.out.print("Apakah ingin menambahkan data lagi? (IYA(I)/TIDAK(T)): ");
                lanjut = sc.nextLine();

            } while (lanjut.equalsIgnoreCase("I"));

            System.out.println("\nTotal " + counter + " data berhasil dimasukkan!");
        } catch (Exception e) {
            System.out.println("Error insert: " + e.getMessage());
        }
    }
}
