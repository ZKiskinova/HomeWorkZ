package org.example;

import java.util.Scanner;

public class MyThirdHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// First Task
        System.out.println("Please fill up first integer a");
        int a= scanner.nextInt();
        System.out.println("Please fill up second integer b");
        int b = scanner.nextInt();
        System.out.println("Please fill up third integer c");
        int c = scanner.nextInt();


        if (a == b && b == c){
            System.out.println(" All three integers are equal ");

        }
       if ( a > b && b >= c){
           System.out.println(" a is the largest number ");

       } if (b > c && c >= a){
            System.out.println(" b is the largest number ");

       } if (c > a && a >= b){
           System.out.println(" c is the largest number ");

       } if (a == b  && a > c){
            System.out.println(" a and b are the largest numbers ");

        } if ( a == c && a> b) {
            System.out.println(" a and c are the largest numbers ");

        } if ( b == c && b> a) {
            System.out.println(" b and c are the largest numbers ");

    }
         ////Second Task

        int length = a;
        int width = b;
        System.out.println("-----------------------------------");
        System.out.print (" If a is length of rectangle and b is its wight in meters:\n");
        System.out.print (" The Perimeter of rectangle is " + 2*(length+width) + "m\n" );
        System.out.print (" The Square of rectangle is " + length*width + "sqm\n");


        System.out.println("-----------------------------------");


        //// Third task
        if (a % 2 == 1){
            System.out.println(" a is odd integer ");

    }   if (a % 2 == 0){
            System.out.println(" a is evently integer ");


    }
           ///// Fourth task

            switch (a){
                case 1:
                    System.out.print("Today is Monday\n");
                    break;
                case 2:
                    System.out.print("Today is Tuesday");
                    break;
                case 3:
                    System.out.print("Today is Wednesday");
                    break;
                case 4:
                    System.out.print("Today is Thursday");
                    break;
                case 5:
                    System.out.print("Today is Friday");
                    break;
                case 6:
                    System.out.print("Today is Sunday");
                    break;
                case 7:
                    System.out.print("Today is Saturday");
                    break;
                default:
                    System.out.print("Incorrect information");
}

    }

}