import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class FindMostFrequentVowelConsonant {
    public int maxFreqSum(String s) {
        List<Character> list = List.of('a', 'e', 'i', 'o', 'u');
        Hashtable<Character,Integer> hash = new Hashtable<>();
        int max_vowels = 0;
        int max_consonant = 0;

        for (char c : s.toCharArray()){
            hash.put(c,hash.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : hash.entrySet()){
            if (list.contains(entry.getKey())){
                max_vowels = Math.max(max_vowels,entry.getValue());
            }else {
                max_consonant = Math.max(max_consonant,entry.getValue());
            }
        }

        return max_vowels + max_consonant;
    }
}
