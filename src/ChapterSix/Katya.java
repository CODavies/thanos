package ChapterSix;

import org.jetbrains.annotations.NotNull;

public class Katya {

    public int getMaximum(int[] a) {
        int maximumNumber = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > maximumNumber)
                maximumNumber = a[i];
        }
        return maximumNumber;
    }

    public int getMinimum(int[] a) {
        int minimumNumber = a[0];
        for (int j : a) {
            if (j < minimumNumber)
                minimumNumber = j;
        }
        return minimumNumber;
    }

    public int getSumOfNumber(int @NotNull [] a) {
        int sum = 0;
        for (int j : a) {
            sum = sum + j;
        }
        return sum;
    }

    public int getAverageOfNumbers(int[] a) {
        int average = 0;
        int sum = getSumOfNumber(a);
        for (int j : a) {
            average = sum / a.length;
        }
        return average;
    }

    public int getMaximumNumberOfArray(int[] a) {
        int maximumSum = 0;
        for (int i = 0; i < a.length; i++) {
            maximumSum = getSumOfNumber(a) - getMinimum(a);
        }
        return maximumSum;
    }

    public int getMinimumNumberOfArray(int[] a) {
        int minimumSum = 0;
        for (int i = 0; i < a.length; i++) {
            minimumSum = getSumOfNumber(a) - getMaximum(a);
        }
        return minimumSum;
    }
    }

