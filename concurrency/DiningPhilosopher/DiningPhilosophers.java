package concurrency.DiningPhilosopher;
import java.util.concurrent.locks.ReentrantLock;
public class DiningPhilosophers {
    public static void main(String[] args) {
        int numOfPhilosophers = 5;
        Philosopher[] philosophers = new Philosopher[numOfPhilosophers];
        ReentrantLock[] chopsticks = new ReentrantLock[numOfPhilosophers];

        for (int i = 0; i < numOfPhilosophers; i++) {
            chopsticks[i] = new ReentrantLock();
        }

        for (int i = 0; i < numOfPhilosophers; i++) {
            ReentrantLock leftChopstick = chopsticks[i];
            ReentrantLock rightChopstick = chopsticks[(i + 1) % numOfPhilosophers];

            philosophers[i] = new Philosopher(i + 1, leftChopstick, rightChopstick);
            philosophers[i].start();
        }
    }
}
