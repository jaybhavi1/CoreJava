package Homework1;

import java.util.Scanner;

/**
 * Created by User on 19/02/2017.
 */
public class Temperature
{
    public void Temp()
    {
        int f;
        double C;
        final String DEGREE = "\u00b0";
        Scanner in = new Scanner(System.in);// object created
        System.out.println("Enter temperature in " +DEGREE+ "F ");
        f=in.nextInt();
        C=(f-32)*5/9;
        System.out.println("The Homework1.Temperature " +f+DEGREE+  "F = " +C+DEGREE +  "Celsius" );
    }

    public static void main(String args[])
    {
        Temperature temp = new Temperature();
        temp.Temp();
    }
}
