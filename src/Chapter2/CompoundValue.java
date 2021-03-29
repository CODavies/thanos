package Chapter2;

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        int monthlySavingAmount = inp.nextInt();
        double monthlyInterestRate = 0.00417;
        double yearyInterestRate = 100 * (monthlyInterestRate);
        yearyInterestRate = (100 + yearyInterestRate) + ( 1 + yearyInterestRate);
        yearyInterestRate = (100 + yearyInterestRate) + ( 1 + yearyInterestRate);
        yearyInterestRate = (100 + yearyInterestRate) + ( 1 + yearyInterestRate);
        yearyInterestRate = (100 + yearyInterestRate) + ( 1 + yearyInterestRate);
        yearyInterestRate = (100 + yearyInterestRate) + ( 1 + yearyInterestRate);
        yearyInterestRate = (100 + yearyInterestRate) + ( 1 + yearyInterestRate);

        System.out.println(yearyInterestRate);

    }
}
