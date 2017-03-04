package Homework2;

import java.util.Scanner;

/**
 * Created by User on 25/02/2017.
 */
public class OddNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter First Number\t:");
        int a = scanner.nextInt();
        System.out.print("\nEnter Second Number\t:");
        int b = scanner.nextInt();
        String compare= a%2==0 ?  +a+ " is Even Number" : +a+ " is Odd Number";
        String compare1 = b%2==0? +b+ " is Even Number" : +b+ " is Odd Number";
        System.out.println(compare);
        System.out.println(compare1);
    }
}
