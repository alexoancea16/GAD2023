package concurrency.RabbitRace;

class RabbitRunnable implements Runnable {
    private int rabbitNumber;

    public RabbitRunnable(int nr) {
        this.rabbitNumber = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit #" + rabbitNumber + " is running");
    }
}
