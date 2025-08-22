import java.util.HashSet;
import java.util.Set;

public class SecondLargestDigitString {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)) {
                int num = Integer.parseInt(String.valueOf(c));
                set.add(num);
                max = Math.max(max, num);
            }
        }

        for (int i = max - 1; i >= 0; i--){
            if (set.contains(i)) return i;
        }

        return -1;
    }
}
