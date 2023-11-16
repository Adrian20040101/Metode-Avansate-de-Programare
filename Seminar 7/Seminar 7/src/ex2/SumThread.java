package ex2;

import java.util.List;

public class SumThread extends Thread{

    List<Integer> numberList;
    private int result;
    private int start, end, sum = 0;

    public int getSum() {
        return sum;
    }

    public SumThread(List<Integer> numberList, int start, int end){
        this.numberList = numberList;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        for (int i = start; i < end; i++){
            sum += numberList.get(i);
        }
        result = sum;
    }
}
