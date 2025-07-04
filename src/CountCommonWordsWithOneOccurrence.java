import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String,Integer> hash1 = new HashMap<>();
        for (String word : words1){
            hash1.put(word,hash1.getOrDefault(word,0) + 1);
        }
        HashMap<String,Integer> hash2 = new HashMap<>();
        for (String word : words2){
            hash2.put(word,hash2.getOrDefault(word,0) + 1);
        }

        for (Map.Entry<String, Integer> entry : hash1.entrySet()) {
            if (entry.getValue() == 1 && hash2.getOrDefault(entry.getKey(), 0) == 1) {
                count++;
            }
        }

        return count;
    }
}
