/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetbeansToPostgresql;

/**
 *
 * @author MyBook Hype AMD
 */
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== MENU PRODUK TOKO ===");
            System.out.println("1. Create Table");
            System.out.println("2. Insert Data (max 10 sekaligus)");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data (pilih: by ID / All)");
            System.out.println("5. Read Data: ");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    new CreateTable().createProdukTable();
                    break;
                case 2:
                    new InsertData().insertProduk(); 
                    break;
                case 3:
                    new UpdateData().updateProduk();
                    break;
                case 4:
                    new DeleteData().deleteProduk(); 
                    break;
                case 5:
                    new ReadData().readProduk();
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } while (pilih != 0);
    }
}
