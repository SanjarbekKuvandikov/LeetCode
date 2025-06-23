public class SubtractProductSumDigitsInteger {
    public int subtractProductAndSum(int n) {
        int product = kopaytma(n);
        int plus = plusN(n);

        return product - plus;
    }
    private int kopaytma(int n){
        int kop = 1;
        while (n > 0){
            kop *= n % 10;
            n /= 10;
        }
        return kop;
    }
    private int plusN(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
