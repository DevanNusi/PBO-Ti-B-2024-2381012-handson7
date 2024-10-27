package membuatobjekpertama;

public class Mobil {
    private String warna;
    private String merek;
    private int kecepatanMaks;

    //constractor adalah methode yang pertama kali dipanggil pada saat pembuatan objek
    public Mobil(String warna, String merek, int  kecepatanMaks) {
        System.out.println("Konstruktur mobil dipanggil");
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }
    public void tampilkaninfo() {
        System.out.println("Mobil Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Kecepatan Maks :" + kecepatanMaks);
    }
    public void berjalan() {
        System.out.println("Mobil " + merek + " sedang berjalan");
    }
    public void berhenti() {
        System.out.println("Mobil " + merek + " sedang berhenti");
    }
}