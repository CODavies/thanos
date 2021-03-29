package ChapterThree;

import java.util.Random;
import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if (number1 > number2 || number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }


        System.out.print("What is " + number1 + " + " + number2 + "? :");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
        System.out.print("What is " + number1 + " - " + number2 + "? :");
        int answer2 = input.nextInt();
        if (number1 - number2 == answer2)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
        }
    }

//Random random = new Random();
//    // Generates random integers 0 to 49
//    int x = random.nextInt(50);
//    // Generates random integers 0 to 999
//    int y = random.nextInt(50);
//    {
//        System.out.println("Randomly Generated Integers Values");
//    }

}




