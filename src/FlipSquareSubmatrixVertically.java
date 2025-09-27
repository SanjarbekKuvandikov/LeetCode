public class FlipSquareSubmatrixVertically {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int a = x;
        int b = x + k - 1;
        while (a < b) {
            for (int i = y; i < y + k; i++) {
                int curr = grid[a][i];
                grid[a][i] = grid[b][i];
                grid[b][i] = curr;
            }
            a++;
            b--;
        }
        return grid;
    }
}
