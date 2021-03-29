package ChapterFive;

import java.util.Scanner;

public class Decimal2HexConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int decimalNumberEnteredByUser = input.nextInt();
        System.out.println("The hex number for decimal " + decimalNumberEnteredByUser + " is " + decimalToHex(decimalNumberEnteredByUser));

    }

    private static String decimalToHex(int decimalNumberEnteredByUser) {
        StringBuilder hex = new StringBuilder(" ");
        while (decimalNumberEnteredByUser != 0) {
            int hexValue = decimalNumberEnteredByUser % 16;
            hex.insert(0, toHexChar(hexValue));
            decimalNumberEnteredByUser = decimalNumberEnteredByUser / 16;
        }
        return hex.toString();
    }

    private static char toHexChar(int hexValue) {
        if (hexValue <= 9 && hexValue >= 0)
            return (char) (hexValue + '0');
        else
            return (char) (hexValue - 10 + 'A');
    }
}
