package pertemuan4;

public class sembako {
    public static void main(String[] args) {
        // Polymorfisme - objek dengan tipe parent, instance dari child
        tokosembako beras = new BarangMakanan("Beras", "Bulog", 20, false);
        tokosembako susu = new BarangMinuman("Susu", "Ultra Milk", 30, true);

        beras.setKurangstok(5);
        susu.setTambahstok(10);

        // Memanggil method override (polymorfisme)
        beras.tampilData();
        susu.tampilData();
        
        BarangMakanan BarangMakanan2 = new BarangMakanan();
        
    }
}
