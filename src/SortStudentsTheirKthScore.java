

public class SortStudentsTheirKthScore {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;
        int[] kth = new int[m];

        for (int i = 0; i < m; i++){
            kth[i] = score[i][k];
        }


        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++){
            int index = getMax(kth);
            kth[index] = -1;
            System.arraycopy(score[index], 0, result[i], 0, n);
        }
        return result;
    }
    private int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
