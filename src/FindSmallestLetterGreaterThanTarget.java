import java.util.HashSet;
import java.util.Set;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        Set<Character> set = new HashSet<>();
        for (char c : letters){
            set.add(c);
        }
        target = (char) (target + 1);
        while (true){
            if (set.contains(target)) return target;
            target = (char) (target + 1);
        }
    }
}
