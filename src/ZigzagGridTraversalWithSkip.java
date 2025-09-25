import java.util.ArrayList;
import java.util.List;

public class ZigzagGridTraversalWithSkip {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int row = 0;
        int left, right = 0;

        while (row < grid.length){
            if (row % 2 == 0){
                right = 0;
                while (right < grid[0].length){
                    result.add(grid[row][right]);
                    right += 2;
                }
            }else {
                left = Math.max(right - 1,1);
                while (left >= 0){
                    if (left < grid[0].length) result.add(grid[row][left]);
                    left -= 2;
                }
            }
            row++;
        }
        return result;
    }
}
