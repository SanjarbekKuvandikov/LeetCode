import java.util.HashMap;

public class CheckAllCharactersHaveEqualNumberOccurrences {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hash = new HashMap<>();
        for (char c : s.toCharArray()){
            hash.put(c,hash.getOrDefault(c,0) + 1);
        }

        int expected = -1;
        for (int count : hash.values()) {
            if (expected == -1) expected = count;
            else if (expected != count) return false;
        }

        return true;
    }
}
