package chapterFour;

import java.util.Locale;
import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {
        String lottery = " " + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ".toUpperCase(Locale.ROOT));
        String guess = input.nextLine();
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);
        char guessDigit1 = lottery.charAt(0);
        char guessDigit2 = lottery.charAt(1);
        System.out.println("The lottery number is " + lottery);
        if (guess.equals(lottery)) {
            System.out.println("Exact match; you  just won $10,000 ");
        }
        {
            if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
                System.out.println("Match all digits, you won $3,000 ");
        }
        {
            if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
                System.out.println("Match one digit, you won $1000 ");
            else
                System.out.println("Sorry, no match");
        }


        {
            int count = 5;
            double amount = 45.56;
            System.out.printf("count is %d and amount is %f \n", count, amount);


            System.out.printf("%3d#%2s#%4.2f\n", 1234, "Java", 51.6653);
            System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
            System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.63);
        }
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
         degrees = 60;
         radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,radians, Math.sin(radians), Math.cos(radians),Math.tan(radians));

    }
}
