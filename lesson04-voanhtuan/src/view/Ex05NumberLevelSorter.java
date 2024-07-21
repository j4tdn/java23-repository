package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05NumberLevelSorter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    int n = 0;
	    while (n <= 0) {
	    System.out.print("Enter the number of elements (n>0): ");
	    	if (sc.hasNextInt()) {
	    		n = sc.nextInt();
	    		if (n <= 0) {
	    			System.out.println("Number of elements must be greater than 0. Please try again.");
	    		}
	    	}
	    	else {
	    		System.out.println("Invalid input. Please enter a positive integer.");
	    		sc.next();
	    	}
	    }
		
	    int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            while (true) {
                if (sc.hasNextInt()) {
                    array[i] = sc.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next();
                }
            }
        }
        
        Integer[] numbers = Arrays.stream(array).boxed().toArray(Integer[]::new);

        Arrays.sort(numbers, (a, b) -> {
            int levelA = getLevel(a);
            int levelB = getLevel(b);
            return Integer.compare(levelA, levelB);
        });

        System.out.println("Array sorted by level:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int getLevel(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
