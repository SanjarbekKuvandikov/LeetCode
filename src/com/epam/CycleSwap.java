package com.epam;

public class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int lastElement = array[array.length - 1];
        System.arraycopy(array, 0, array, 1, array.length - 1);

        array[0] = lastElement;
    }

    static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length <= 1 || shift == 0) {
            return;
        }
        shift = shift % array.length;
        if (shift == 0) {
            return;
        }
        int[] part1 = new int[array.length - shift];
        int[] part2 = new int[shift];

        System.arraycopy(array, 0, part1, 0, array.length - shift);
        System.arraycopy(array, array.length - shift, part2, 0, shift);

        System.arraycopy(part2, 0, array, 0, shift);
        System.arraycopy(part1, 0, array, shift, part1.length);
    }
}
