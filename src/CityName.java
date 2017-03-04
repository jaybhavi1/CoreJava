import java.util.Scanner;

/**
 * Created by User on 25/02/2017.
 */
public class CityName
{
    public static void main(String[] args)
    {

     Scanner in = new Scanner(System.in) ;
     System.out.println("Enter city name");
     String cityName="";
     cityName=in.nextLine();
     if(cityName.equals("London"))
     {
         System.out.println("you are in UK");
     }else if(cityName.equals("Newyork"))
        {
         System.out.println("ypu are in Usa");
        }else if(cityName.equals("NewDelhi"))
           {
               System.out.println("ypu are in india");
           }else if(cityName.equals("Tokyo"))
               {
                   System.out.println("you are in Japan");
               }else

              System.out.println(" wrong city name city not in nato country");
     }

    }


