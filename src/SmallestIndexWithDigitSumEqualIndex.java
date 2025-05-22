public class SmallestIndexWithDigitSumEqualIndex {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length ;i++){
            if (sum(nums[i]) == i) {
                min = Math.min(min, sum(nums[i]));
            }
        }
        if (min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
    private int sum(int num){
        int sum_num = 0;
        while (num > 0){
            sum_num += num % 10;
            num /= 10;
        }

        return sum_num;
    }
}
