package ChapterSix;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numberEnteredByUser = input.nextInt();
        int divisor= 1;
        for ( divisor =1; divisor <= numberEnteredByUser; divisor++) {
            if (numberEnteredByUser % divisor == 0)

                System.out.printf(" %d", divisor );

        }

    }

}
