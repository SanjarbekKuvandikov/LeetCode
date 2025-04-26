public class MinimumElementAfterReplacementWithDigitSum {
    public int minElement(int[] nums) {
        int min = circle(nums[0]);

        for (int i = 1; i < nums.length; i++){
            min = Math.min(min,circle(nums[i]));
        }
        return min;
    }
    private int circle(int n){
        int sum = 0;
        while (n > 0){
            int f = n % 10;
            sum += f;
            n = n/10;
        }
        return sum;
    }
}
