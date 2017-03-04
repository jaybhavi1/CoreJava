package Homework1;

/**
 * Created by User on 18/02/2017.
 */
public class Triangle {

    static void area( double h,double b)
    {
        double A;
        A=(h*b)/2;
        System.out.println("If height H=" +h+ " and The Base B="+b+ " of the Homework1.Triangle Than Area of Homework1.Triangle A= " +A );

    }
    public static void main(String args[])
    {
        Triangle.area(4.77,6.7);
    }
}
