package view;

import java.util.Arrays;
import java.util.HashSet;

public class Ex01Arrays {
	 public static void main(String[] args) {
	        // Generate a random integer array with n elements in range [10, 50]
	        int n = (int)(Math.random() * 9) + 1; // n < 10
	        int[] array = new int[n];
	        for (int i = 0; i < n; i++) {
	            array[i] = (int)(Math.random() * 41) + 10; // range [10, 50]
	        }
	        
	        System.out.println("Original Array: " + Arrays.toString(array));
	        
	        // Method 1: Remove duplicates and return unique elements
	        int[] uniqueElements = removeDuplicates(array);
	        System.out.println("Unique Elements: " + Arrays.toString(uniqueElements));
	        
	        // Method 2: Compare the average of the first n/2 elements with the last n/2 elements
	        compareAvgFirstLast(array);
	        
	        // Method 3: Find the third largest number
	        Integer thirdLargest = findThirdLargest(array);
	        if (thirdLargest != null) {
	            System.out.println("Third Largest Number: " + thirdLargest);
	        } else {
	            System.out.println("Array does not have enough unique elements to find the third largest.");
	        }
	    }
	    
	    // Method 1: Remove duplicate elements
	    public static int[] removeDuplicates(int[] arr) {
	        HashSet<Integer> uniqueSet = new HashSet<>();
	        for (int i : arr) {
	            uniqueSet.add(i);
	        }
	        int[] result = new int[uniqueSet.size()];
	        int index = 0;
	        for (int i : uniqueSet) {
	            result[index++] = i;
	        }
	        return result;
	    }

	    // Method 2: Compare the average of the first n/2 elements with the last n/2 elements
	    public static void compareAvgFirstLast(int[] arr) {
	        int mid = arr.length / 2;
	        double firstHalfAvg = Arrays.stream(arr, 0, mid).average().orElse(0);
	        double secondHalfAvg = Arrays.stream(arr, mid, arr.length).average().orElse(0);
	        
	        System.out.println("First Half Avg: " + firstHalfAvg);
	        System.out.println("Second Half Avg: " + secondHalfAvg);
	        
	        if (firstHalfAvg > secondHalfAvg) {
	            System.out.println("The average of the first half is larger.");
	        } else {
	            System.out.println("The average of the second half is larger.");
	        }
	    }

	    // Method 3: Find the third largest number
	    public static Integer findThirdLargest(int[] arr) {
	        int[] uniqueSorted = Arrays.stream(arr).distinct().sorted().toArray();
	        if (uniqueSorted.length < 3) {
	            return null;
	        }
	        return uniqueSorted[uniqueSorted.length - 3];
	    }
	}

