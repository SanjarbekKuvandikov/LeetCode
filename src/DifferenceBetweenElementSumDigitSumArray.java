public class DifferenceBetweenElementSumDigitSumArray {
    public int differenceOfSum(int[] nums) {
        int all_sum = 0;
        int ten_sum = 0;

        for (int num : nums){
            all_sum += num;

            int n = num;
            while (n > 0) {
                ten_sum += n % 10;
                n = n / 10;
            }


        }

        return Math.abs(all_sum - ten_sum);
    }
}
