import java.util.Scanner;

/**
 * Created by User on 25/02/2017.
 */
public class OddNumber
{

    public static void main (String [] args)
    {
        int a;
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter number");
        a=in.nextInt();

     if (a< 0)
     {
         System.out.println("invalid input");

     }else if(a % 2 ==0)
         {
             System.out.println("Number is even");
         }else
             {
                 System.out.println("Number is odd");
             }

    }

}
