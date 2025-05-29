public class LeftandRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < nums.length; i++) {
            left[i] = sumLeft;
            sumLeft += nums[i];
        }
        for (int i = nums.length-1; i>= 0 ; i--) {
            right[i] = sumRight;
            sumRight += nums[i];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(left[i] - right[i]);
        }

        return result;
    }
}
