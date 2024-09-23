public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        while (n >= 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                break;
            }
        }
        return n == 1;
    }
}
