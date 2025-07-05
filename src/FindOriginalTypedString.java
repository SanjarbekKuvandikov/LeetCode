import java.util.HashSet;
import java.util.Set;

public class FindOriginalTypedString {
    public int possibleStringCount(String word) {
        Set<String> set = new HashSet<>();
        StringBuilder str = new StringBuilder(word);
        for (int i = 1; i < word.length(); i++){
            if (word.charAt(i-1) == word.charAt(i)){
                str = new StringBuilder(substring(str, word.charAt(i)));
                set.add(str.toString());
            }
        }
        set.add(word);
        return set.size();
    }
    private String substring(StringBuilder word, char c){
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == c) return word.deleteCharAt(i).toString();
        }
        return "";
    }
}
