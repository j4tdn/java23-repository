package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Ex01 {

	public static int[] generateRandomArray(int n) {
		Random rd = new Random();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = 10 + rd.nextInt(41);
		}
		return array;
	}

	public static int[] removeDuplicates(int[] array) {
		Set<Integer> uniqueElements = new HashSet<>();
		for (int num : array) {
			uniqueElements.add(num);
		}
		return uniqueElements.stream().mapToInt(Integer::intValue).toArray();
	}

	public static String compareAverages(int[] array) {
		int n = array.length;
		int half = n / 2;
		double firstHalfAvg = Arrays.stream(array, 0, half).average().orElse(0);
		double secondHalfAvg = Arrays.stream(array, half, n).average().orElse(0);

		if (firstHalfAvg > secondHalfAvg) {
			return "Trung bình nửa đầu > hơn nửa cuối";
		} else if (firstHalfAvg < secondHalfAvg) {
			return "Trung bình nửa cuối > hơn nửa đầu";
		} else {
			return " = nhau";
		}
	}

	// find s3
	public static int findThirdLargest(int[] array) {
		List<Integer> uniqueList = new ArrayList<>();
		for (int num : array) {
			if (!uniqueList.contains(num)) {
				uniqueList.add(num);
			}
		}
		Collections.sort(uniqueList, Collections.reverseOrder()); // giảm dần
		if (uniqueList.size() < 3) {
			throw new IllegalArgumentException("null");
		}
		return uniqueList.get(2); // ssoo thuwes 3
	}

	public static void main(String[] args) {
		int n = 8; 
		int[] array = generateRandomArray(n);

		
		System.out.println("mảng ban đầu" + Arrays.toString(array));

		
		int[] uniqueArray = removeDuplicates(array);
		System.out.println("mảng loại đi trùng nhau" + Arrays.toString(uniqueArray));

		//so sánh
		String comparison = compareAverages(array);
		System.out.println(comparison);

		// find 3
		try {
			int thirdLargest = findThirdLargest(array);
			System.out.println("số lớn thứ 3 trong mảng " + thirdLargest);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}