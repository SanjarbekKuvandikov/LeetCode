public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
            return false;
        }
        while (n >= 1 || n<= -1) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                break;
            }
        }
        return n == 1;
    }
}
