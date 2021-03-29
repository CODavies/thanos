package Chapter2;

import java.nio.file.Watchable;
import java.util.Scanner;

public class ComputingBMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double onePound =  0.45359237;
        double oneInche =  0.0254;
        System.out.println("Enter weight in pounds: ");
        System.out.println("Enter height in inches: ");
        double weight_In_Pounds = in.nextDouble();
        double height_In_Inches = in.nextDouble();
        double weightInKg = weight_In_Pounds * onePound;
        double heightInKG = height_In_Inches * oneInche;
       double BMI = weightInKg/(heightInKG * heightInKG);
        System.out.println("BMI is " + BMI);
    }
}
