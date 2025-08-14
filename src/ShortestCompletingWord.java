import java.util.*;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> str = new HashMap<>();

        String license = licensePlate.toLowerCase();
        for (char c : license.toCharArray()){
            if (Character.isAlphabetic(c)){
                str.put(c,str.getOrDefault(c,0) + 1);
            }
        }
        String result = null;

        for (String word : words) {
            if (isContain(str, word)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }
    private boolean isContain(Map<Character, Integer> str, String word){
        Map<Character, Integer> wordCount = new HashMap<>();

        for (char ch : word.toCharArray()) {
            wordCount.put(ch, wordCount.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : str.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();

            if (wordCount.getOrDefault(ch, 0) < count) {
                return false;
            }
        }
        return true;
    }
}
