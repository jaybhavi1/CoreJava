package Homework2;

import java.util.Scanner;

/**
 * Created by User on 25/02/2017.
 */
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter Year in YYYY Format\t:");
        int y=scanner.nextInt();
        String compare = y%4==0 ? +y+" is a Leap year": +y+ " is not a Leap year";
        System.out.println(compare);

    }
}
