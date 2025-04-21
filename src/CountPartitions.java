import java.util.Arrays;

public class CountPartitions {
    public int countPartitions(int[] nums) {
        int all_sum = Arrays.stream(nums).sum();
        int right = all_sum - nums[0];
        int left = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (Math.abs(left - right) % 2 == 0) {
                count++;
            }

            left += nums[i];
            right -= nums[i];
        }
        return count;
    }
}
