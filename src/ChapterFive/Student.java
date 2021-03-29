package ChapterFive;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int total = 0;
        int counter = 1;
        Scanner input = new Scanner(System.in);
        do {
             System.out.print("Enter number: ");
            int grade = input.nextInt();
            total = grade + total;
            counter++;


        }
        while (counter <= 10);
        double average = total / (counter * 1.0);
        System.out.println("Total is " + total);
        System.out.println("The average is " + average);
    }

}






