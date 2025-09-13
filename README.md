# TugasPertemuan-4
Tugas Keempat PBO 
# CRUD Java JDBC dengan PostgreSQL

Proyek ini adalah implementasi sederhana operasi CRUD (Create, Read, Update, Delete) 
menggunakan Java (NetBeans) yang terhubung ke database PostgreSQL.

## Fitur
1. **Create Table** - Membuat tabel `produk` di database.
2. **Insert Data** - Menambahkan data produk (max 10 input). Ada opsi lanjut (I/T) untuk input berikutnya.
3. **Update Data** - Mengubah data produk berdasarkan `id_produk`.
4. **Delete Data** - Menghapus data produk:
   - Hapus berdasarkan `id_produk`
   - Hapus semua data
5. **Read Data** - Menampilkan data produk dari tabel.

## Struktur Project
- `KoneksiDB.java` → Koneksi dasar ke PostgreSQL
- `CreateTable.java` → Membuat tabel produk
- `InsertData.java` → Menambah data produk (input manual user)
- `UpdateData.java` → Mengubah data produk
- `DeleteData.java` → Menghapus data produk (ID / semua)
- `ReadData.java` → Menampilkan data produk
- `MainMenu.java` → Menjalankan menu interaktif CRUD

## Cara Menjalankan
1. Buat database di PostgreSQL, misalnya `DB_PBO_PRAK4`.
2. Tambahkan PostgreSQL JDBC Driver ke NetBeans.
3. Sesuaikan `url`, `user`, dan `password` di `KoneksiDB.java` dengan konfigurasi PostgreSQL kamu.
4. Jalankan `MainMenu.java` untuk mulai program.

## Catatan
- Semua class **extends KoneksiDB** agar koneksi bisa dipakai ulang.
- Input dilakukan menggunakan `Scanner`.
- ResultSet hanya digunakan pada operasi `SELECT`.

---

