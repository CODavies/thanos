package ChapterSix;



public class ProductOfANumber {
        public static void main(String[] args) {
            int product = 1;
            int divisor;
            for ( divisor =3; divisor < 15; divisor*=3) {
                if (product % divisor == 0)

                    System.out.printf(" %d", divisor );

            }

        }

    }


