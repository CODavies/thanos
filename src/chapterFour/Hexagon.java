package chapterFour;

import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double sizeEnteredByUser = input.nextDouble();
        double s = 2 * sizeEnteredByUser * Math.sin(Math.PI / 6);
        double area = 6 * Math.pow(s, 2);
        double denominator = 4 * Math.tan(Math.PI / 6);
        double vertex = area / denominator;
        System.out.printf("The area of the pentagon is %5.2f ", vertex);

    }
}