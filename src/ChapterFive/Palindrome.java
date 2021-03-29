package ChapterFive;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String stringEnteredByUser = input.nextLine();
//        int low = 0;
//        int high = stringEnteredByUser.length() - 1;
//        boolean isPalindrome = true;
//        while (low < high) {
//            if (stringEnteredByUser.charAt(low) != stringEnteredByUser.charAt(high)) {
//                isPalindrome = false;
//                break;
//            }
//            low = low + 1;
//            high--;
//        }
//        if (isPalindrome)
//            System.out.println(stringEnteredByUser + " is a palindrome");
//        else
//            System.out.println(stringEnteredByUser + " is not a palindrome");
        int[] c = new int[5];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;
        c[3] = 4;
        c[4] = 5;
        int i = 0;
        while (i < c.length && i <= 5) {
            System.out.println(c[i]);
i++;
        }
//        for (i= 0; i < c.length; i++){
//            System.out.println(c[i]);
//        }


    }
}




