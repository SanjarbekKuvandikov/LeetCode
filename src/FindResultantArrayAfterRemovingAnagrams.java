import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class FindResultantArrayAfterRemovingAnagrams {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();

            for (String word : words) {
                if (!result.isEmpty() && isEqual(hash(result.get(result.size() - 1)), hash(word))) {
                    continue;
                }
                result.add(word);
        }
        return result;
    }
    private Hashtable<Character,Integer> hash (String word){
        Hashtable<Character,Integer> hash = new Hashtable<>();
        for (char c : word.toCharArray()){
            hash.put(c,hash.getOrDefault(c,0) + 1);
        }
        return hash;
    }
    private boolean isEqual (Hashtable<Character,Integer> hash1, Hashtable<Character,Integer> hash2){
        for (Map.Entry<Character, Integer> entry : hash1.entrySet()) {
            char c = entry.getKey();
            int countA = entry.getValue();
            Integer countB = hash2.get(c);
            if (countB == null || countA != countB) {
                return false;
            }
        }

        return hash1.size() == hash2.size();
    }
}
