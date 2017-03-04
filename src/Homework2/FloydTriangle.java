package Homework2;

import java.util.Scanner;

/**
 * Created by User on 27/02/2017.
 */
public class FloydTriangle
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("\nNumber of rows for Floyd's Triangle : ");
        int x=sc.nextInt();
        int a=1;
        System.out.println("\n**************************");
        for(int i=0; i<x; i++)
        {
            for (int j=1; j <=(i+1) ; j++)
            {
                System.out.print(" "+a);
                a=a+1;
            }
            System.out.println(" ");
        }

    }
}
