package Homework1;

/**
 * Created by User on 19/02/2017.
 */
public class MarkSheet
{

    public static void main (String args[])
    {
        int mark = 100;
        if ( mark > 100)
        {
            System.out.println(" Marks should not be more than 100");

        }else if ( mark<=100 & mark >= 70)
             {
            System.out.println("The student get Distinction");

             }else if ( mark >=69 & mark >= 60)
                 {
                 System.out.println("The student get First class");

                  }else if ( mark>=59 & mark >= 35)
                      {
                          System.out.println("The Student get Pass Class");

                      }else if (mark<=34 & mark >= 0)
                          {
                              System.out.println("The student is Fail");
                          }else
                              {
                                   System.out.println("The marks should not be Negative");
                              }



    }
}
