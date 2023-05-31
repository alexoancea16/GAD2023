package concurrency.DiningPhilosopher;
import java.util.concurrent.locks.ReentrantLock;
class Philosopher extends Thread {
    private int philosopherNumber;
    private ReentrantLock leftChopstick;
    private ReentrantLock rightChopstick;

    public Philosopher(int number, ReentrantLock leftChopstick, ReentrantLock rightChopstick) {
        this.philosopherNumber = number;
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();
                eat();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + philosopherNumber + " is thinking");
        Thread.sleep(1000); // Simulating thinking
    }

    private void eat() throws InterruptedException {
        leftChopstick.lock();
        try {
            rightChopstick.lock();
            try {
                System.out.println("Philosopher " + philosopherNumber + " is eating");
                Thread.sleep(1000); // Simulating eating
            } finally {
                rightChopstick.unlock();
            }
        } finally {
            leftChopstick.unlock();
        }
    }
}
