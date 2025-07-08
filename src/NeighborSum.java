public class NeighborSum {
    private final int[][] grid;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
    }
    private int[] findPosition(int value){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == value){
                    return new int[] {i ,j};
                }
            }
        }
        return null;
    }

    public int adjacentSum(int value) {
        int[] pos = findPosition(value);
        if (pos == null) return 0;
        int row = pos[0], col = pos[1];

        int sum = 0;

        //left
        if ((col - 1) >= 0) sum += grid[row][col - 1];
        //right
        if ((col + 1) < grid[row].length) sum += grid[row][col + 1];
        //up
        if ((row - 1) >= 0) sum += grid[row - 1][col];
        //down
        if ((row + 1) < grid.length) sum += grid[row + 1][col];
        return sum;
    }

    public int diagonalSum(int value) {
        int[] pos = findPosition(value);
        if (pos == null) return 0;
        int row = pos[0], col = pos[1];

        int sum = 0;

        //up - left
        if ((row - 1) >= 0 && (col - 1) >= 0) sum += grid[row - 1][col - 1];
        //up - right
        if ((row - 1) >= 0 && (col + 1) < grid[row - 1].length) sum += grid[row - 1][col + 1];
        //down - left
        if ((row + 1) < grid.length && (col - 1) >= 0) sum += grid[row + 1][col - 1];
        //down - right
        if ((row + 1) < grid.length && (col + 1) < grid[row + 1].length) sum += grid[row + 1][col + 1];

        return sum;
    }
}
