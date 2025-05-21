import java.util.Arrays;

public class MaximumSumWithExactlyKElements {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        int n = nums.length - 1;
        Arrays.sort(nums);

        while (k > 0){
            max += nums[n];
            nums[n] = nums[n] + 1;
            k--;
        }

        return max;
    }
}
