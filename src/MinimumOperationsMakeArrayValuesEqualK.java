import java.util.Arrays;
public class MinimumOperationsMakeArrayValuesEqualK {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int num : nums) if (num < k) return -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
                if (nums[i] > k) {
                    int diff = nums[i] - k;
                    for (int j = i; j < nums.length; j++) {
                        nums[j] -= diff;
                    }
                    System.out.println(Arrays.toString(nums));
                    count++;
                }
        }
        return count;
    }
}
