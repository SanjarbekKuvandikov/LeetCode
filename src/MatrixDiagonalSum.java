public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum_diagonal = 0;

        for (int i = 0; i < mat.length; i++){

            sum_diagonal += mat[i][i];

            if (i != mat.length - 1 - i) {
                sum_diagonal += mat[i][mat.length - 1 - i];
            }
        }

        return sum_diagonal;
    }
}
