package praktikum8tugas7;

public class Barang {// Kelas Barang untuk menyimpan informasi item
    private String kode;
    private String nama;
    private float harga;

    Barang(String kode, String nama, float harga) {// Konstruktor Class Barang untuk inisialisasi objek Barang dengan kode, nama, dan harga yang diberikan saat objek dibuat.
        this.kode = kode;// atur nilai atribut kode dengan nilai sebagai parameter
        this.nama = nama;//atur nilai atribut nama dengan nilai sebagai parameter
        this.harga = harga;//atur nilai atribut harga dengan nilai sebagai parameter
    }
    
    public String getKode() {//method getter untuk nilai dari 'kode' lalu return nilai dari objek Barang
        return kode;
    }
    public String getNama() {//method getter untuk nilai dari 'nama' lalu return nilai dari objek Barang
        return nama;
    }
    public float getHarga() {//method getter untuk nilai dari 'harga' lalu return nilai dari objek Barang
        return harga;
    }
    
    public void print() {// Method tampilkan informasi barang
        System.out.println("Kode Barang: " + this.kode);
        System.out.println("Nama Barang: " + this.nama);
        System.out.println("Harga: " + this.harga);
    }
}