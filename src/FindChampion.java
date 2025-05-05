public class FindChampion {
    public int findChampion(int[][] grid) {
        int index = 0;
        int max = 0;
        for (int i = 0; i < grid.length; i++){
            int sum = 0;
            for (int j = 0; j < grid[i].length; j++){
                sum += grid[i][j];
            }
            if (sum > max){
                index = i;
                max = sum;
            }
        }

        return index;
    }
}
