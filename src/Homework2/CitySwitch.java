package Homework2;

import java.util.Scanner;

/**
 * Created by User on 26/02/2017.
 */
public class CitySwitch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter city name\t:");
        String city = sc.next().toLowerCase();
        switch (city)
        {
            case "a":
                System.out.println("\n The City Name is Ahmedabad");
                break;
            case "b":
                System.out.println("\n The City Name is Bombay");
                break;
            case "c":
                System.out.println("\n The City Name is Channai");
                break;
            case "d":
                System.out.println("\n The City Name is Delhi");
                break;
            case "e":
                System.out.println("\n The City Name is Eddingburo");
                break;
            case "f":
                System.out.println("\n The City Name is Faridabad ");
                break;
            default:
                System.out.println("\nInvalid input Character");




        }

    }
}
