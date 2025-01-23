public class FindSumOfEncrypted {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= 10){
                int count = 0;
                int number = nums[i];
                int max = 0;
                while (number > 0) {
                    int digit = number % 10;
                    count ++;
                    max = Math.max(max,digit);
                    number /= 10;
                }
                String numStr = String.valueOf(max);
                String repeatedStr = numStr.repeat(count);
                sum += (Integer.parseInt(repeatedStr));
            }else sum += nums[i];
        }
        return sum;
    }
}
