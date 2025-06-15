import java.util.HashSet;
import java.util.Set;

public class SubstringsSizeThreeDistinctCharacters {
    public int countGoodSubstrings(String s) {
        int first = 0;
        int second = 3;
        int count = 0;
        while (second <= s.length()){
            if (checker(s.substring(first,second))) count++;
            first++;
            second++;

        }
        return count;
    }
    private boolean checker(String s){
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()){
            if (!set.add(c)) return false;
        }

        return true;
    }
}
