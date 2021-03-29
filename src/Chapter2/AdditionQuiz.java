package Chapter2;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        System.out.println("  \"What is \" + number1 + \" + \" + number2 + \"? \"");
        System.out.print("What is " + number1 + " - " + number2 + " :- ");
        int number = add.nextInt();
//        System.out.println(number1 + " + " + number2 + " = " + number + " is " + (number1 + number2 == number));
        System.out.println(number1 + " - " + number2 + " = " + number + " is " + (number1 - number2 == number));
    }
}

