public class MakeArrayZeroSubtractingEqualAmounts {
    public int minimumOperations(int[] nums) {
        int count = 0;
        while (true){
            int min = findMin(nums);
            if (min == Integer.MAX_VALUE) break;

            for (int i = 0; i < nums.length; i++){
                if (nums[i] >= min) {
                    nums[i] -= min;
                }
            }
            count++;
        }
        return count;
    }
    private int findMin(int[] num){
        int min = Integer.MAX_VALUE;
        for (int n : num){
            if (n > 0 && min > n){
                min= n;
            }
        }

        return min;
    }
}
