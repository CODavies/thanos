package chapterFour;

public class Katta {

//    public double calculateAverage(int firstnumber, int secondNumber, int thirdNumber) {
//        double average = (firstnumber + secondNumber + thirdnumber) / 3.0;
//
//        return average;
//    }


    public void isPrime(int number) {
        if (number % 2 == 0) {
            System.out.println("Its prime");
        } else {
            System.out.println(false);
        }
    }

    public int TestDriller(int copies) {
        if (copies > 900) {
            return 800;
        }
        if (copies >= 100 && copies <= 900) {
            return 900;
        }
        if (copies >= 50 && copies <= 99) {
            return 1000;
        }
        if (copies >= 10 && copies <= 29) {
            return 1200;
        }
        if (copies >= 1 && copies <= 4) {
            return 1500;
        } else if(copies < 1){
            return 0;
        }
        return copies;


    }


}





