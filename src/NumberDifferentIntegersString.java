import java.util.HashSet;
import java.util.Set;

public class NumberDifferentIntegersString {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (Character.isDigit(c)){
                str.append(c);
            }else if (!str.isEmpty()){
                set.add(removeLeadingZeros(str.toString()));
                str.setLength(0);
            }
        }
        if (!str.isEmpty()) {
            set.add(removeLeadingZeros(str.toString()));
        }

        return set.size();
    }
    private String removeLeadingZeros(String cs){
        int i = 0, n = cs.length();
        while (i < n - 1 && cs.charAt(i) == '0') {
            i++;
        }
        return cs.substring(i);
    }
}