public class MaximumCountPositiveIntegerNegativeInteger {
    public int maximumCount(int[] nums) {
        int negative = 0;
        int positive = 0;

        for (int num : nums){
            if (num > 0) positive++;
            else if (num < 0) negative++;
        }

        return Math.max(negative,positive);
    }
}
