public class Ubung1 {
    //helper method to round the grades
    public int round(int note){
        if (note < 38) return note;
        int nextFiveMultiple = note;
        while (nextFiveMultiple % 5 != 0) nextFiveMultiple++;
        if (nextFiveMultiple - note < 3) note = nextFiveMultiple;
        return note;
    }

    public int[] nichtAusreichend(int[] noten){
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

    public double averageGrade(int[] noten){
        int sum = 0;
        for (var grade : noten){
            sum += grade;
        }
        return (double)sum/noten.length;
    }

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
