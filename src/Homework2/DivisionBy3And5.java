package Homework2;

/**
 * Created by User on 26/02/2017.
 */
public class DivisionBy3And5 {
    public static void main(String[] args) {
        System.out.println("\nNumber divided by 3=");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.println("\nNumber divided by 5=");
        for (int j = 1; j <= 100; j++) {
            if (j % 5 == 0) {
                System.out.print(j + ",");
            }

        }

    }
}

