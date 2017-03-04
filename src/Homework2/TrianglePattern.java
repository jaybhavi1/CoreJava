package Homework2;

import java.util.Scanner;

/**
 * Created by User on 27/02/2017.
 */
public class TrianglePattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput number of rows\t:");
        int x=sc.nextInt();
        for (int i =1; i <=x+1 ; i++)
        {
            for(int j=x;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=(i-1) ; k++)
            {
                System.out.print(" "+k);
            }
            System.out.println("");
        }

    }
}
