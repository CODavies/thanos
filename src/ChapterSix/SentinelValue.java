package ChapterSix;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        int data;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter an integer (Enter 0 to end) ");
            data = input.nextInt();
            System.out.println("The data is:" + sum);
            data = input.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println("The sum is: " + sum);
    }
}


