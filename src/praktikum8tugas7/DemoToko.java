package praktikum8tugas7;

import java.util.Scanner;//library Scanner untuk user dapat input di terminal

public class DemoToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        DataBarang data = new DataBarang(10);// Inisialisasi DataBarang dengan kapasitas 10. agar data tidak berkapasitas terlalu banyak dalam studi kasus ini

        boolean eksekusi = true; //variabel 'eksekusi' dengan tipe data 'boolean' dengan nilai awal 'true'
        
        while (eksekusi) {//ketika eksekusi awal sesuai true maka akan menjalankan menu utama dibawah duluan
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MENU UTAMA ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.printf("1. Tambah Item | ");
            System.out.printf("2. Tampilkan Item | ");
            System.out.printf("3. Transaksi Pembelian | ");
            System.out.printf("4. Keluar | ");
            System.out.printf("\nPilih opsi (1-4): ");
            
            int pilihan = input.nextInt();//var 'pilihan' tipe data int menyimpan input pilihan opsi
            input.nextLine(); // membersihkan buffer
            
            switch (pilihan) {
                case 1:
                    data.tambahBarang();  // Memanggil method tambah barang
                    break;
                case 2:
                    data.tampilkanItem(); // Menampilkan semua item yang sudah di tambah sebelumnya
                    break;
                case 3:
                    Transaksi transaksi = new Transaksi(null, 0); // Buat objek dari Transaksi yakni 'transaksi' tanpa inisialisasi data awal
                    transaksi.transaksi(data); // Panggil method transaksi lewat data barang
                    break;
                case 4:
                    eksekusi = false; //ketika eksekusi bernilai false maka program berhenti dengan menampilkan pesan di bawah
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default://default ditampilkan ketika pilihan yang di input user tidak berada di no 1-4, maka pesan di bawah akan ditampilkan
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        
        input.close();//objek 'input' dari Scanner di tutup dari inputan user
    }
}
/*run:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MENU UTAMA ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Tambah Item | 2. Tampilkan Item | 3. Transaksi Pembelian | 4. Keluar | 
Pilih opsi (1-4): 1

**************************** DAFTAR ITEM TOKO ****************************
Tambahan Jumlah Item Barang: 3
Data ke-1
Masukkan Kode		: a001
Masukkan Nama		: Buku
Masukkan Harga		: 3000
Data ke-2
Masukkan Kode		: a002
Masukkan Nama		: Pensil
Masukkan Harga		: 4000
Data ke-3
Masukkan Kode		: a003
Masukkan Nama		: Pulpen
Masukkan Harga		: 5000

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MENU UTAMA ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Tambah Item | 2. Tampilkan Item | 3. Transaksi Pembelian | 4. Keluar | 
Pilih opsi (1-4): 2

*********Daftar Item**********
-------------------------------
Kode Barang: a001
Nama Barang: Buku
Harga: 3000.0
______________________________
Kode Barang: a002
Nama Barang: Pensil
Harga: 4000.0
______________________________
Kode Barang: a003
Nama Barang: Pulpen
Harga: 5000.0
______________________________

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MENU UTAMA ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Tambah Item | 2. Tampilkan Item | 3. Transaksi Pembelian | 4. Keluar | 
Pilih opsi (1-4): 3

**********	TOKO SERBA ADA	**********
Masukkan Jumlah Item Barang: 3
Data ke-1
Masukkan Kode		: a001
Masukkan Jumlah Beli	: 3
Data ke-2
Masukkan Kode		: a002
Masukkan Jumlah Beli	: 2
Data ke-3
Masukkan Kode		: a003
Masukkan Jumlah Beli	: 5

------------------------------------------------------------------------------------
				TOKO SERBA ADA
**************************************************************************************
No	Kode Barang	Nama Barang	Harga		Jumlah Beli	Jumlah Bayar
=====================================================================================
1	a001		Buku		3000.0		3		9000.0
2	a002		Pensil		4000.0		2		8000.0
3	a003		Pulpen		5000.0		5		25000.0
=====================================================================================
Total Bayar: 								42000.0
=====================================================================================



~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MENU UTAMA ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Tambah Item | 2. Tampilkan Item | 3. Transaksi Pembelian | 4. Keluar | 
Pilih opsi (1-4): 4
Terima kasih! Program selesai.
BUILD SUCCESSFUL (total time: 1 minute 52 seconds)
*/