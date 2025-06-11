
package tokosembako;


public class sembako {
    public static void main(String[] args) {
        tokosembako beras = new tokosembako();
        tokosembako tepung = new tokosembako();
        
        beras.barang = "beras bulog";
        beras.harga = 10000;
        beras.jumlah = 1;
        
        tepung.barang = "tepung segitiga biru";
        tepung.harga = 5000;
        tepung.jumlah = 1;
        
        System.out.println("nama.barang : "+beras.barang);
        System.out.println("harga.barang : "+beras.harga);
        System.out.println("jumlah.barang : "+beras.jumlah);
        System.out.println("nama.barang : "+beras.barang);
        System.out.println("harga.barang : "+beras.harga);
        System.out.println("jumlah.barang : "+beras.jumlah);
        
    }
}
