public class ANumberAfterDoubleReversal {
    public boolean isSameAfterReversals(int num) {
        return reverse(reverse(num)) == num;
    }
    private int reverse(int num){
        int cur = 0;
        while (num > 0){
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur;
    }
}
