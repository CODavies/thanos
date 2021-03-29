package ChapterFive;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The First 50 Numbers are \n");
        printPrimeNumbers();
    }

    private static void printPrimeNumbers() {
        final int numberOfPrimePerLine = 10;
        int count = 0;
        int number = 2;
        while (count < 50) {
            if (isPrime(number)) {
                count++;
                if (count % numberOfPrimePerLine == 0) {
                    System.out.printf("%-5s\n", number);
                } else
                    System.out.printf("%-5s", number);
            }
            number++;
        }
    }

    private static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}

