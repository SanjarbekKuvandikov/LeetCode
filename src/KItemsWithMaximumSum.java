public class KItemsWithMaximumSum {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int max = 0;

        while (k > 0){
            if (numOnes > 0){
                k--;
                numOnes--;
                 max++;
            }else if (numZeros > 0){
                k--;
                numZeros--;
                max += 0;
            }else if (numNegOnes > 0){
                k--;
                numNegOnes--;
                max += -1;
            }
        }

        return max;
    }
}
