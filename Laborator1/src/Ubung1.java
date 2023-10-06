public class Ubung1 {
    //helper method to round the grades
    public static int round(int note){
        int nextFiveMultiple = note;
        while (nextFiveMultiple % 5 != 0) nextFiveMultiple++;
        return note;
    }

    public static int[] nichtAusreichend(int[] noten){
        int[] intermediaryArray = new int[noten.length];
        int intermediaryIndex = 0;
        for (var note : noten){
            if (round(note) <= 40) {
                intermediaryArray[intermediaryIndex] = note;
                intermediaryIndex++;
            }
        }
        return intermediaryArray;
    }


}
