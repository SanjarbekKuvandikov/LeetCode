public class CheckMatrixXMatrix {
    public boolean checkXMatrix(int[][] grid) {
        return nonDiagonal(grid) && diagonal(grid);
    }
    private boolean nonDiagonal(int[][] grid){
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && i + j != n - 1) {
                    if (grid[i][j] != 0) return false;
                }
            }
        }
        return true;
    }
    private boolean diagonal(int[][] grid){
        int first = 0;
        int last = grid[0].length;
        for (int[] ints : grid) {
            if (ints[first] == 0 || ints[last] == 0) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
