package ChapterSix;

import java.lang.reflect.Array;
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int randomNumberGenerated = randomNumber.nextInt();
        int[] arr = new int[6];
        for (int counter = 0; counter < 30; counter++) {
            randomNumberGenerated = 1 + randomNumber.nextInt(6);
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 4;
            arr[4] = 5;
            arr[5] = 6;
            int x = (int) Array.get(arr, counter);
            System.out.printf("%d  ", randomNumberGenerated);
            System.out.println(x + " ");
        }
    }
}