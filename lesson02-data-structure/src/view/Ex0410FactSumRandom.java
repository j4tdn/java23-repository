package view;

import java.util.Random;

public class Ex0410FactSumRandom {
	
	/*
	 Viết chương trình tính tổng giai thừa 5 số nguyên ngẫu nhiên [20, 30]
	 Yêu cầu: các số nguyên ko đc trùng nhau
	 */
	
	private static Random rd = new Random();

	public static void main(String[] args) {
	
		// B1: Random 5 số nguyên [20, 30] ko trùng nhau
		//     Lưu vào mảng int[]
		
		// B2: Sử dụng hàm MathUtil#getFact rồi tính tổng
	}
	
	// /** */ --> chú thích cho class, hàm
	// /* */  --> chú thích cho logic bình thường nhiều dòng
	// //     --> chú thích 1 dòng
	
	// [20, 30]
	private static int[] random(int fromInclusive, int untilInclusive, int amount) {
		int[] result = new int[amount]; // [0,0,0,0,0]
		int count = 0; // count là số phần tử thật sự đã random, đưa vào result
		while (true) {
			int newValue = rd.nextInt(fromInclusive, untilInclusive + 1);
			if (!isPresent(newValue, result, count)) {
				result[count++] = newValue;
				if (count == amount) {
					break;
				}
			}
		}
		return result;
	}
	
	private static boolean isPresent(int newValue, int[] elements, int size, int nofRealValues) {
		for (int i = 0; i < nofRealValues; i++) {
			if (newValue == elements[i]) {
				return true;
			}
		}	
		return false;
	}
}
