import java.util.HashSet;
import java.util.Set;

public class FirstLetterAppearTwice {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()){
            if (!set.add(c)){
                return c;
            }
        }

        return ' ';
    }
}
