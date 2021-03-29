package ChapterFive;

public class ChristmasSong {

    public static void main(String[] args) {

        int day = 1;
        while (day <= 12) {

            switch (day) {
                case 1 -> System.out.print("On the First day of Christmas my true love gave to me");
                case 2 -> System.out.print("On the Second day of Christmas my true love gave to me");
                case 3 -> System.out.print("On the Third day of Christmas my true love gave to me");
                case 4 -> System.out.print("On the Fourth day of Christmas my true love gave to me");
                case 5 -> System.out.print("On the Fifth day of Christmas my true love gave to me");
                case 6 -> System.out.print("On the Sixth day of Christmas my true love gave to me");
                case 7 -> System.out.print("On the Seventh day of Christmas my true love gave to me");
                case 8 -> System.out.print("On the Eight day of Christmas my true love gave to me");
                case 9 -> System.out.print("On the Ninth day of Christmas my true love gave to me");
                case 10 -> System.out.print("On the Tenth day of Christmas my true love gave to me");
                case 11 -> System.out.print("On the Eleventh day of Christmas my true love gave to me");
                case 12 -> System.out.print("On the Twelfth day of Christmas my true love gave to me");
                default -> System.out.print(" ");
            }

            switch (day) {
                case 12:
                    System.out.println(" 12 Drummers Drumming\n" +
                            "Eleven Pipers Piping\n" +
                            "Ten Lords a Leaping\n" +
                            "Nine Ladies Dancing\n" +
                            "Eight Maids a Milking\n" +
                            "Seven Swans a Swimming\n" +
                            "Six Geese a Laying\n" +
                            "Five Golden Rings\n" +
                            "Four Calling Birds\n" +
                            "Three French Hens\n" +
                            "Two Turtle Doves\n" +
                            "and a Partridge in a Pear Tree \n");
                    break;
                case 11:
                    System.out.println(" Eleven Pipers Piping \n" +
                            "Ten Lords a Leaping\n" +
                            "Nine Ladies Dancing\n" +
                            "Eight Maids a Milking\n" +
                            "Seven Swans a Swimming\n" +
                            "Six Geese a Laying\n" +
                            "Five Golden Rings\n" +
                            "Four Calling Birds\n" +
                            "Three French Hens\n" +
                            "Two Turtle Doves\n" +
                            "and a Partridge in a Pear Tree \n");
                    break;
                case 10:
                    System.out.println(" Ten Lords a Leaping\n" +
                            "Nine Ladies Dancing\n" +
                            "Eight Maids a Milking\n" +
                            "Seven Swans a Swimming\n" +
                            "Six Geese a Laying\n" +
                            "Five Golden Rings\n" +
                            "Four Calling Birds\n" +
                            "Three French Hens\n" +
                            "Two Turtle Doves\n" +
                            "and a Partridge in a Pear Tree \n");
                    break;
                case 9:
                    System.out.println(" Nine Ladies Dancing\n" +
                            "Eight Maids a Milking\n" +
                            "Seven Swans a Swimming\n" +
                            "Six Geese a Laying\n" +
                            "Five Golden Rings\n" +
                            "Four Calling Birds\n" +
                            "Three French Hens\n" +
                            "Two Turtle Doves\n" +
                            "and a Partridge in a Pear Tree \n");
                    break;
                case 8:
                    System.out.println(" Eight Maids a Milking\n" +
                            "Seven Swans a Swimming\n" +
                            "Six Geese a Laying\n" +
                            "Five Golden Rings\n" +
                            "Four Calling Birds\n" +
                            "Three French Hens\n" +
                            "Two Turtle Doves\n" +
                            "and a Partridge in a Pear Tree \n");
                    break;
                case 7:
                    System.out.println(" Seven Swans a Swimming\n" +
                            "Six Geese a Laying\n" +
                            "Five Golden Rings\n" +
                            "Four Calling Birds\n" +
                            "Three French Hens\n" +
                            "Two Turtle Doves\n" +
                            "and a Partridge in a Pear Tree \n");
                    break;
                case 6:
                    System.out.println(" Six Geese a Laying\n" +
                            "Five Golden Rings\n" +
                            "Four Calling Birds\n" +
                            "Three French Hens\n" +
                            "Two Turtle Doves\n" +
                            "and a Partridge in a Pear Tree \n");
                    break;
                case 5:
                    System.out.println(" Five Golden Rings\n" +
                            "Four Calling Birds\n" +
                            "Three French Hens\n" +
                            "Two Turtle Doves\n" +
                            "and a Partridge in a Pear Tree \n");
                    break;
                case 4:
                    System.out.println(" Four Calling Birds\n" +
                            "Three French Hens\n" +
                            "Two Turtle Doves\n" +
                            "and a Partridge in a Pear Tree \n");
                    break;
                case 3:
                    System.out.println(" Three French Hens\n" +
                            "Two Turtle Doves and a Partridge in a Pear Tree \n");
                    break;
                case 2:
                    System.out.println(" Two Turtle Doves\n" +
                            "and a Partridge in a Pear Tree");
                    break;
                default:
                    System.out.println(" A partridge in a pear tree ");
                    System.out.println(" ");
            }
            day++;
        }
    }
}



