package pertemuan4;

public class tokosembako {
    // Enkapsulasi dengan akses private
    private String barang, jenis;
    private int stok;

    // Constructor
    public tokosembako(String barang, String jenis, int stok) {
        this.barang = barang;
        this.jenis = jenis;
        this.stok = stok;
    }

    // Accessor (getter)
    public String getBarang() {
        return barang;
    }

    public String getJenis() {
        return jenis;
    }

    public int getStok() {
        return stok;
    }

    // Mutator (setter)
    public void setBarang(String barang) {
        this.barang = barang;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setTambahstok(int tambah) {
        stok += tambah;
    }

    public void setKurangstok(int kurang) {
        stok -= kurang;
    }

    // Method yang bisa dioverride (Polymorfisme)
    public void tampilData() {
        System.out.println("Nama Barang : " + barang);
        System.out.println("Jenis Barang : " + jenis);
        System.out.println("Stok Barang : " + stok);
        System.out.println("---------------------------");
    }
}
