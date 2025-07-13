public class CellsOddValuesMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];

        for (int[] ints : indices){
            int a = ints[0];
            int b = ints[1];
            for (int i = 0; i < n; i++){
                result[a][i]++;
            }
            for (int i = 0; i < m; i++){
                result[i][b]++;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (result[i][j] % 2 == 1) count++;
            }
        }

        return count;
    }
}
