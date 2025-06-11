package pertemuan4;

public class BarangMakanan extends tokosembako {
    private boolean kadaluarsa;

    public BarangMakanan(String barang, String jenis, int stok, boolean kadaluarsa) {
        super(barang, jenis, stok);
        this.kadaluarsa = kadaluarsa;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Kadaluarsa: " + (kadaluarsa ? "Ya" : "Tidak"));
        System.out.println("===========================");
    }
}
