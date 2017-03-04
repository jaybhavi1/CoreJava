package Homework1;

import java.util.Scanner;

/**
 * Created by User on 18/02/2017.
 */
public class Circle {
    static final double Pi=3.14;
    public void radius()
    {
        double r;
        double area;
        Scanner in = new Scanner(System.in);// object created
        System.out.println("Enter radius of Homework1.Circle R ");
        r=in.nextInt();
        area=Pi*r*r;
        System.out.println(" The Area of circle is " +area);
    }
    public static void main(String args[])
    {

        Circle area=new Circle();
        area.radius();
    }
}
