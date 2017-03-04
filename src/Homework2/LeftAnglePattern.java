package Homework2;

import java.util.Scanner;

/**
 * Created by User on 27/02/2017.
 */
public class LeftAnglePattern
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("\nInput Number of Rows to make Left Angle Pattern:");
        int x=sc.nextInt();
        System.out.println("\nLeft Angle Pattern ");
        for (int i =1; i <=x+1 ; i++)
        {
            for(int j=x;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=(i-1) ; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
