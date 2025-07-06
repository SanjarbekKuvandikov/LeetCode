public class Convert1DArrayInto2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] twoD = new int[m][n];
        int index = 0;

        for (int[] arr : twoD){
            for (int i = 0; i < arr.length; i++){
                if (index < original.length){
                    arr[i] = original[index];
                    index++;
                }
            }
        }

        return twoD;
    }
}
