public class SmallestDivisibleDigitProduct {
    public int smallestNumber(int n, int t) {

        while (true){
            int num = checker(n);
            if (num % t == 0){
                return n;
            }else {
                n++;
            }
        }
    }
    private int checker(int n){
        int result = 1;

        while (n > 0){
            result *= n % 10;
            n /= 10;
        }

        return result;
    }
}
