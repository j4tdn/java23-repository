package ex04;

import java.util.HashMap;
import java.util.Map;

public class Array {
	/*
	  Viết chương trình tìm tổng các phần tử không trùng nhau trong mảng ngoại trừ
	  phần tử lớn nhất và phần tử nhỏ nhất. Ví dụ ▪ int[] a = {1, 5, 8, 9, 2, 5, 9}
	  → Tổng = 2 + 5 + 8 = 15 ▪ int[] a = {4, 2, 6, 6, 4, 15, 1} → Tổng = 2 + 4 + 6
	  = 12
	 */
	public static int sum(int[] array) {
		Map<Integer, Integer> frequency = new HashMap<>();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int num : array) {
			frequency.put(num, frequency.getOrDefault(num, 0) + 1);
			if (num < min)
				min = num;
			if (num > max)
				max = num;

		}
		int totalSum = 0;
		for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
			if (entry.getValue() == 1 && entry.getKey() != min && entry.getKey() != max) {
				totalSum += entry.getKey();
			}
		}

		return totalSum;
	}

	/*
	  bị sai kq
	 */
	public static void main(String[] args) {
		System.out.println(sum(new int[] { 1,  8, 9, 2, 5, 9 }));
		System.out.println(sum(new int[] { 4, 2,  6, 4, 15, 1 }));
	}
}