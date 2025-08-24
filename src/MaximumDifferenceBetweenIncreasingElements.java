public class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int first = 0;

        while (first < nums.length){
            for (int i = first + 1; i < nums.length; i++) {
                int a = nums[first];
                int b = nums[i];

                if (b >= a) {
                    maxDiff = Math.max((b - a), maxDiff);
                }
            }
            first++;
        }
        return maxDiff;
    }
}
