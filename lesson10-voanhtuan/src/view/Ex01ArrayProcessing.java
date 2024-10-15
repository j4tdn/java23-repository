package view;

import java.util.Random;

public class Ex01ArrayProcessing {

	 public static void main(String[] args) {
	        int n = 8;
	        int[] arr = generateRandomArray(n);
	        System.out.println("Original Array: ");
	        printArray(arr);

	        // 1. Remove duplicates and keep elements that are unique.
	        int[] uniqueArray = removeDuplicates(arr);
	        System.out.println("\nUnique Array: ");
	        printArray(uniqueArray);

	        // 2. Compare average of first n/2 elements with last n/2 elements.
	        System.out.println();
	        compareAverage(arr);

	        // 3. Find the third largest number in the array.
	        int thirdLargest = findThirdLargest(arr);
	        System.out.println("\nThird Largest Element: " + thirdLargest);
	    }

	    // Method to generate random integers between 10 and 50
	    public static int[] generateRandomArray(int n) {
	        Random rd = new Random();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = rd.nextInt(41) + 10;
	        }
	        return arr;
	    }

	    // Method to print the array
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println("");
	    }

	    // Method to remove duplicates elements
	    public static int[] removeDuplicates(int[] arr) {
	    	int[] occurrences = new int[51];
	        for (int num : arr) {
	            occurrences[num]++;
	        }

	        int count = 0;
	        for (int i = 10; i <= 50; i++) {
	            if (occurrences[i] == 1) count++;
	        }

	        int[] result = new int[count];
	        int index = 0;
	        for (int num : arr) {
	            if (occurrences[num] == 1) {
	                result[index++] = num;
	            }
	        }
	        return result;
	    }

	    // Method to compare the average of first n/2 elements with the last n/2 elements
	    public static void compareAverage(int[] arr) {
	        int n = arr.length;
	        int sumFirstHalf = 0, sumSecondHalf = 0;

	        for (int i = 0; i < n / 2; i++) {
	            sumFirstHalf += arr[i];
	        }
	        for (int i = n / 2; i < n; i++) {
	            sumSecondHalf += arr[i];
	        }

	        double avgFirstHalf = (double) sumFirstHalf / (n / 2);
	        double avgSecondHalf = (double) sumSecondHalf / (n / 2);

	        System.out.println("Average of first half: " + avgFirstHalf);
	        System.out.println("Average of second half: " + avgSecondHalf);

	        if (avgFirstHalf > avgSecondHalf) {
	            System.out.println("The average of the first half is greater.");
	        } else if (avgFirstHalf < avgSecondHalf) {
	            System.out.println("The average of the second half is greater.");
	        } else {
	            System.out.println("Both halves have equal averages.");
	        }
	    }

	    // Method to find the third largest unique element in the array
	    public static int findThirdLargest(int[] arr) {
	        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > first) {
	                third = second;
	                second = first;
	                first = num;
	            } else if (num > second && num < first) {
	                third = second;
	                second = num;
	            } else if (num > third && num < second) {
	                third = num;
	            }
	        }

	        return third == Integer.MIN_VALUE ? -1 : third;
	    }
	
}
