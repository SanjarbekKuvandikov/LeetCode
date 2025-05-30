public class NumberCommonFactors {
    public int commonFactors(int a, int b) {
        int count = 0;
        int gcd  = gcd(a,b);
        for (int x = 1; x <= gcd; x++){
            if (gcd % x == 0){
                count++;
            }
        }

        return count;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
