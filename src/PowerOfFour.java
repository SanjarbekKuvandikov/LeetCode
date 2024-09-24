public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if ( n< Integer.MIN_VALUE || n > Integer.MAX_VALUE){
            return false;
        }
        while (n >= 1) {
            if (n % 4 == 0) {
                n = n / 4;
            } else {
                break;
            }
        }
        return n == 1;
    }
}
