package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount jeremyPanjaitan = new BankAccount(100);
        jeremyPanjaitan.withdraw(50);
        jeremyPanjaitan.deposit(10 );
        System.out.println(jeremyPanjaitan.getSaldo());
    }
}