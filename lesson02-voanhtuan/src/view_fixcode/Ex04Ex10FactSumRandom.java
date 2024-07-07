package view_fixcode;

import java.util.Arrays;
import java.util.Random;

import utils.MathUtils;

public class Ex04Ex10FactSumRandom {
	
	private static Random rd = new Random();
	
	public static void main(String[] args) {
		//B1: Random 5 số nguyên [20,30] k trùng nhau
		//	  Lưu vào mảng int[]
		int[] uniqueNumbers = random(20, 30, 5);
		System.out.println("uniqueNumbers --> " + Arrays.toString(uniqueNumbers));
		
		//B2: Sử dụng hàm MathUtil#getFact rồi tính tổng
		System.out.println("Sum of f(number) in " 
				+ Arrays.toString(uniqueNumbers)+") = " + sumF(uniqueNumbers));
	}
	
	// /** */ --> chú thích cho class, hàm
	// /* */  --> chú thích cho logic bình thường nhiều dòng
	// //	  --> chú thích 1 dòng
	
	/**
	 * 
	 * @param fromInclusive
	 * @param untilInclusive
	 * @param amount
	 * @return
	 */
	private static int[] random(int fromInclusive, int untilInclusive, int amount) {
		int[] result = new int[amount]; //[0, 0, 0, 0, 0]
		int count = 0; // count là số phần tử thật sự đã random, đưa vào result
		while(true) {
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
	
	private static boolean isPresent (int newValue, int[] elements, int numberOfRealValues) {
		for (int i=0; i<numberOfRealValues; i++) {
			if(newValue == elements[i]) {
				return true;
			}
		}
		return false;
	}
	
	private static long sumF (int[] numbers) {
		long sum = 0;
		for (int number : numbers) {
			sum = sum + MathUtils.getFact(number);
		}
		return sum;
	}
}
