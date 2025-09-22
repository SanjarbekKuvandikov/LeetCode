import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public List<List<Integer>>  shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();

        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < k; i++){

            int last = grid[n - 1][m - 1];

            for (int j = n - 1; j >= 0; j--) {
                for (int l = m - 1; l >= 0; l--) {
                    if (l == 0 && j - 1 >= 0){
                        grid[j][l] = grid[j - 1][m - 1];
                    }else if (l - 1 >= 0){
                        grid[j][l] = grid[j][l - 1];
                    }
                }
            }
            grid[0][0] = last;
        }

        for (int[] ints : grid) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                list.add(ints[j]);
            }
            result.add(list);
        }

        return result;
    }
}
