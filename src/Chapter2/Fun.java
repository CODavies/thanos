package Chapter2;


import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {

//
//        int r = 2;
//        int a = 4;
//        int b = 5;
//        int c = 1;
//        int d = 7;
//        int e = 4 / (3 * (r + 34));
//        int f = 9 * (a + (b * c));
//        int g = 3 + (d * (2 + a));
//        int h = a + (b * d);
//        double i = a - f + (g / h);
//        System.out.println(i);
//        System.out.println();
//        int t = 3;
//        double s = r + 2.5;
//        double u = 2.5 + t;
//
//
//        System.out.println(5.5 * (Math.pow(s, u)));
//        System.out.println();
//
//    CURRENT TIME,  System.currentTimeMillis() is used to get the current time in milliseconds as a long value.
        long totalMillSeconds = System.currentTimeMillis();
        long totalSeconds = totalMillSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinute = totalSeconds / 60;
        long currentMinute = totalMinute % 60;
        long totalHours = totalMinute / 60;
        long currentHours = totalHours % 60;
        System.out.println("current time is " + currentHours + ":" + currentMinute + ":" + currentSeconds + ":" + "GMT");
        System.out.println();
//
////       Increment
//        int sam = 10;
//        int newNum = 10 * sam++; //        the same as int newNum = 10 * i; i = i + 1;
//        System.out.print("i is " + sam + ", newNum is " + newNum);
//
//        System.out.println();
//        System.out.println((double) 1 / 2);

//        Casting of a number

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter purchase amount");
//        double amount = inpu.nextDouble();
//        double tax = amount * 0.6;
//        System.out.println("Tax is " + (int) (tax * 100) / 100);
//        System.out.println();
//        System.out.println("Enter annual interest rate");
//        double interestRate = inpu.nextDouble();
//        double monthlyInterest = interestRate / 12000;
//        double annualInterestRate = interestRate / 100;
//        System.out.println("Enter number of years");
//        int numberOfYears = inpu.nextInt();
//        System.out.println("Enter loan amount");
//        int loanAmount = inpu.nextInt();
//        double monthlyPayment = loanAmount * monthlyInterest / (1-1/Math.pow(1 + monthlyInterest, numberOfYears * 12));
//        double totalPayment = monthlyPayment * numberOfYears * 12;
//        System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100)/100.0);
//        System.out.println("The total payment is $" + (int)(totalPayment * 100)/100.0);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amountr");
        double amount = input.nextDouble();
        int remainingAmount = (int) (amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
   }
}
