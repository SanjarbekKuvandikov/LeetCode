import java.util.Arrays;

public class MinimizeMaximumPairSumArray {
    public int minPairSum(int[] nums) {
        if (nums.length % 2 == 1) return 0;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;

        int first = 0;
        int last = nums.length -1;
        while (first < last){
            max = Math.max(max,(nums[first] + nums[last]));
            first++;
            last--;
        }
        return max;
    }
}
