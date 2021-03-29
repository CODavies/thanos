package ChapterFive;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static int greatestCommonDivisor(int firstNumberEnteredByUser, int secondNumberEnteredBYUser) {
        int greatestCommonDivisor = 1;
        int counter = 1;

        while (counter <= firstNumberEnteredByUser && counter <= secondNumberEnteredBYUser) {
            if (firstNumberEnteredByUser % counter == 0 && secondNumberEnteredBYUser % counter == 0)
                greatestCommonDivisor = counter;
            counter++;
        }
        return greatestCommonDivisor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNumberEnteredByUser = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumberEnteredBYUser = input.nextInt();
        System.out.println("The greatest common divisor for " + firstNumberEnteredByUser + " and " + secondNumberEnteredBYUser + " is " + greatestCommonDivisor(firstNumberEnteredByUser, secondNumberEnteredBYUser));
    }
}


