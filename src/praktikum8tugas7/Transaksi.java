package praktikum8tugas7;

import java.util.Scanner;//library Scanner untuk user dapat input di terminal

public class Transaksi {// Kelas Transaksi untuk menghitung dan mencetak struk
    private Barang item; //inisialisasi objek Barang var item
    private int jumlahBeli;//inisialisasi 'jumlahBeli' bertipe int
    Scanner input = new Scanner(System.in);//inisialisasi objek Scanner 'input' dengan inputan dari user di terminal

    public Transaksi(Barang item, int jumlahBeli) {// Konstruktor Transaksi
        this.item = item;
        this.jumlahBeli = jumlahBeli;
    }

    public float hitungJumlahBayar() {// Method ghitung jumlah bayar
        return item.getHarga() * jumlahBeli; //harga di class Barang di get lalu kalikan dengan jumlah beli
    }

    public void cetakStruk(int no) {// method cetak struk
        System.out.println(no +"\t"+ item.getKode() +"\t\t"+ item.getNama() +"\t\t"+ item.getHarga() +"\t\t"+ jumlahBeli +"\t\t"+ hitungJumlahBayar());
    }
    
    public void transaksi(DataBarang data){//method eksekusi transaksi
        System.out.println("\n**********\tTOKO SERBA ADA\t**********");//header transaksi
        System.out.print("Masukkan Jumlah Item Barang: ");//jumlah barang yang mau di tambahkan
        int jumlahItem = input.nextInt();
        input.nextLine(); // membersihkan buffer

        Transaksi[] transaksiList = new Transaksi[jumlahItem];//inisialisasi Objek simpanan Class 'Transaksi' array 'transaksiList' yang berukuran jumlah 'jumlahItem'
        
        for (int i = 0; i < jumlahItem; i++) {// Input Data Barang yang ingin dibeli
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan Kode\t\t: ");//catat lewat kode barang
            String kode = input.nextLine();
            Barang item = data.getBarangByKode(kode);
            
            if (item == null) {//jika item masih kosong atau kode barang tidak ada di daftar item
                System.out.println("Kode barang tidak ditemukan. Silakan coba lagi.");
                i--; // perulangan jika barang tidak ditemukan
                continue;
            }
            
            System.out.print("Masukkan Jumlah Beli\t: ");//jumlah barang yang dibeli
            int jumlahBeli = input.nextInt();
            input.nextLine(); // membersihkan buffer
            
            transaksiList[i] = new Transaksi(item, jumlahBeli);// Mencatat transaksi ke i dari data disimpan
        }

        System.out.println("\n------------------------------------------------------------------------------------");// Menampilkan hasil struk dan header
        System.out.println("\t\t\t\tTOKO SERBA ADA\n**************************************************************************************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\t\tJumlah Beli\tJumlah Bayar");
        System.out.println("=====================================================================================");

        double totalBayar = 0;//inisialisasi total bayar awal = 0

        for (int i = 0; i < transaksiList.length; i++) {//perulangan tampilkan data dari transaksi list yang tersimpan sebelumnya sesuai lenghth atau jumlah data
            if (transaksiList[i] != null) { // jika transaksi tidak null maka akan di print
                transaksiList[i].cetakStruk(i + 1);
                totalBayar += transaksiList[i].hitungJumlahBayar(); // Menghitung total bayar
            }
        }

        System.out.println("=====================================================================================");//print total bayar
        System.out.println("Total Bayar: \t\t\t\t\t\t\t\t" + totalBayar);
        System.out.println("=====================================================================================\n\n");
    }
    
}