import java.util.Arrays;

public class SmallestRange {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        return Math.max(0,(nums[nums.length - 1] - k) - (nums[0] + k));
    }
}
