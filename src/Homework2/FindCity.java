package Homework2;

import java.util.Scanner;

/**
 * Created by User on 26/02/2017.
 */
public class FindCity
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter city name\t:");
        String city = sc.next();
        if (city.equalsIgnoreCase("a") )
        {
            System.out.println("City name = Ahmedabad");
        } else if (city.equalsIgnoreCase("b") )
          {
            System.out.println("City name = Bombay");
          } else if (city.equalsIgnoreCase("c") )
            {
            System.out.println("City name = Culcatta");
            } else if (city.equalsIgnoreCase("d"))
              {
                System.out.println("City name = Delhi");
              } else if (city.equalsIgnoreCase("e"))
                  {
                   System.out.println("City name = Eddingbaro");
                  } else if (city.equalsIgnoreCase("f"))
                     {
                      System.out.println("City name = France");
                     } else
                         {
                          System.out.println("Input not valid Should be Between A to F");
                         }
    }
}
