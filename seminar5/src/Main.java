import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> testString = new ArrayList<>();
        testString.add("a a b c d");
        testString.add("b a d");
        BagOfWords bag = new BagOfWords(testString);
        System.out.println(bag.transform(testString.get(0)));
        System.out.println(bag.transform(testString.get(1)));
    }
}