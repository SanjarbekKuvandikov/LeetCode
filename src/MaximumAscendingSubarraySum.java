public class MaximumAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i], curr = nums[i];
            for (int j =  i + 1; j < nums.length; j++) {
                if (curr < nums[j]){
                    curr = nums[j];
                    sum += curr;
                }
                else {
                    break;
                }
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
