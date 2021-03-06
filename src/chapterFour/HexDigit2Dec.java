package chapterFour;

import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hexDigitEnteredByUser = input.nextLine();
        if (hexDigitEnteredByUser.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        char ch = hexDigitEnteredByUser.charAt(0);
        if (ch <= 'F' && ch >= 'A') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        } else if (Character.isDigit(ch)) {
            System.out.println(("The decimal value for hex digit " + ch + " is " + ch));
        } else {
            System.out.println(ch + " Invalid input");
        }
    }

}



