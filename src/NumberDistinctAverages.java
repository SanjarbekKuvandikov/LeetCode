import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberDistinctAverages {
    public int distinctAverages(int[] nums) {
        Set<Double> set = new HashSet<>();
        Arrays.sort(nums);

        int first = 0, last = nums.length - 1;

        while (first < last){
            set.add((double) (nums[first] + nums[last]) / 2);
            first++;
            last--;
        }
        return set.size();
    }
}
