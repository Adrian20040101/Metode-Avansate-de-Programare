package Exercises;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Exercise3 {
    public int[] addition(int[] array1, int[] array2){
        //both arrays passed as arguments must have identical sizes
        if (array1.length == 0 || array2.length == 0 || array1.length != array2.length)
            throw new IllegalArgumentException();

        int[] sum = new int[array1.length + 1];

        boolean carry = false;
        for(int i = array1.length - 1; i >= 0; i--){
            //here we assign the value of the addition with or without carry using the ternary operator
            int digitSum = array1[i] + array2[i] + (carry ? 1 : 0);

            if (digitSum > 9) {
                sum[i + 1] = digitSum % 10;
                carry = true;
            } else {
                sum[i + 1] = digitSum;
                carry = false;
            }
        }
        //if the sum of the two numbers exceed the positions that were originally allocated, add a one at the beginning to keep track of the carry
        if (carry) sum[0] = 1;
        //if there was a carry, return the whole array, else return only the relevant part, leaving the first position out
        return carry ? sum : Arrays.copyOfRange(sum, 1, sum.length);
    }

    /*in the subtraction we have to also keep in mind the possibility that the result is a negative number
    * that case is handled separately in the below code. The overall logic of the operations executed is
    * similar to the one used in the addition method*/
    public int[] subtraction(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0 || array1.length != array2.length)
            throw new IllegalArgumentException();
        if (array1[0] > array2[0]){
            int[] difference = new int[array1.length];
            boolean borrow = false;

            for (int i = array1.length - 1; i >= 0; i--) {
                int digitDifference = array1[i] - array2[i] - (borrow ? 1 : 0);

                if (digitDifference < 0) {
                    difference[i] = 10 + digitDifference;
                    borrow = true;
                } else {
                    difference[i] = digitDifference;
                    borrow = false;
                }
            }
            return difference[0] == 0 ? Arrays.copyOfRange(difference, 1, difference.length) : difference;
        } else {  //perform a difference where the result will be a negative number
            int[] difference = new int[array1.length];
            boolean borrow = false;

            for (int i = array1.length - 1; i >= 0; i--) {
                int digitDifference = array2[i] - array1[i] - (borrow ? 1 : 0);

                if (digitDifference < 0) {
                    difference[i] = 10 + digitDifference;
                    borrow = true;
                } else {
                    difference[i] = digitDifference;
                    borrow = false;
                }
            }
            difference[0] *= -1;  //place the - in front of the number
            //place the - in front of the second digit if the first one doesn't exist
            if (difference[0] == 0 && array2[1] > array1[1]) difference[1] *= -1;
            return difference[0] == 0 ? Arrays.copyOfRange(difference, 1, difference.length) : difference;
        }
    }

    public int[] multiplication(int[] array, int factor){
        if (abs(factor) > 9 || array.length == 0) throw new IllegalArgumentException();
        int[] result = new int[array.length + 1];
        int carry = 0;
        for (int i = array.length - 1; i >= 0; i--){
            int digitMultiplication = array[i] * abs(factor) + carry;
            result[i + 1] = digitMultiplication % 10;
            carry = digitMultiplication / 10;
        }
        if (carry > 0) result[0] = -carry; //setting the minus sign before the number
        else result[1] *= -1;  //if there is no carry, set the minus to the left most digit
        return carry > 0 ? result : Arrays.copyOfRange(result, 1, result.length);
    }

    public int[] division(int[] array, int factor){
        if (factor == 0 || abs(factor) > 9 || array.length == 0) throw new IllegalArgumentException();
        int[] result = new int[array.length];
        //we only consider division operations that result in integer numbers

        int remainder = 0;
        for (int i = 0; i < array.length; i++){  //start from the beginning of the array because when we divide numbers, we also start from the leftmost digit
            int digitDivision = array[i] + remainder * 10;
            result[i] = digitDivision / abs(factor);
            remainder = digitDivision % abs(factor);
        }
        result[0] *= -1;
        if (result[0] == 0) result[1] *= -1;
        return result[0] == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }
}
