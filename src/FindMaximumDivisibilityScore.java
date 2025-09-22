

public class FindMaximumDivisibilityScore {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max = 0;
        for (int num : divisors){
            int score = counter(nums,num);
            max = Math.max(max,score);
        }
        int min = Integer.MAX_VALUE;
        for (int num : divisors){
            int score = counter(nums,num);
            if (score == max){
                min = Math.min(min,num);
            }
        }
        return min != Integer.MAX_VALUE ? min : max;
    }
    private int counter(int[] nums, int n){
        int count = 0;
        for (int num : nums){
            if (num % n == 0) count++;
        }
        return count;
    }
}
