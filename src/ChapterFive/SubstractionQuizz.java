package ChapterFive;

import java.util.Scanner;

public class SubstractionQuizz {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
//        int countOfCorrectQuestion = 0;
        int countOfQuestionsAsked = 0;
        String output = " ";
        Scanner input = new Scanner(System.in);
        while (countOfQuestionsAsked < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 > number2 || number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("What is " + number1 + " + " + number2 + "? :");
            int answer = input.nextInt();
            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
            } else
                System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
            countOfQuestionsAsked++;
            output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 + number2 == answer) ? " correct" : " wrong");
        }

//        System.out.println("Correct count is " + countOfCorrectQuestion + output);
    }
}


