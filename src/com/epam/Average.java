package com.epam;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int averageValue = calculateAverage();
        System.out.println(averageValue);
    }
    public static int calculateAverage() {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int count = 0;
        int value;
        while ((value = scanner.nextInt()) != 0) {
            average += value;
            count++;
        }
        return  (average / count);
    }
}
