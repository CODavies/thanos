//package Chapter2;
//
//import java.util.Scanner;
//
//public class Excercise26{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 0 and 999");
//        int numberUserEntered = input.nextInt();
//        int firstNumberofOutput = numberUserEntered % 10;
//        int remainderFromDivisor = numberUserEntered / 10;
//        int secondNumberofOutput =  remainderFromDivisor % 10;
//        remainderFromDivisor = remainderFromDivisor/10;
//        int thirdNumberofOutput = remainderFromDivisor %10;
//        remainderFromDivisor = remainderFromDivisor /10;
//        int fourthNumberFromOutut = remainderFromDivisor % 10;
//        int sumOfNumbers = firstNumberofOutput + secondNumberofOutput + thirdNumberofOutput + fourthNumberFromOutut;
//        System.out.println("The sum of the digits is " + sumOfNumbers);
//
//
//    }
//}
