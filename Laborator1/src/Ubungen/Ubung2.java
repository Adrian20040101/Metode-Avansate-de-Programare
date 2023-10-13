package Ubungen;

public class Ubung2 {
    public int maximum(int[] numbers){
        int maximum = Integer.MIN_VALUE;
        for (var number : numbers){
            if (number > maximum) maximum = number;
        }
        return maximum;
    }

    public int minimum(int[] numbers){
        int minimum = Integer.MAX_VALUE;
        for (var number : numbers){
            if (number < minimum) minimum = number;
        }
        return minimum;
    }

    //max sum of n - 1 numbers from the array
    public int maxSum(int[] numbers){
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
        int minSum = 0;
        for (var number : numbers){
            if (number != maximum(numbers)){
                minSum += number;
            }
        }
        return minSum;
    }
}
