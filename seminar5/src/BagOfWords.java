import java.util.*;

public class BagOfWords {
    LinkedHashSet<String> wordMap = new LinkedHashSet<>();
    public BagOfWords(List<String> sentences){
        for(String sentence : sentences){
            wordMap.addAll(Arrays.asList(sentence.split(" ")));
        }
    }

    public List<Integer> transform(String sentence){
        LinkedHashMap<String, Integer> frequencyMap = new LinkedHashMap<>();
        for (String word : sentence.split(" ")){
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        List<Integer> freq = new ArrayList<>();
        for (String key : wordMap){
            freq.add(frequencyMap.getOrDefault(key, 0));
        }
        return freq;
    }
}
