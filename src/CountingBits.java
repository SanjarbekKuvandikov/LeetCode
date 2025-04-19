
public class CountingBits {
    public int[] countBits(int n) {
        int [] result = new int[n+1];
        for (int i = 0; i <= n; i++){
            if (i % 2 == 1){
                result[i]= result[i/2]+1;
            }else result[i]=result[i/2];
        }
        return result;
    }
}
