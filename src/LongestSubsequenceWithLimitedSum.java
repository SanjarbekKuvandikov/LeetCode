import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] result = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 0; i < queries.length; i++){
            int sum = 0;
            int count = 0;
            for (int num : nums) {
                sum += num;
                if (sum <= queries[i]) {
                    count++;
                }else break;
            }
            result[i] = count;
        }
        return result;
    }
}
