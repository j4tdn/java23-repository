package view;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5, 4, 2};
		System.out.println("taget -> " + Arrays.toString(array));
		System.out.println("1. Remove repeat elements quickly -> " + Arrays.toString(RemoveRepeat(array)));
		System.out.println("2. Compare mean values ");
		compareAverages(array);
		System.out.println("3. 3rd largets number in array: " + find3LastGet(array));
	}
	private static int countOccurrences(int [] arrays, int values) {
		int count = 0;
		for(int i = 0; i < arrays.length; i++) {
			if(arrays[i] == values) {
				count++;
			}
		}
		return count;
	}
	private static int [] RemoveRepeat(int [] arrays) {
		int []taget = new int[arrays.length ];
		int index = 0;
		for(int i = 0; i < arrays.length; i++) {
			if(countOccurrences(arrays, arrays[i]) == 1) {
				taget[index++] = arrays[i];
			}
		}
		return Arrays.copyOf(taget, index);
	}
	private static int average(int [] arrays, int start, int end) {
		int sum = 0;
		int count = 0;
		for(int i = start; i < end; i++) {
			sum += arrays[i];
			count++;
		}
		return sum / count;
	}
	private static void compareAverages(int [] arrays) {
		int n = arrays.length;
		int mid = n / 2;
		double averageFirs = average(arrays, 0, mid);
		double averageLast = average(arrays, mid, n);
		System.out.println("Mean values is n/2 firstly = " + averageFirs);
		System.out.println("Mean values is n/2 finally = " + averageLast);
		if(averageFirs > averageLast ) {
			System.out.println("The average of the first n / 2 elements is greater");
		}else if(averageFirs < averageLast){
			System.out.println("The average of the last n / 2 elements is greater");
		}else {
			System.out.println("The average of the first and last n/2 elements is equal");
		}
			
	}
	private static int find3LastGet(int [] arrays){
		int first = Integer.MIN_VALUE; int second = Integer.MIN_VALUE , third = Integer.MIN_VALUE;
		for(int i = 0; i < arrays.length; i++) {
			if(arrays[i] > first) {
				third = second;
				second = first;
				first = arrays[i];
			} else if(arrays[i] > second && arrays[i] != first) {
				second = arrays[i];
				third = second;
			}else if(arrays[i] > third && arrays[i] != second && arrays[i] != first) {
				third = arrays[i];
			}
			
		}
		return third;
	}
	
}

