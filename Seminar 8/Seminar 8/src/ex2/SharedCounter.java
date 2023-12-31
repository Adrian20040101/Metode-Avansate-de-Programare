package ex2;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter {

    private volatile AtomicInteger currentValue = new AtomicInteger(0);
    private int limit;

    public SharedCounter(int limit) {
        this.limit = limit;
    }

    public int getCurrentValue() {
        return currentValue.get();
    }

    public void increment(){
        for (int i = 0; i < limit; i++){
            currentValue.incrementAndGet();
        }
    }
}
