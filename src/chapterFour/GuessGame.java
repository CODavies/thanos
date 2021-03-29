package chapterFour;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        int numberToGuess =(int) (Math.random() * 101);
        int userNumber = -1;
        Scanner input = new Scanner(System.in);

        while (userNumber != numberToGuess) {
            System.out.println("Enter number to guess");
            userNumber = input.nextInt();
               if (userNumber == numberToGuess)
                System.out.println("Correct");

            else if (userNumber > numberToGuess)
                System.out.println("Try again, too high");
            else {
                System.out.println("Try again, too low");
            }


        }
    }
}







