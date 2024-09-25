package com.epam;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int friends = sc.nextInt();
        if (money < 0){
            System.out.println("Bill total amount cannot be negative");
        }else if (friends <= 0){
            System.out.println("Number of friends cannot be negative or zero");
        }else {
            money += ((money * 10)/100);
            money = money/friends;
            System.out.println(money);

        }
    }
}
