package ChapterThree;

import java.util.Scanner;

public class ClassAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passMark = 0;
        int failMark = 0;
        int studentCounter = 1;
        while (studentCounter <= 10) {
            System.out.println("Enter result (1 = pass, 2 = fail)");
            int resutEnteredByUser = input.nextInt();
            if(resutEnteredByUser == 1)
                passMark = passMark + 1;
            else if( resutEnteredByUser != 1)
                failMark = failMark + 1 ;
            studentCounter++;
        }
        System.out.println("The number of passes are: " + passMark);
        System.out.println( "The number of failures are: " + failMark);
        if(passMark > 8)
            System.out.println("Bonus to instructor");
    }
}
