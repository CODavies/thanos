package chapterFour;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        double d = 6371.01 * Math.acos (Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos( y1 - y2));
        System.out.println("The distance between the two points is : " + Math.toRadians(d));

    }
}
