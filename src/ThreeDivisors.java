public class ThreeDivisors {
    public boolean isThree(int n) {
        int kv = (int) Math.sqrt(n);
        if (kv != n){
            return false;
        }
        return isPrime(kv);
    }
    private boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
