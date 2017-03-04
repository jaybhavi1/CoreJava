package Homework2;

import java.util.Scanner;

/**
 * Created by User on 26/02/2017.
 */
public class FindDiigit
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("\nInput any Value \t:");
       String character =sc.next();
       char ch= character.charAt(0);
       if (Character.isDigit(ch))
       {
           System.out.println("\nThe input value is Digit");
       }else if (Character.isLetter(ch))
       {
           System.out.println("\nThe input value is an Alphabet");
       }else
           {
               System.out.println("\nThe input value is Symbol");
           }
    }
}
