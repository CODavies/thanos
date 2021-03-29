package ChapterThree;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int randomNumberGenerated = randomNumber.nextInt();
        for (int counter = 1; counter <= 25; counter++) {
            randomNumberGenerated =1 +  randomNumber.nextInt(6);
            System.out.printf("%d  ",randomNumberGenerated);
//            if (counter % 5 == 0)
                System.out.println();

        }


    }

    public static class ClassAverage {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int totalInoutFromUser = 0;
            int numberOfLoopsForGradeCounter = 1;
            while (numberOfLoopsForGradeCounter<=3) {
                System.out.println("Enter a grade ");
                int gradeEnteredByUser = input.nextInt();
                totalInoutFromUser = gradeEnteredByUser + totalInoutFromUser;
                numberOfLoopsForGradeCounter = numberOfLoopsForGradeCounter + 1;

            }
            int average = totalInoutFromUser / 10;

            System.out.println(totalInoutFromUser);
            System.out.println(average);
        }
    }
}
