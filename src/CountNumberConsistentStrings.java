
import java.util.HashSet;
import java.util.Set;

public class CountNumberConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (char c : allowed.toCharArray()){
            set.add(c);
        }

        for (String word : words){
            boolean isConsist = true;
            for (char c : word.toCharArray()){
                if (!set.contains(c)){
                    isConsist = false;
                    break;
                }
            }

            if (isConsist) count++;
        }

        return count;
    }
}
