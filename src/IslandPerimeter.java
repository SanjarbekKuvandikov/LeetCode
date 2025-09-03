public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1) {
                    perimeter += UpAndDown(i, j, grid) + LeftAndRight(i, j, grid);
                }
            }
        }
        return perimeter;
    }
    private int UpAndDown(int i, int j, int[][] grid){
        int perimeter = 0;

        // up
        if (i == 0){
            perimeter++;
        }else {
            if (grid[i - 1][j] != 1) perimeter++;
        }
        // down
        if (i == grid.length - 1){
            perimeter++;
        }
        else {
            if (grid[i + 1][j] != 1) perimeter++;
        }
        return perimeter;
    }
    private int LeftAndRight(int i, int j, int[][] grid){
        int perimeter = 0;
        // left
        if (j == 0){
            perimeter++;
        }
        else {
            if (grid[i][j - 1] != 1) perimeter++;
        }
        // right
        if (j == grid[0].length - 1){
            perimeter++;
        }
        else {

            if (grid[i][j + 1] != 1) perimeter++;
        }
        return perimeter;
    }
}
