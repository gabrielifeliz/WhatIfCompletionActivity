package com.company;

/*  PairProcess.java

    This program outputs the sum, product and average of num1 and num2.
    If the calculated sum is over 200, print an asterisk next to the sum.

    Bonus (+1) If the calculated sum is under 1000
    it should have a tilde ~ printed next to it.
 */
import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args) {

        /* Add the variables sum and product as int to calculate sum and product
            of the two numbers entered by the user
        */
        int num1, num2, sum, product;
        /* Add the variable average as double to calculate average
            of the two numbers entered by the user
        */
        double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? " );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  " );
        num2 = keyboard.nextInt();

        // Calculate sum, product, and average of number one and number two
        sum = num1 + num2;
        product = num1 * num2;
        average = sum / 2;

        System.out.println();
        if (sum > 200)
            System.out.println("The sum of the two numbers is " + sum + "*");
        else if (sum < 1000) {
            System.out.println("The sum of the two numbers is " + sum + "~");
        }
        System.out.println("The product of the two numbers is " + product);
        System.out.println("The average of the two numbers is " + average);
    }
}