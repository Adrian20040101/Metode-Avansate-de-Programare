package ex2;

import java.util.List;

public class MaxThread extends Thread{

    List<Integer> numberList;
    private int start, end, max = 0;

    public int getMax() {
        return max;
    }

    public MaxThread(List<Integer> numberList, int start, int end){
        this.numberList = numberList;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        for (int i = start; i < end; i++){
            if (numberList.get(i) > max){
                max = numberList.get(i);
            }
        }
    }
}
