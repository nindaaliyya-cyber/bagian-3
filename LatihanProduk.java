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
