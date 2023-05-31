package concurrency.RabbitRace;

public class RRace {
    public static void main(String[] args) {
        Thread[] rabbits = new Thread[10];

        for (int i = 0; i < 5; i++) {
            rabbits[i * 2] = new RabbitThread(i + 1);
        }

        for (int i = 0; i < 5; i++) {
            rabbits[i * 2 + 1] = new Thread(new RabbitRunnable(i + 1));
        }

        for (Thread rabbit : rabbits) {
            rabbit.start();
        }
    }
}
