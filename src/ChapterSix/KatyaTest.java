package ChapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KatyaTest {
    Katya katya = new Katya();

    @Test
    void methodCanGiveTheMaximumOfNumbers() {
        int[] a = {10, 16, 50, 20, 4};
        assertEquals(50, katya.getMaximum(a));
    }

    @Test
    void methodCanGiveTheMinimumOfNumbers() {
        int[] a = {10, 16, 50, 20, 4};
        assertEquals(4, katya.getMinimum(a));
    }

    @Test
    void methodCanSumElementInAnArray() {
        int[] a = {10, 16, 50, 20, 4};
        assertEquals(100, katya.getSumOfNumber(a));
    }

    @Test
    void methodCanGetAverageOfNumbers() {
        int[] a = {10, 16, 50, 20, 4};
        assertEquals(20, katya.getAverageOfNumbers(a));
    }

    @Test
    void methodCanGetTheMaximumSumOfElementInAnArray() {
        int[] a = {10, 16, 50, 20, 4};
        assertEquals(96, katya.getMaximumNumberOfArray(a));
    }
    @Test
    void methodCanGetTheMinimumSumOfElementInAnArray() {
        int[] a = {10, 16, 50, 20, 4};
        assertEquals(50, katya.getMinimumNumberOfArray(a));
    }
}



