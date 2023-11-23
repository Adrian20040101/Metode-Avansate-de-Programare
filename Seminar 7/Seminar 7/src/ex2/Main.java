package ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numberList = List.of(1, 2, 7, 9, 10, 21, 300, 333);
        Statistics statistics = new Statistics(numberList);
        System.out.println("Max = " + statistics.computeMax());
        System.out.println("Sum = " + statistics.computeSum());

    }
}
