package com.epam;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        /*
         * We need to find the LCM of a and b and divide it by b.
         * This is given by (a * b) / (b * gcd(a, b)).
         * Simplifying by canceling out b, we get a / gcd(a, b).
         */
        System.out.println(a / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
