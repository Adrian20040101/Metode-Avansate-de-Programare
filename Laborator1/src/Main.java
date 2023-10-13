import Ubungen.Ubung1;
import Ubungen.Ubung2;
import Ubungen.Ubung3;
import Ubungen.Ubung4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ubung1 notenProzessor = new Ubung1();
        int[] noten = {45, 23, 78, 69, 80, 19, 89, 100, 39, 13, 48};
        //Ubung 1
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(notenProzessor.nichtAusreichend(noten)));
        System.out.println("Average grade = " + notenProzessor.averageGrade(noten));
        System.out.println("All rounded grades = " + Arrays.toString(notenProzessor.roundedGrades(noten)));
        System.out.println("Maximum rounded grade = " + notenProzessor.maxRoundedGrade(noten));
        System.out.println("-".repeat(69));

        //Ubung 2
        Ubung2 ubung2 = new Ubung2();
        int[] arrayOfNumbers = {12, 34, 21, 46, 864, 313, 54, 32, 11, 6, 85};
        System.out.println("Maximum number in the array = " + ubung2.maximum(arrayOfNumbers));
        System.out.println("Minimum number in the array = " + ubung2.minimum(arrayOfNumbers));
        System.out.println("Maximum n-1 numbers sum in the array = " + ubung2.maxSum(arrayOfNumbers));
        System.out.println("Minimum n-1 numbers sum in the array = " + ubung2.minSum(arrayOfNumbers));
        System.out.println("-".repeat(69));

        //Ubung 3
        Ubung3 ubung3 = new Ubung3();
        int[] firstArray = {6, 4, 5, 1, 0, 0, 0, 5};
        int[] secondArray = {2, 7, 6, 9, 0, 2, 0, 9};
        int factor = 5;
        System.out.println("Sum = " + Arrays.toString(ubung3.addition(firstArray, secondArray)));
        System.out.println("Difference = " + Arrays.toString(ubung3.subtraction(firstArray, secondArray)));
        System.out.println("Multiplication with " + factor + " = " +
                Arrays.toString(ubung3.multiplication(secondArray, factor)));
        System.out.println("Division with " + factor + " = " +
                Arrays.toString(ubung3.division(firstArray, factor)));
        System.out.println("-".repeat(69));

        //Ubung 4
        Ubung4 ubung4 = new Ubung4();
        int[] usbCablePrices = {15, 20, 18, 37, 50, 12};
        int[] keyboardPrices = {30, 25, 45, 75, 100, 60};
        System.out.println("Cheapest keyboard costs " + ubung4.cheapestKeyboard(keyboardPrices) + " lei");
        System.out.println("Most expensive item (USB cable/keyboard) costs " +
                ubung4.mostExpensiveItem(usbCablePrices, keyboardPrices) + " lei");
        System.out.println("Most expensive USB cable that Markus can afford costs " +
                ubung4.mostExpensiveUSBCable(usbCablePrices, 40) + " lei");
        System.out.println("Total amount spent = " + ubung4.buyTwoItems(usbCablePrices, keyboardPrices, 77) +
                " lei");
    }
}