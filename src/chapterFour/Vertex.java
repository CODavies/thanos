package chapterFour;

import java.util.Scanner;

public class Vertex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        double lengthEnteredByUser = input.nextDouble();
        double s = 2 * lengthEnteredByUser * Math.sin(Math.PI/5);
        double area = 5 * Math.pow(s, 2);
        double denominator = 4 * Math.tan(Math.PI/5);
        double vertex = area/ denominator;

        System.out.printf("The area of the pentagon is %5.2f ", vertex);

    }

}
