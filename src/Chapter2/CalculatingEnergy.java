package Chapter2;

import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double waterInKilograms = input.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finialTemperature = input.nextDouble();
        double energyNeeded = waterInKilograms * (finialTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + energyNeeded);
    }
}
