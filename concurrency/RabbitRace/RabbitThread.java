package concurrency.RabbitRace;

class RabbitThread extends Thread {
    private int rabbitNumber;

    public RabbitThread(int nr) {
        this.rabbitNumber = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit #" + rabbitNumber + " is running");
    }
}