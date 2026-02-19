latihan 1
public class LatihanProduk {
    public static void main(String[] args) {
        // Tipe data
        String namaProduk = "Laptop Asus";
        int harga = 7000000 ;
        int jumlahStok = 15;
        boolean tersedia = true;

        // Output informasi produk
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk        : " + namaProduk);
        System.out.println("Harga              : Rp " + harga);
        System.out.println("Jumlah Stok        : " + jumlahStok);
        System.out.println("Tersedia           : " + tersedia);
        System.out.println("Total Nilai Stok   : Rp " + (harga * jumlahStok));
        System.out.println("Pajak(11%)         : Rp " + (harga * jumlahStok / 100 * 11));
    }
}

latihan 2
public class LatihanKalkulator {
    public static void main(String[] args) {
        // Tipe data
        int angka1 = 25;
        int angka2 = 4;

        // Output informasi produk
        System.out.println("=== KALKULATOR ===");
        System.out.println("Penjumlahan        : " + (angka1 + angka2));
        System.out.println("Pengurangan        : " + (angka1 - angka2));
        System.out.println("Perkalian          : " + (angka1 * angka2));
        System.out.println("Pembagian          : " + (angka1 / angka2));
        System.out.println("Sisa Bagi          : " + (angka1 % angka2));
    }
}

latihan 3
public class LatihanCounter {
public static void main(String[] args) {

    int nilai = 10;

    System.out.println("=== COUNTER ===");
    System.out.println("Nilai awal: " + nilai);

    nilai++;
    nilai++;
    System.out.println("Setelah ++ (2x): " + nilai);

    nilai--;
    System.out.println("Setelah --: " + nilai);

    nilai += 5;
    System.out.println("Setelah += 5: " + nilai);

    nilai -= 3;
    System.out.println("Setelah -= 3: " + nilai);

    nilai *= 2;
    System.out.println("Setelah *= 2: " + nilai);
}


}


latihan 3
