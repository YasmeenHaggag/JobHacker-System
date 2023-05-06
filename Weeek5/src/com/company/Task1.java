package com.company;

import java.util.Scanner;

public class Task1 {
    Scanner input=new Scanner(System.in);

    public void task1() {
        int num1 = 0, num2 = 0;
        boolean flag = true;
        while (flag) {
            try {
                num1 = input.nextInt();
                num2 = input.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Enter numeric value");
                input.nextLine();
            }
        }
        System.out.println(num1 + num2);
    }
}
