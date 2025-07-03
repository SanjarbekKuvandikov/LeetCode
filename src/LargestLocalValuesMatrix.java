import java.util.ArrayList;
import java.util.List;

public class LargestLocalValuesMatrix {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = Integer.MIN_VALUE;

                for (int x = i; x <= i + 2; x++) {
                    for (int y = j; y <= j + 2; y++) {
                        max = Math.max(max, grid[x][y]);
                    }
                }
                list.add(max);

            }
        }
        int x = grid.length - 2;
        int y = grid[0].length - 2;
        int[][] maxLocal = new int[x][y];
        int count = 0;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                maxLocal[i][j] = list.get(count);
                count++;
            }
        }
        return maxLocal;
    }
}
