package Homework2;

import java.util.Scanner;

/**
 * Created by User on 25/02/2017.
 */
public class MarkSheet
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student Name      \t \t:\t");
        String name = scanner.next();
        System.out.print("Enter Student Roll Number \t\t:\t");
        String roll = scanner.next();
        System.out.print("Enter Marks of Subject Maths \t:\t");
        int s1 =scanner.nextInt();
        if(s1<0)
        {   System.out.print("Invalid input Marks should not be negative");
            System.out.print("\nPlease enter correct marks\t\t:");
            s1=scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject Science\t:\t");
        int s2 =scanner.nextInt();
        if(s2<0)
        {   System.out.print("Invalid input Marks should not be negative");
            System.out.print("\nPlease enter correct marks\t\t:");
            s2=scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject English\t:\t");
        int s3 =scanner.nextInt();
        if(s3<0)
        {   System.out.print("Invalid input Marks should not be negative");
            System.out.print("\nPlease enter correct marks\t\t:\t");
            s3=scanner.nextInt();
        }
        int total;
        float p;
        total=s1+s2+s3;
        p = total/3;

        System.out.print("\n\n\t\t MarkSheet");
        System.out.print("\n________________________________________");
        System.out.print("\n\tName\t\t:\t"+name);
        System.out.print("\n\tRoll No\t\t:\t"+roll);
        System.out.print("\n________________________________________");
        System.out.print("\n\tSubjects\t:\tMarks");
        System.out.print("\n________________________________________");
        System.out.print("\n\tMaths\t\t:\t"+s1);
        System.out.print("\n\tScience\t\t:\t"+s2);
        System.out.print("\n\tEnglish\t\t:\t"+s3);
        System.out.print("\n________________________________________");
        System.out.print("\n\tTotal\t\t:\t"+total);
        System.out.print("\n________________________________________");
        System.out.print("\n\tPercentage\t:\t"+p);
        if (p>=35)
          {
            System.out.print("\n\tResult\t\t:\tPass");
        }else
        {
            System.out.print("\n\tResult\t\t:\tFail");
        }
        if (p>=80)
          {
              System.out.print("\n\tGrade\t\t:\t A+");
          }else if(p>=60)
              {
                  System.out.print("\n\tGrade\t\t:\t A");
              }else if (p>=50)
                  {
                      System.out.print("\n\tGrade\t\t:\t B");
                  }else if(p>=35)
                      {
                          System.out.print("\n\tGrade\t\t:\t C");
                      }
    }
}
