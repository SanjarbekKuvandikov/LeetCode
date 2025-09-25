import java.util.HashSet;
import java.util.Set;

public class Unique3DigitEvenNumbers {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i == j || j == k || i == k) continue;

                    int first = digits[i];
                    int second = digits[j];
                    int third = digits[k];

                    if (first == 0) continue;
                    if (third % 2 != 0) continue;

                    int num = first * 100 + second * 10 + third;
                    set.add(num);
                }
            }
        }
        return set.size();
    }
}
