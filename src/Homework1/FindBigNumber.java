package Homework1;

import java.util.Scanner;

/**
 * Created by User on 19/02/2017.
 */
public class FindBigNumber
{
    public static void biggest ( )
       {
           int a,b,c;
           Scanner in = new Scanner(System.in);// object created
           System.out.println("Enter Three number ");
           a=in.nextInt();
           b=in.nextInt();
           c=in.nextInt();

        if (a>b & a>c)
         {
            System.out.println("The biggest number is " +a);
         }else if(b>c & b>a)
             {
                 System.out.println("The biggest number is " +b);
             }else if(c>a & c>b)
                {
                    System.out.println("The biggest number is " +c);
                }
       }
    public static void main(String[] args)
    {
        FindBigNumber.biggest();
    }
}
