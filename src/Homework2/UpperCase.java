package Homework2;

import java.util.Scanner;

/**
 * Created by User on 19/02/2017.
 */
public class UpperCase
{
    public static void main(String[] args)
    {
        String changeCase = "";
        Scanner in = new Scanner(System.in);
        System.out.println( "\nEnter the an Alphabet in Upper case ");
        changeCase = in.nextLine();
        String result;
        result =changeCase.toLowerCase();
        System.out.println( result);

    }
}
