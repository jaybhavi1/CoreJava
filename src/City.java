import java.util.Scanner;

/**
 * Created by User on 25/02/2017.
 */
public class City {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter city name");
        String cityName = "";
        cityName = in.nextLine();
        String London = "London";
        String NewYork = "NewYork";
        String Tokyo = "Tokyo";
        if (cityName == London) {
            System.out.println("you are in UK");
        } else if (cityName == NewYork) {
            System.out.println("ypu are in Usa");
        } else if (cityName == Tokyo) {
            System.out.println("you are in Japan");
        } else {
            System.out.println(" wrong city name city not in nato country");
        }
    }
}