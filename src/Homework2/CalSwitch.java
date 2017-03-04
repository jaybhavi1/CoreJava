package Homework2;

import java.util.Scanner;

/**
 * Created by User on 26/02/2017.
 */
public class CalSwitch
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter value of first number\t\t:");
        int a=in.nextInt();
        System.out.print("Enter value of second number\t:");
        int b=in.nextInt();
        System.out.print("Enter  + for Addition, - for Subtraction, * for Multiplication, / for Division \t:");
        String x=in.next();
        int c;
        double d;
        switch (x) {
            case "+":
                c = a + b;
                System.out.println("\nThe Addition of Two number is\t: " + c);
                break;
            case "-":
                c = a - b;
                System.out.println("\nThe Subtraction of Two number is\t: " + c);
                break;
            case "*":
                c = a * b;
                System.out.println("\nThe Multiplication of Two number is\t: " + c);
                break;
            case "/":
                double y = a, z = b;
                d = y / z;
                System.out.println("\nThe Division of Two number is\t: " + d);
                break;
            default:
                System.out.println("\nInvalid input Symbol");
        }
    }
}


