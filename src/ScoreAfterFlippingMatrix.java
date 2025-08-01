public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < grid[0].length; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }

        for (int i = 0; i < grid[0].length; i++) {
            int count = column(grid, i);
            if (count < grid.length - count) {
                for (int j = 0; j < grid.length; j++) {
                    grid[j][i] ^= 1;
                }
            }
        }
        for (int[] ints : grid){
            sum += Integer.parseInt(toString(ints),2);
        }

        return sum;
    }
    private int countOne(int[] num){
        int count = 0;
        for (int n : num){
            if (n == 1) count++;
        }
        return count;
    }
    private int column(int[][] grid, int col){
        int[] column = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            column[i] = grid[i][col];
        }

        return countOne(column);
    }
    private String toString(int[] num){
        StringBuilder str = new StringBuilder();
        for (int n : num){
            str.append(n);
        }
        return str.toString();
    }
}
