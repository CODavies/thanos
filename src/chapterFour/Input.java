package chapterFour;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int totalScore = 0;
        int score;
        int totalNumberOfInputsCollected = 0;

        while (totalNumberOfInputsCollected < 3) {
            System.out.println("Enter a number");
            score = userInput.nextInt();
            totalScore = totalScore + score;

            totalNumberOfInputsCollected++;

        }
    double average = totalScore/(totalNumberOfInputsCollected * 1.0);

        System.out.println(average);

    }
}