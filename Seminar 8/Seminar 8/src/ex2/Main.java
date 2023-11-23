package ex2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int limit = 100000;
        SharedCounter sharedCounter = new SharedCounter(limit);

        Thread thread1 = new Thread(sharedCounter::increment);
        Thread thread2 = new Thread(sharedCounter::increment);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final counter: " + sharedCounter.getCurrentValue());
    }
}
