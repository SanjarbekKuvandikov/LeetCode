package com.epam;

public class SumEvenNumbers {
    public static int sum(int[] array){
        int sum = 0;
        if (array == null){
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
