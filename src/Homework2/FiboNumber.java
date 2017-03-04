package Homework2;

import java.util.Scanner;

/**
 * Created by User on 27/02/2017.
 */
public class FiboNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput Number to make Fibonacci number :");
        int x=sc.nextInt();
        int a=1,b=1,c;
        System.out.println("\nThe Fibonacci series are:");
        for (int i = 0; i <x ; i++)
        {
            System.out.print(a+" ");
             c=a+b;
             a=b;
             b=c;
        }
    }
}
