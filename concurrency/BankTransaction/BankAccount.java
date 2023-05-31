package concurrency.BankTransaction;

public class BankAccount {
    private String name;
    private int debit;
    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    synchronized void withdraw(double amount) {
        longDatabaseCall();
        debit -= amount;
    }

    synchronized void deposit(double amount) {
        longDatabaseCall();
        debit += amount;
    }

    void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
