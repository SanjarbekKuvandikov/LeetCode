import java.util.Arrays;

public class NeitherMinimumMaximum {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 3){
            return -1;
        }

        return nums[1];
    }
}
