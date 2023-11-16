package ex2;

import java.util.ArrayList;
import java.util.List;

public class Statistics{

    private List<Integer> numberList;
    private final int NR_THREADS = 4;
    private int chunkSize = 0;

    public Statistics(List<Integer> numberList){
        this.numberList = numberList;
    }

    public Integer computeMax() throws InterruptedException {
        List<Thread> maxThreads = new ArrayList<>();
        int chunkSize = numberList.size() / NR_THREADS;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < NR_THREADS; i++){
            int start = i + chunkSize;
            int end = (i + 1) * chunkSize;
            if (end > numberList.size())
                end = numberList.size();
            maxThreads.add(new MaxThread(numberList, start, end));
        }

        for (int i = 0; i < NR_THREADS; i++){
            maxThreads.get(i).start();
        }

        for (int i =0; i < NR_THREADS; i++){
            maxThreads.get(i).join();
        }

        for (int i = 0; i < NR_THREADS; i++){
            if (((MaxThread) maxThreads.get(i)).getMax() > max){
                max = ((MaxThread) maxThreads.get(i)).getMax();
            }
        }

        return max;
    }

    public Integer computeSum() throws InterruptedException {
        List<Thread> sumThreads = new ArrayList<>();
        int chunkSize = numberList.size() / NR_THREADS;
        int sum = 0;

        for (int i = 0; i < NR_THREADS; i++){
            int start = i + chunkSize;
            int end = (i + 1) * chunkSize;
            if (end > numberList.size())
                end = numberList.size();
            sumThreads.add(new SumThread(numberList, start, end));
        }

        for (int i = 0; i < NR_THREADS; i++){
            sumThreads.get(i).start();
        }

        for (int i =0; i < NR_THREADS; i++){
            sumThreads.get(i).join();
        }

        for (int i = 0; i < NR_THREADS; i++){
            sum += ((SumThread) sumThreads.get(i)).getSum();
        }

        return sum;
    }
}
