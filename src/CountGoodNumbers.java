public class CountGoodNumbers {
    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long evenProduct = product(5,even);
        long oddProduct = product(4,odd);

        int ten_nine = 1_000_000_007;
        return (int)((evenProduct * oddProduct) % ten_nine);
    }
    private static long product(long number, long all){
        long result = 1;
        number = number % 1000000007;
        while (all > 0){
            if (all % 2 == 1){
                result = (result * number) % 1000000007;
            }
            number = (number * number) % 1000000007;
            all /= 2;
        }

        return result;
    }
}
