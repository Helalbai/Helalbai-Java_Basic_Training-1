package com.javabasictraining;

public class Conditional {

    public static void main(String[] args) {

        //   && Conditional-AND
        //   || Conditional-OR

        int a = 5;
        int b = 7;

        if ((a == 5) && (b == 7));
        System.out.println("a is 5 and b is 7");

        if ((a == 5) || (b == 7));
        System.out.println("a is 5 and b is 7");

        int c = 5;
        int d = 7;

        int result;

        boolean someCondition = true;
        result = someCondition ? c : d;

        System.out.println(result);




    }
}
