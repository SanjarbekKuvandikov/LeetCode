import java.util.HashSet;
import java.util.Set;

public class CheckTheNumberFascinating {
    public boolean isFascinating(int n) {
        Set<Character> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
        str.append(n).append(2 * n).append(3 * n);

        for (char c : str.toString().toCharArray()){
            if (!set.add(c) || c == '0') return false;
        }
        return true;
    }
}
