package Homework2;

import java.util.Scanner;

/**
 * Created by User on 26/02/2017.
 */
public class WeekDay
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any Number Between 1 to 7\t:");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("\nDay of week is Monday");
                break;
            case 2:
                System.out.println("\nDay of week is Tuesday");
                break;
            case 3:
                System.out.println("\nDay of week is Wednesday");
                break;
            case 4:
                System.out.println("\nDay of week is Thursday");
                break;
            case 5:
                System.out.println("\nDay of week is Friday");
                break;
            case 6:
                System.out.println("\nDay of week is Saturday");
                break;
            case 7:
                System.out.println("\nDay of week is Sunday");
            default:
                System.out.println("Invalid input There is 7 days of week");
        }

    }
}
