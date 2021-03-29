package ChapterFive;

import java.util.Scanner;

public class Average {
        public static void main(String[] args) {
            int total = 0;
            int counter;
           for( counter = 1;counter <= 10; counter++) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter number: ");
                int grade = input.nextInt();
                total = grade + total;

            }
            double average = total / (counter * 1.0);
            System.out.println(average);
            System.out.println(total);


        }

    }





