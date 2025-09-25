public class LongestStrictlyIncreasingStrictlyDecreasingSubarray {
    public int longestMonotonicSubarray(int[] nums) {
        int maxIncrease = Integer.MIN_VALUE;
        int maxDecrease = Integer.MIN_VALUE;

        int countIncrease = 1;
        int countDecrease = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]){
                countIncrease++;
            }else {
                maxIncrease = Math.max(maxIncrease,countIncrease);
                countIncrease = 1;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]){
                countDecrease++;
            }else {
                maxDecrease = Math.max(maxDecrease,countDecrease);
                countDecrease = 1;
            }
        }

        maxDecrease = Math.max(maxDecrease,countDecrease);
        maxIncrease = Math.max(maxIncrease,countIncrease);

        return Math.max(maxDecrease,maxIncrease);
    }
}
