package Homework2;

import java.util.Scanner;

/**
 * Created by User on 26/02/2017.
 */
public class Average
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter five Number:\t");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double average;
        average=(a+b+c+d+e)/5;
                System.out.println("The average of Five number :\t"+average);
    }
}
