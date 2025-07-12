public class CountNegativeNumbersSortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] ints : grid){
            count += checker(ints);
        }
        return count;
    }
    private int checker(int[] arr){
        int count = 0;
        for (int num : arr){
            if(num < 0) count++;
        }
        return count;
    }
}
