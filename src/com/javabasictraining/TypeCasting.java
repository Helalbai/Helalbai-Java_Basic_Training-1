package com.javabasictraining;

public class TypeCasting {
    public static void main(String[] args) {

        // Java Type Casting
        //Type casting is when you assign a value of one primitive data type to another type.
        //In Java, there are two types of casting:

        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double

        byte a = 65;
        short b = a;
        char c;
        c = (char) b;
        System.out.println("Widening Casting: " + c);

        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte

//        double c = 5.5;
//        int d = (int)c;
//        System.out.println("Narrowing Casting: " + d);



    }
}
