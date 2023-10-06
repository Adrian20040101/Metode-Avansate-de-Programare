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
        System.out.println("-".repeat(30));

        //Ubung 2
        Ubung2 ubung2 = new Ubung2();
        int[] arrayOfNumbers = {12, 34, 21, 46, 864, 313, 54, 32, 11, 6, 85};
        System.out.println("Maximum number in the array = " + ubung2.maximum(arrayOfNumbers));
        System.out.println("Minimum number in the array = " + ubung2.minimum(arrayOfNumbers));
        System.out.println("Maximum n-1 numbers sum in the array = " + ubung2.maxSum(arrayOfNumbers));
        System.out.println("Minimum n-1 numbers sum in the array = " + ubung2.minSum(arrayOfNumbers));
    }
}