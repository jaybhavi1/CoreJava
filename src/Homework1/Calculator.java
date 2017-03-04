package Homework1;

import java.util.Scanner;

/**
 * Created by User on 18/02/2017.
 */
public class Calculator
{
    public void addition ( )
    {
        int a,b;
        Scanner in = new Scanner(System.in);// object created
        System.out.println("Enter value of A");
        a=in.nextInt();
        System.out.println("Enter value of B");
        b=in.nextInt();
        ans=a+b;
        System.out.println("The Addition of " +a+ " and " +b+ " = " +ans);

    }

    static int ans;
 // addition calculation
    // multiplication method
    public void subtraction ( )
    {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of A");
        a=in.nextInt();
        System.out.println("Enter value of B");
        b=in.nextInt();
        ans= a-b;
        System.out.println("The Subtraction of " +a+ " and " +b+ " = " +ans);
    }

 // subtraction calculation

    static void multiplication( )
      {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of A");
        a=in.nextInt();
        System.out.println("Enter value of B");
        b=in.nextInt();
        ans= a*b;
        System.out.println("The Multiplication of " +a+ " and " +b+ " = " +ans);
      }

 //division method
    private static void division()
      {
        double a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of A");
        a=in.nextInt();
        System.out.println("Enter value of B");
        b=in.nextInt();
        double Result;
        Result =a/b;
        System.out.println("The Division of " +a+ " and " +b+ " = " +Result);
      }


    public static void main (String args[])
      {

        int x1;

       Scanner in = new Scanner(System.in);
       System.out.println("Enter  1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division ");
        x1 = in.nextInt();
        Calculator add = new Calculator();
       if (x1==1)
       {
           add.addition();
       }else if (x1==2)
           {
            add.subtraction();
           }else if (x1==3)
               {
                Calculator.multiplication();
               }else if (x1==4)
                   {
                    Calculator.division();
                   }else

                       System.out.println("Invalid input");

      }
}
