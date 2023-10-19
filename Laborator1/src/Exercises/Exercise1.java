package Exercises;

public class Exercise1 {
    //helper method to round the grades
    public int round(int note){
        if (note < 0 || note > 100) throw new IllegalArgumentException();
        if (note < 38) return note;
        int nextFiveMultiple = note;
        while (nextFiveMultiple % 5 != 0) nextFiveMultiple++;
        if (nextFiveMultiple - note < 3) note = nextFiveMultiple;
        return note;
    }

    // this method checks if the rounded grade is below 40 and places it into an intermediary array, which is returned
    public int[] below40Grades(int[] noten){
        if (noten.length == 0) throw new IllegalArgumentException();
        int gradesBelow40 = 0;
        for (var grade : noten){
            if (round(grade) < 40) gradesBelow40++;
        }

        int[] intermediaryArray = new int[gradesBelow40];
        int intermediaryIndex = 0;
        for (var note : noten){
            if (round(note) < 40) {
                intermediaryArray[intermediaryIndex] = note;
                intermediaryIndex++;
            }
        }
        return intermediaryArray;
    }

    //this method performs the average of the rounded grades
    public double averageGrade(int[] noten){
        int sum = 0;
        for (var grade : noten){
            sum += round(grade);
        }
        return (double)sum/noten.length;
    }

    //this method returns the rounded grades
    public int[] roundedGrades(int[] noten){
        int[] roundedGrades = new int[noten.length];
        for(int i = 0; i < noten.length; i++){
            roundedGrades[i] = round(noten[i]);
        }
        return roundedGrades;
    }

    //here we calculate what the biggest possible difference between a multiple of five and the grade itself is
    public int maxRoundedGrade(int[] noten){
        int maxRounded = 0;
        int maxRoundedGrade = 0;
        for (var grade : noten){
            if (round(grade) - grade > maxRounded){
                maxRounded = round(grade) - grade;
                maxRoundedGrade = grade;
            }
        }
        return maxRoundedGrade;
    }


}
