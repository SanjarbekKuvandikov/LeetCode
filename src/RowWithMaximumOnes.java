public class RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int index = 0;
        int count_ones = 0;
        for (int i = 0; i < mat.length; i++){
            int ones = counter(mat[i]);
            if (ones > count_ones){
                count_ones = ones;
                index = i;
            }
        }

        return new int[]{index,count_ones};
    }
    private int counter(int [] num){
        int count = 0;
        for (int one : num){
            if (one == 1) count++;
        }

        return count;
    }
}
