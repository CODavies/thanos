package ChapterFive;

public class Counter {
    public static void main(String[] args) {
        {

        int counter = 1;

        counter = ++counter +counter;
        counter++;
        System.out.println(counter);
        System.out.println();}
        {
            int counter = 1;
            counter = counter++ + counter++;
            System.out.println(counter);
        }
        {
            int counter = 1;
            counter = counter++ + counter;
            counter++;
            System.out.println(counter);
            System.out.println();

        }
        {
            int counter = 1;
            counter = ++counter + counter++;
            System.out.println(counter);
        }
    }
}
