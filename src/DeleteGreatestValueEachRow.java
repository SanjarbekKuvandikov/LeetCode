

public class DeleteGreatestValueEachRow {
    public int deleteGreatestValue(int[][] grid) {
        int n = 0;
        int sum = 0;

        while (n < grid[0].length) {

            int maxInRow = Integer.MIN_VALUE;

            for (int[] ints : grid) {
                int max = Integer.MIN_VALUE;
                int index = -1;
                for (int j = 0; j < grid[0].length; j++) {
                    if (max < ints[j]) {
                        max = ints[j];
                        index = j;
                    }
                }
                ints[index] = -1;
                maxInRow = Math.max(maxInRow,max);
            }

            sum += maxInRow;
            n++;
        }
        return sum;
    }
}
