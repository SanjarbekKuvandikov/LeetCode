import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();
        for (int [] nums : matrix){
            int index = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < nums.length; i++){
                if (min > nums[i]){
                    index = i;
                    min = nums[i];
                }
            }
            if (min == maxInColumn(index,matrix)){
                lucky.add(min);
            }
        }
        return lucky;
    }
    private int maxInColumn(int index, int[][] matrix) {
        int max = Integer.MIN_VALUE;
        if (index >= 0 && index < matrix[0].length) {
            for (int[] ints : matrix) {
                if (max < ints[index]) {
                    max = ints[index];
                }
            }
        }
        return max;
    }
}
