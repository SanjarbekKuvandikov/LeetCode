package com.epam;

import java.io.IOException;
import java.util.Scanner;

public class MeetStrangers {
    public static void main(String[] args) throws IOException {
        Scanner i = new Scanner(System.in);
        //Write a program, asks for a number - amount of strangers to meet.
        int number = i.nextInt();
        i.nextLine();
        if (number > 0) {
            while (number > 0) {
                String name = i.nextLine();
                System.out.println("Hello, " + name);
                number--;
            }
        } else if (number == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }

        //Then reads stranger names line by line and prints line by line "Hello, ...".
    }
}
