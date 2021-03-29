package chapterFour;

import java.io.InputStream;
import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        InputStream src;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first city: ");
        String firstCityEnteredByUser = input.nextLine();
        System.out.println("Enter a second city: ");
        String secondCityEnteredByUSer = input.nextLine();
        if(firstCityEnteredByUser.compareTo(secondCityEnteredByUSer) < 0)
        System.out.println("The cities in alphabetical order are " + firstCityEnteredByUser + " and " + secondCityEnteredByUSer);
        else
            System.out.println("The cities in alphabetical order are " + secondCityEnteredByUSer + " and " + firstCityEnteredByUser);
    }
}
