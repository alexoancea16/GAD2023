package concurrency.BankTransaction;

public class TransactionThread extends Thread {
    private String name;
    private int amount;
    private BankAccount from;
    private BankAccount to;
    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        //TODO your implementation here
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        //TODO your implementation here
    }
}
