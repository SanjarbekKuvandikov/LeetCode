public class MaximumDifferenceBetweenAdjacentElementsCircularArray {
    public int maxAdjacentDistance(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            int diff = Math.abs(nums[i - 1] - nums[i]);

            max = Math.max(max,diff);
        }
        int lastDiff = Math.abs(nums[nums.length - 1] - nums[0]);
        max = Math.max(max,lastDiff);

        return max;
    }
}
