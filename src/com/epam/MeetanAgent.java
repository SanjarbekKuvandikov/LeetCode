package com.epam;

import java.util.Scanner;

public class MeetanAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int correctPasswordTest = in.nextInt();
        if (PASSWORD ==  correctPasswordTest){
            System.out.println("Hello, Agent");
        }else {
            System.out.println("Access denied");
        }


    }
}
