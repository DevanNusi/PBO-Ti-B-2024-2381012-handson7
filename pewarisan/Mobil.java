package pewarisan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(String merek, String model, int tahunProduksi, final int jumlahPintu, final String jenisBahanBakar) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void infoMobil() {
        infoKendaraan();
        System.out.println("Jumlah pintu: " + jumlahPintu);
        System.out.println("Jenis bahan bakar: " + jenisBahanBakar);

    }
}