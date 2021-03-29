package chapterFour;

import java.util.Scanner;

public class RegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double sizeEnteredByUser = input.nextDouble();
        double s = 2 * sizeEnteredByUser * Math.sin(Math.PI / 6);
        System.out.println("Enter number of sides: ");
        double numberOfSides = input.nextDouble();
        double area = numberOfSides * Math.pow(s, 2);
        double denominator = 4 * Math.tan(Math.PI / numberOfSides);
        double vertex = area / denominator;
        System.out.printf("The area of the polygon is %5.2f ", vertex);

    }
}
