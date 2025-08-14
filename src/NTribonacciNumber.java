public class NTribonacciNumber {
    public int tribonacci(int n) {
        return cycle(n);
    }
    private int cycle(int n){
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return cycle(n - 1) + cycle(n - 2) + cycle(n - 3);
    }
}
