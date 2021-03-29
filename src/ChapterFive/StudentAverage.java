package ChapterFive;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        int total = 0;
        int counter = 1;
        while (counter <= 10) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int grade = input.nextInt();
            total = grade + total;
            counter++;
        }
        double average = total / (counter * 1.0);
        System.out.println(average);
        System.out.println(total);


    }

}



