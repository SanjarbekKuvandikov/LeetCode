public class CountSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++){
            if (isEven(i)){
                if (isSymmetric(i)){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isEven(int n){
        int count  = 0;
        while (n > 0){
            n /= 10;
            count++;
        }

        return count % 2 == 0;
    }
    private boolean isSymmetric(int number){
        String s = String.valueOf(number);
        int n = s.length();
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n / 2; i++) {
            sum1 += s.charAt(i) - '0';
            sum2 += s.charAt(i + n / 2) - '0';
        }
        return sum1 == sum2;
    }
}
