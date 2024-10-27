package enkapsulasi;

public class BankAccount {
    private double saldo;

    public BankAccount(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit (double jumlah) {
        if (jumlah > 0 ) {
            saldo += jumlah;
        }
    }

    public void  withdraw(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo = jumlah;
        }
    }
}