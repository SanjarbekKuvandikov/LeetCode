public class MinimumOperationsMakeArrayEqual {
    public int minOperations(int n) {
        int minus = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 1 && (i - n) < 0){
             minus += Math.abs(i - n);
            }
        }
        return minus;
    }
}
