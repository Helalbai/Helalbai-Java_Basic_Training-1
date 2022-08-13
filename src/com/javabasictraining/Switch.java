package com.javabasictraining;

public class Switch {

    public static void main(String[] args) {

        int month = 1;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            default:
                System.out.println("No month found");


        }

        String name = "Tim";

        switch (name) {
            case "Tom":
                ;
                System.out.println("Tom Lives in Delaware");
                break;
            case "Sam":
                System.out.println("Sam Lives in USA");
                break;
            case "Kim":
                System.out.println("Kim Lives in Canada");
                break;
            case "Jim":
                System.out.println("Jim Lives in England");
                break;
            case "Tim":
                System.out.println("Tim Lives in Japan");
                break;
            default:
                System.out.println("No Name Found");
        }

        int age = 10-12;

        switch (age){
            case 10-12:
                System.out.println("Your are not allowed to drive");
                break;
            case 15:
                System.out.println("You need parents permission to drive");
                break;
            default:
                System.out.println("You can drive alon");

        }
    }
}
