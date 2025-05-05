import java.util.Arrays;

public class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int [] result = new int[n];

            for (int i = 0; i < n; i += 2) {
                result[i] = nums[i + 1];
                result[i + 1] = nums[i];
            }


        return result;
    }
}
