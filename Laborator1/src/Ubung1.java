public class Ubung1 {
    //helper method to round the grades
    public int round(int note){
        int nextFiveMultiple = note;
        while (nextFiveMultiple % 5 != 0) nextFiveMultiple++;
        note = nextFiveMultiple;
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




}
