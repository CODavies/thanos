package ChapterFive;

import java.util.Scanner;

public class Hex2Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hexNumberEnteredByUser = input.nextLine();
        System.out.println("The decimal value for the hex number " + hexNumberEnteredByUser + " is " + hexToDecimal(hexNumberEnteredByUser.toUpperCase()));
    }

    public static int hexToDecimal(String hexNumberEnteredByUser) {
        int decimalValue = 0;
        for (int i = 0; i < hexNumberEnteredByUser.length(); i++) {
            char hexNumberEnteredByUserChar = hexNumberEnteredByUser.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexNumberEnteredByUserChar);
        }
        return decimalValue;

    }

    private static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}

