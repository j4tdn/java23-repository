package view;

import java.util.Random;

public class Ex02NumberArrangement {

    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(5,101);

        int[] numbers = new int[n];

        System.out.println("Array :");
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n----------------------------");

//    	int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
//    	int n = numbers.length;
//      int[] result = new int[n];
    	
        int[] divisibleBy7 = new int[n];
        int[] divisibleBy5 = new int[n];
        int[] others = new int[n];

        int index7 = 0;
        int index5 = 0;
        int indexOthers = 0;

        for (int number : numbers) {
            if (number % 7 == 0 && number % 5 == 0) {
                others[indexOthers++] = number;
            } else if (number % 7 == 0) {
                divisibleBy7[index7++] = number;
            } else if (number % 5 == 0) {
                divisibleBy5[index5++] = number;
            } else {
                others[indexOthers++] = number;
            }
        }

        int[] result = new int[n];
        
        int index = 0;

        for (int i = 0; i < index7; i++) {
            result[index++] = divisibleBy7[i];
        }

        for (int i = 0; i < indexOthers; i++) {
            result[index++] = others[i];
        }

        for (int i = 0; i < index5; i++) {
            result[index++] = divisibleBy5[i];
        }

        System.out.println("Array after rearrange :");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
