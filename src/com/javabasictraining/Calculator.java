package com.javabasictraining;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("My Calculator");

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a Number ");
        int number1 = input.nextInt();

        System.out.println(" Enter a Number ");
        int number2 = input.nextInt();

        int result = number1+number2;
        System.out.println("Your Total is = " + result);
    }
}
