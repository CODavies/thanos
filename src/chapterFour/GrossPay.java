//package chapterFour;
//
//import java.util.Scanner;
//
//public class GrossPay{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter name");
//        String name = input.nextLine();
//        System.out.println("Enter number of hours worked in a week");
//        int hours = input.nextInt();
//        System.out.println("Enter hourly pay");
//        double hourlyPay = input.nextDouble();
//        System.out.println("Enter tax");
//        double tax = input.nextDouble();
//        System.out.println("Enter state tax");
//        double stateTax = input.nextDouble();
//        double grossPay = hours * hourlyPay;
//        System.out.println(name);
//        System.out.println("gross pay is: " + grossPay);
//        double federalDeductions = 0.2 * grossPay;
//        System.out.println("Federal deductions : " + federalDeductions);
//        double stateDeductions = 0.09 * grossPay;
//        System.out.println("state deductions is : " + stateDeductions);
//        double totalDeductions = federalDeductions + stateDeductions;
//        double netPay = grossPay - totalDeductions;
//        System.out.println("Net pay = " + netPay);
//
//    }
//}
