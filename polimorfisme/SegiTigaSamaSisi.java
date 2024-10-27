package polimorfisme;

public class SegiTigaSamaSisi extends BangunDatar{
    private double sisi;
    private double tinggi;

    public SegiTigaSamaSisi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * sisi * tinggi;
    }

    @Override
    public double keliling() {
        return 3 * sisi;
    }
}