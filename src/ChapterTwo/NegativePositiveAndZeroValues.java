package ChapterTwo;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        if (firstNumber == 0) {
            firstNumber = zeroNumber++;
        }
        if (firstNumber > 0) {
            firstNumber = positiveNumber++;
        }
        if (firstNumber < 0) {
            firstNumber = negativeNumber++;
        }

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        if (secondNumber == 0) {
            secondNumber = zeroNumber++;
        }
        if (secondNumber > 0) {
            secondNumber = positiveNumber++;
        }
        if (secondNumber < 0) {
            secondNumber = negativeNumber++;
        }

        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();
        if (thirdNumber == 0) {
            thirdNumber = zeroNumber++;
        }
        if (thirdNumber > 0) {
            secondNumber = positiveNumber++;
        }
        if (thirdNumber < 0) {
            thirdNumber = negativeNumber++;
        }

        System.out.print("Enter fourth number: ");
        int fourthNumber = input.nextInt();
        if (fourthNumber == 0) {
            fourthNumber = zeroNumber++;
        }
        if (fourthNumber > 0) {
            fourthNumber = positiveNumber++;
        }
        if (fourthNumber < 0) {
            firstNumber = negativeNumber++;
        }

        System.out.print("Enter fifth number: ");
        int fifthNumber = input.nextInt();
        if (fifthNumber == 0) {
            fifthNumber = zeroNumber++;
        }
        if (fifthNumber > 0) {
            fifthNumber = positiveNumber++;
        }
        if (fifthNumber < 0) {
            fifthNumber = negativeNumber++;
        }

        System.out.println("The sum of positive number is: " + positiveNumber + "\n" + "The sum of Negative is: " + negativeNumber + "\n " + "The sum of Zero numbers is: " + zeroNumber);
    }

}
