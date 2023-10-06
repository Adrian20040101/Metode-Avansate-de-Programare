import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ubung1 notenProzessor = new Ubung1();
        int[] noten = {45, 23, 78, 69, 80, 19, 89, 100, 39, 13, 48};
        //Ubung 1.1
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(notenProzessor.nichtAusreichend(noten)));
        System.out.println("Average grade = " + notenProzessor.averageGrade(noten));
        System.out.println("All rounded grades = " + Arrays.toString(notenProzessor.roundedGrades(noten)));
        System.out.println("Maximum rounded grade = " + notenProzessor.maxRoundedGrade(noten));
    }
}