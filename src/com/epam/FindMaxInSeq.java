package com.epam;

import java.util.Scanner;
public class FindMaxInSeq {

    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int maxValue = Integer.MIN_VALUE;
        int value;
        while ((value = scanner.nextInt()) != 0) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int maxValue = max();
        System.out.println("Maximum value: " + maxValue);
    }
}
