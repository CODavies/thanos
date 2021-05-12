package ChapterTwo;


import java.util.Scanner;

public class SeparatingDigitsInJava {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number > 0 && number < 99999) {
            firstNumber = number / 10000;
            secondNumber = (number % 10000) / 1000;
            thirdNumber = ((number % 10000) % 1000) / 100;
            fourthNumber = (((number % 10000) % 1000) % 100) / 10;
            fifthNumber = (((number % 10000) % 1000) % 100) % 10;

            System.out.print(firstNumber + " " + secondNumber + " " + thirdNumber + " " + fourthNumber + " " + fifthNumber);
        } else {
            System.out.println("Invalid Number");
        }
    }
}

