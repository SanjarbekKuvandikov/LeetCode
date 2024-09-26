package com.epam;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rowsMatrix1 = matrix1.length;
        int colsMatrix1 = matrix1[0].length;
        int colsMatrix2 = matrix2[0].length;

        int[][] result = new int[rowsMatrix1][colsMatrix2];

        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < colsMatrix2; j++) {
                for (int k = 0; k < colsMatrix1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
