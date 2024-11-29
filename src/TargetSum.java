import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> memo = new HashMap<>();
        return dfs(nums, target, 0, 0, memo);
    }

    private int dfs(int[] nums, int target, int index, int currentSum, Map<String, Integer> memo) {

        if (index == nums.length) {
            return currentSum == target ? 1 : 0;
        }

        String key = index + "," + currentSum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int add = dfs(nums, target, index + 1, currentSum + nums[index], memo);
        int subtract = dfs(nums, target, index + 1, currentSum - nums[index], memo);

        memo.put(key, add + subtract);
        return memo.get(key);
    }
}
