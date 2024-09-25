package com.epam;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (a >= h) {
            System.out.println(1);
        } else if (a <= b) {
            System.out.println("Impossible");
        } else {
            int effectiveClimbPerDay = a - b;
            int days = (h - b + effectiveClimbPerDay - 1) / effectiveClimbPerDay;
            System.out.println(days);
        }
    }
}
