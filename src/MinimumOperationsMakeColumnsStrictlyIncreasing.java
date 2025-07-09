public class MinimumOperationsMakeColumnsStrictlyIncreasing {
    public int minimumOperations(int[][] grid) {
        int diff = 0;
        for (int col = 0; col < grid[0].length; col++) {
            for (int row = 1; row < grid.length; row++) {
                if (grid[row - 1][col] >= grid[row][col]){
                    int inc = grid[row - 1][col] - grid[row][col] + 1;
                    grid[row][col] += inc;
                    diff += inc;
                }
            }
        }
        return diff;
    }
}
