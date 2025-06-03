public class MinimumOperationsMakeArrayIncreasing {
    public int minOperations(int[] nums) {
        int minOperation = 0;
        if (nums.length == 1) return 0;

        for (int i = 1 ; i < nums.length; i++){
            if (nums[i - 1] >= nums[i]){
                int n = nums[i - 1] + 1;
                minOperation += n - nums[i];
                nums[i] = n;
            }
        }

        return minOperation;
    }
}
