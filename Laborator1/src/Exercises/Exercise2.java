package Exercises;

public class Exercise2 {
    public int maximum(int[] numbers){
        if (numbers.length == 0) throw new IllegalArgumentException();
        int maximum = Integer.MIN_VALUE;
        for (var number : numbers){
            if (number > maximum) maximum = number;
        }
        return maximum;
    }

    public int minimum(int[] numbers){
        if (numbers.length == 0) throw new IllegalArgumentException();
        int minimum = Integer.MAX_VALUE;
        for (var number : numbers){
            if (number < minimum) minimum = number;
        }
        return minimum;
    }

    //max sum of n - 1 numbers from the array
    public int maxSum(int[] numbers){
        if (numbers.length == 0) throw new IllegalArgumentException();
        int maxSum = 0;
        for (var number : numbers){
            if (number != minimum(numbers)){
                maxSum += number;
            }
        }
        return maxSum;
    }

    //min sum of n - 1 numbers from the array
    public int minSum(int[] numbers){
        if (numbers.length == 0) throw new IllegalArgumentException();
        int minSum = 0;
        for (var number : numbers){
            if (number != maximum(numbers)){
                minSum += number;
            }
        }
        return minSum;
    }
}
