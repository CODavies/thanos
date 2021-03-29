package Chapter2;

import java.util.Scanner;

public class FindingRunwayLength {
    public static void main(String[] args) {
        Scanner davies = new Scanner(System.in);
        System.out.println("Enter speed");
double speedEnteredByUser = davies.nextDouble();
        System.out.println("Enter acceleration");
double accelerationEnteredByUser = davies.nextDouble();
double v= (speedEnteredByUser * speedEnteredByUser)/ (2 * accelerationEnteredByUser);
        System.out.printf("The minimum runway length for this airplane is %.2f\n", v);


    }
}
