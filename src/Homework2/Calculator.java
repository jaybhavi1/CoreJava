package Homework2;

import java.util.Scanner;

/**
 * Created by User on 26/02/2017.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter value of first number\t\t:");
        int a = in.nextInt();
        System.out.print("Enter value of Second number\t:");
        int b = in.nextInt();
        System.out.print("Enter  + for Addition, - for Subtraction, * for Multiplication, / for Division :");
        String x = in.next();
        int c;
        double d;
        if (x.equals("+")) {
            c = a + b;
            System.out.println("\n The Addition of Two number is\t: " + c);
        } else if (x.equals("-")) {
            c = a - b;
            System.out.println("\n The Subtraction of Two number is\t: " + c);
        } else if (x.equals("*")) {
            c = a * b;
            System.out.println("\n The Multiplication of Two number is\t: " + c);
        } else if (x.equals("/")) {
            double y = a, z = b;
            d = y / z;
            System.out.println("\n The Division of Two number is\t: " + d);
        } else {
            System.out.println("\n Invalid input Symbol");
        }
    }
}
