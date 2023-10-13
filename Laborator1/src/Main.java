import Exercises.Exercise1;
import Exercises.Exercise2;
import Exercises.Exercise3;
import Exercises.Exercise4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        int[] grades = {45, 23, 78, 69, 80, 19, 89, 100, 39, 13, 48};
        //Exercise 1
        System.out.println("Below 40 grades: " + Arrays.toString(exercise1.below40Grades(grades)));
        System.out.println("Average grade = " + exercise1.averageGrade(grades));
        System.out.println("All rounded grades = " + Arrays.toString(exercise1.roundedGrades(grades)));
        System.out.println("Maximum rounded grade = " + exercise1.maxRoundedGrade(grades));
        System.out.println("-".repeat(69));

        //Exercise 2
        Exercise2 exercise2 = new Exercise2();
        int[] arrayOfNumbers = {12, 34, 21, 46, 864, 313, 54, 32, 11, 6, 85};
        System.out.println("Maximum number in the array = " + exercise2.maximum(arrayOfNumbers));
        System.out.println("Minimum number in the array = " + exercise2.minimum(arrayOfNumbers));
        System.out.println("Maximum n-1 numbers sum in the array = " + exercise2.maxSum(arrayOfNumbers));
        System.out.println("Minimum n-1 numbers sum in the array = " + exercise2.minSum(arrayOfNumbers));
        System.out.println("-".repeat(69));

        //Exercise 3
        Exercise3 exercise3 = new Exercise3();
        int[] firstArray = {6, 4, 5, 1, 0, 0, 0, 5};
        int[] secondArray = {2, 7, 6, 9, 0, 2, 0, 9};
        int factor = -5;
        System.out.println("Sum = " + Arrays.toString(exercise3.addition(firstArray, secondArray)));
        System.out.println("Difference = " + Arrays.toString(exercise3.subtraction(firstArray, secondArray)));
        System.out.println("Multiplication with " + factor + " = " +
                Arrays.toString(exercise3.multiplication(secondArray, factor)));
        System.out.println("Division with " + factor + " = " +
                Arrays.toString(exercise3.division(firstArray, factor)));
        System.out.println("-".repeat(69));

        //Exercise 4
        Exercise4 exercise4 = new Exercise4();
        int[] usbCablePrices = {15, 20, 18, 37, 50, 12};
        int[] keyboardPrices = {30, 25, 45, 75, 100, 60};
        System.out.println("Cheapest keyboard costs " + exercise4.cheapestKeyboard(keyboardPrices) + " lei");
        System.out.println("Most expensive item (USB cable/keyboard) costs " +
                exercise4.mostExpensiveItem(usbCablePrices, keyboardPrices) + " lei");
        System.out.println("Most expensive USB cable that Markus can afford costs " +
                exercise4.mostExpensiveUSBCable(usbCablePrices, 40) + " lei");
        System.out.println("Total amount spent = " + exercise4.buyTwoItems(usbCablePrices, keyboardPrices, 77) +
                " lei");
    }
}