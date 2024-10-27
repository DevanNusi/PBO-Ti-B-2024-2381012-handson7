package abstraksi;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Merah");
        Perahu perahu = new Perahu("Biru");

        mobil.info();
        mobil.bergerak();

        perahu.info();
        perahu.bergerak();
    }
}