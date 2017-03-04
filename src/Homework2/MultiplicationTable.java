package Homework2;

import java.util.Scanner;

/**
 * Created by User on 28/02/2017.
 */
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput number (Table to be Calculated)\t:\t");
        int x=sc.nextInt();
        int sum=0;
        System.out.println("The Multiplication  Table of :"+x);
        for (int i=0;i<=x;i++)
        {
            System.out.println(x+" * "+i+" = " +sum);
            sum=x*(i+1);

        }

    }
}
