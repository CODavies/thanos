package ChapterSix;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        int smallestNumber = 0;
        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();
        System.out.println("Enter a third number");
        int thirdNumber = input.nextInt();
        System.out.println("Enter a fourth number");
        int fourthNumber = input.nextInt();
        System.out.println("Enter a fifth number");
        int fifthNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            largestNumber = firstNumber;
            smallestNumber = secondNumber;
        }
//        if(firstNumber < secondNumber){
        else{
            smallestNumber = firstNumber;
            largestNumber = secondNumber;
        }
        if (largestNumber < thirdNumber) {
            largestNumber = thirdNumber;
        }
//        if(smallestNumber > thirdNumber)
        else{
            smallestNumber = thirdNumber;
        }
        if (largestNumber < fourthNumber) {
            largestNumber = fourthNumber;
        }
//        if(smallestNumber > fourthNumber)
        else{
            smallestNumber = fourthNumber;
        }
        if (largestNumber < fifthNumber) {
            largestNumber = fifthNumber;
        }
//        if(smallestNumber > fifthNumber)
        else{
            smallestNumber = fifthNumber;
        }
        System.out.println("The largest number is: " + largestNumber);
        System.out.println("The smallest number is: " + smallestNumber);
    }

}