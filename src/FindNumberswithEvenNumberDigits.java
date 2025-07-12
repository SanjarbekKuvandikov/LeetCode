public class FindNumberswithEvenNumberDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (checker(num) % 2 == 0) count++;
        }
        return count;
    }
    private int checker(int num){
        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
