package Homework1;

import java.util.Scanner;

/**
 * Created by User on 19/02/2017.
 */
public class ReversingText
{
    public static void main(String args[])
    {
        String original;
        String reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the string to reverse");
        original = in.nextLine();

        int length = original.length();
        for (int i = length -1 ; i >= 0 ; i--)
            reverse = reverse + original.charAt(i);

        System.out.println("Reverse of string is:" +reverse);
    }
}

