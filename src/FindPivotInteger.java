public class FindPivotInteger {
    public int pivotInteger(int n) {

        for (int i = 1 ; i <= n; i++){
            int S1 = i * (i + 1) / 2;
            int S2 = (n - i +1) * (i + n) / 2;

            if (S1 == S2){
                return i;
            }
        }

        return -1;
    }
}
