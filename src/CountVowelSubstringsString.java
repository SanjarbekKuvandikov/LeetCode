import java.util.HashSet;
import java.util.Set;

public class CountVowelSubstringsString {
    public int countVowelSubstrings(String word) {
        int count = 0;
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < word.length(); i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);
                if (!set.contains(c)) break;
                seen.add(c);
                if (seen.size() == 5) count++;
            }
        }

        return count;
    }
}
