public class CountTheDigits {
    public int countDigits(int num) {
        int count = 0;
        int nums = num;
        while (nums > 0){
            int divided = nums % 10;
            if (num % divided == 0){
                count++;
            }
            nums = nums / 10;
        }
        return count;
    }
}
