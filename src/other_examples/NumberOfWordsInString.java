package other_examples;

import java.util.HashMap;
import java.util.Map;

public class NumberOfWordsInString {
    public static void main(String[] args) {
        String testString = "Current task posted for Java developers developers";
        String[] words = testString.split(" ");
        Map<String,Integer> wordsNumbers = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if(wordsNumbers.containsKey(words[i])) {
                int counter = wordsNumbers.get(words[i]);
                wordsNumbers.put(words[i], counter + 1);
            }
            else {
                wordsNumbers.put(words[i], 1);
            }
        }
        System.out.println(wordsNumbers);
    }
}
