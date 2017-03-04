package Homework1;

/**
 * Created by User on 19/02/2017.
 */
public class Smallest
{
    public static void small ( int a,int b,int c)
    {
        if (a<b & a<c)
        {
            System.out.println("The Homework1.Smallest number is " +a);
        }else if(b<c & b<a)
           {
            System.out.println("The Homework1.Smallest number is " +b);
           }else if(c<a & c<b)
              {
            System.out.println("The Homework1.Smallest number is " +c);
              }
    }
    public static void main(String[] args)
    {
        Smallest.small(11,17,45);
    }
}

