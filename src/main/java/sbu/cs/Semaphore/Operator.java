package sbu.cs.Semaphore;
import java.util.concurrent.Semaphore;

public class Operator extends Thread {

    private final Semaphore semaphore;

    public Operator(String name, Semaphore semaphore) {
        super(name);
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                semaphore.acquire();
                Resource.accessResource(getName()); // Pass the operator's name for logging
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                semaphore.release();
            }
            try {
                sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
