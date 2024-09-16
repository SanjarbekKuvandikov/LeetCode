import java.util.HashSet;
import java.util.Set;
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = aylantiruvchi(n);
        }

        return n == 1;

    }
    public static int aylantiruvchi(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;

    }
}
