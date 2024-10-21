package praktikum8tugas7;

import java.util.Scanner;

public class DataBarang {
    Scanner input = new Scanner(System.in);
    Barang[] daftarBarang;    
    int jumlahBarang = 0; // Menyimpan jumlah barang yang ada

    public DataBarang(int kapasitas) {// Konstruktor inisialisasi array dari daftarBarang
        daftarBarang = new Barang[kapasitas];
    }

    public void tambahBarang() {    // Method Tambah barang dari item di toko serba ada dan print header
        System.out.println("\n**************************** DAFTAR ITEM TOKO ****************************");
        System.out.print("Tambahan Jumlah Item Barang: ");//tambah sesuai barang yang di ingin ditambahkan
        int tambahanItem = input.nextInt();
        input.nextLine(); // membersihkan buffer

        if (jumlahBarang + tambahanItem > daftarBarang.length) {// jika item lebih dari lenghth daftar barang. agar tidak melebihi kapasitas dari inisialisasi
            System.out.println("Jumlah barang melebihi kapasitas. Kapasitas saat ini: " + daftarBarang.length);
            return;
        }

        for (int i = 0; i < tambahanItem; i++) {        // loop Input Data Barang sesuai tambahan data yang di inputkan
            System.out.println("Data ke-" + (jumlahBarang + 1));
            System.out.print("Masukkan Kode\t\t: ");
            String kode = input.nextLine();                
            System.out.print("Masukkan Nama\t\t: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Harga\t\t: ");
            double harga = input.nextDouble();
            input.nextLine(); // membersihkan buffer

            daftarBarang[jumlahBarang] = new Barang(kode, nama, (float) harga);// Simpan data barang di daftarBarang
            jumlahBarang++; // pertambahan jumlah barang yang ada
        }
    }

    public void tampilkanItem() {// Method untuk tampilkan semua Item yang sudah di tambah sebelumnya
        System.out.println("\n*********Daftar Item**********\n-------------------------------");
        for (int i = 0; i < jumlahBarang; i++) {
            if (daftarBarang[i] != null) {
                daftarBarang[i].print();
                System.out.println("______________________________");
            }
        }
    }

    public Barang getBarangByKode(String kode) {// Method dapatk barang lewat kode barang
        for (int i = 0; i < jumlahBarang; i++) {
            if (daftarBarang[i].getKode().equals(kode)) {
                return daftarBarang[i];
            }
        }
        return null; // Jika kode tidak ditemukan
    }
    
}