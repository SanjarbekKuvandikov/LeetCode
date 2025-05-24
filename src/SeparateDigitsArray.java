import java.util.ArrayList;
import java.util.List;

public class SeparateDigitsArray {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int n : nums) {
            List<Integer> digits = new ArrayList<>();
            while (n > 0) {
                digits.add(0,n % 10);
                n = n / 10;
            }
            list.addAll(digits);
        }
        int [] result = new int[list.size()];

        for (int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
