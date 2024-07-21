package view;

import java.util.Arrays;
import java.util.Random;

public class st2 {
    public static void main(String[] args) {
        int[] numberArray = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};

        int[] divisibleBy7 = new int[numberArray.length];
        int[] divisibleBy5 = new int[numberArray.length];
        int[] others = new int[numberArray.length];

        int indexDivisibleBy7 = 0;
        int indexDivisibleBy5 = 0;
        int indexOthers = 0;

        for (int num : numberArray) {
            if (num % 7 == 0) {
                divisibleBy7[indexDivisibleBy7++] = num;
            } else if (num % 5 == 0) {
                divisibleBy5[indexDivisibleBy5++] = num;
            } else {
                others[indexOthers++] = num;
            }
        }

        // Sort thearrays
        Arrays.sort(divisibleBy7, 0, indexDivisibleBy7);
        Arrays.sort(divisibleBy5, 0, indexDivisibleBy5);

        // Combine the arrays
        int[] result = new int[numberArray.length];
        System.arraycopy(divisibleBy7, 0, result, 0, indexDivisibleBy7);
        System.arraycopy(others, 0, result, indexDivisibleBy7, indexOthers);
        System.arraycopy(divisibleBy5, 0, result, indexDivisibleBy7 + indexOthers, indexDivisibleBy5);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
