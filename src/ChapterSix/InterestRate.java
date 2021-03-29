package ChapterSix;

public class InterestRate {
    public static void main(String[] args) {
        double principal = 1000;
                double rate = 0.05;
        System.out.printf("%s%20s%n",	"Year", "       Amount on Deposit");
        int yearToMakePayment;
        for (yearToMakePayment = 1; yearToMakePayment<=10; yearToMakePayment++){
         double  amount = principal * Math.pow(1.0 + rate, yearToMakePayment);
            System.out.printf("%4d%,20.2f%n", yearToMakePayment     , amount);
        }
        

    }
}
