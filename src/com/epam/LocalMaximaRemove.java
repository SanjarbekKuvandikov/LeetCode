package com.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        List<Integer> resultList = new ArrayList<>();
        if (array[0] <= array[1]) {
            resultList.add(array[0]);
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (!(array[i] > array[i - 1] && array[i] > array[i + 1])) {
                resultList.add(array[i]);
            }
        }
        if (array[array.length - 1] <= array[array.length - 2]) {
            resultList.add(array[array.length - 1]);
        }
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
