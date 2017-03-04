/**
 * Created by User on 20/02/2017.
 */
public class Assignment1
{
    int x=15;  // instance variables
    int y=35;

    static void m1()    // static method
    {
        Assignment1 a = new Assignment1();  // object create
        System.out.println(a.x);
        System.out.println(a.y);            // declare variable using object
    }
    static void m2()   // static method
    {
        Assignment1 b= new Assignment1();
        System.out.println(b.x);
        System.out.println(b.y);

    }

    public static void main(String[] args)  //main method static type
    {

        Assignment1.m1();   // call method m1 & m2 using class name
        Assignment1.m2();
    }
}
