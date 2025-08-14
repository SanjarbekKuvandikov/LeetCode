public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix[0].length - 1;
        int[] arr = new int[n];
        System.arraycopy(matrix[0], 0, arr, 0, n);
        for (int i = 1; i < matrix.length; i++){
            int[] current = new int[n];
            int index = 0;
            for (int j = 1; j < matrix[0].length; j++){
                current[index] = matrix[i][j];
                index++;
            }
            if (!isEquuel(arr,current)) return false;
            System.arraycopy(matrix[i], 0, arr, 0, n);
        }

        return true;
    }
    private boolean isEquuel(int[] arr, int[] curr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != curr[i]) return false;
        }
        return true;
    }
}
