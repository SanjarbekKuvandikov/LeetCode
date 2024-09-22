import java.util.HashMap;
import java.util.Hashtable;

public class RansomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(ch) || magazineMap.get(ch) == 0) {
                return false;
            }
            magazineMap.put(ch, magazineMap.get(ch) - 1);
        }

        return true;
    }
}
