
import java.util.HashSet;
import java.util.Set;

public class CountNumberDistinctIntegersAfterReverseOperations {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
            set.add(reverse(num));
        }

        return set.size();
    }
    private int reverse(int num){
        if (num == 0) return 0;
        StringBuilder str = new StringBuilder();
        while (num > 0){
            str.append(num % 10);
            num /= 10;
        }
        return Integer.parseInt(str.toString());
    }
}
