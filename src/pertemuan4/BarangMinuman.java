package pertemuan4;

public class BarangMinuman extends tokosembako {
    private boolean botol;

    public BarangMinuman(String barang, String jenis, int stok, boolean botol) {
        super(barang, jenis, stok);
        this.botol = botol;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Dalam Botol: " + (botol ? "Ya" : "Tidak"));
        System.out.println("===========================");
    }
}
