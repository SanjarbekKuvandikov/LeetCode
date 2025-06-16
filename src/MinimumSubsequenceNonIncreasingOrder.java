
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceNonIncreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int sumAll = 0;

        for (int num : nums){
            sumAll += num;
        }
        int bigNum = 0;
        for (int i = nums.length - 1; i >= 0; i--){
            bigNum += nums[i];
            sumAll -= nums[i];
            result.add(nums[i]);
            if (bigNum > sumAll){
                break;
            }
        }

        return result;
    }
}
