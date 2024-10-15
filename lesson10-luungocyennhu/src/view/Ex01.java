package view;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner ip = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter n (n < 10): ");
			n = Integer.parseInt(ip.nextLine());
		} while (n >= 10);
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(10, 51);
		}
		System.out.println("arr --> " + Arrays.toString(arr));
		
		System.out.println(" - arr remove element identical --> " + Arrays.toString(removeElementIdentical(arr)));
		
		compareAverageValues(arr);
		
		System.out.println(" - 3rd Largest Number --> " + find3rdLargestNumber(arr));
	}
	
	private static int[] removeElementIdentical(int[] arr) {
		int[] result = new int[arr.length];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			boolean isValid = false;
			for(int j = 0; j < count; j++) {
				if (arr[i] == result[j]) {
					isValid = true;
					break;
				}
			}
			if (!isValid) {
				result[count++] = arr[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void compareAverageValues(int[] arr) {
		int length = arr.length;
		int mid = length/2;
		int left = 0;
		int right = 0;
		
		for (int i = 0; i < mid; i++) {
	        left += arr[i];
	    }
	    for (int i = mid; i < length; i++) {
	        right += arr[i];
	    }
	    
	    double leftAvg = (double)left/mid;
	    double rightAvg = (double)right/mid;
		
		if (leftAvg > rightAvg) {
			System.out.println(" - Giá trị trung bình của nửa đầu > nửa cuối");
		} else if (leftAvg < rightAvg) {
			System.out.println(" - Giá trị trung bình của nửa đầu < nửa cuối");
		} else {
			System.out.println(" - Giá trị trung bình của nửa đầu = nửa cuối");
		}
	}
	
	private static int find3rdLargestNumber(int[] arr) {
		int[] result = removeElementIdentical(arr);
		Arrays.sort(result);
		return result[result.length - 3];	
	}
}
