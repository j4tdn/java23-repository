package view;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01ArrayProcessing {

	private static Scanner ip = new Scanner(System.in);
	private static Random rd = new Random();
	public static void main(String[] args) {
		
		System.out.print("Nhập số phần tử của mảng(n < 10): ");
		int n = ip.nextInt();
		
		int[] numbers = new int[n];
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = rd.nextInt(10, 51);
		
		System.out.println("Mảng vừa tạo --> " + Arrays.toString(numbers));
		
		System.out.println("\n+ Mảng sau khi loại bỏ những phần tử trùng nhau --> " 
				+ Arrays.toString(removeDuplicateElements(numbers)));
		
		if(compareAverageValues(numbers) == 1)
			System.out.println("+ Giá trị trung bình của nửa mảng đầu lớn hơn nửa mảng cuối");
		else if(compareAverageValues(numbers) == 2)
			System.out.println("+ Giá trị trung bình của nửa mảng đầu nhỏ hơn nửa mảng cuối");
		else
			System.out.println("+ Giá trị trung bình của nửa mảng đầu bằng nửa mảng cuối");
		
		System.out.println("+ Số lớn thứ 3 trong mảng là: " + findThirdBiggestNumber(numbers));
		
	}
	
	private static int[] removeDuplicateElements(int[] number) {
		int[] target = new int[number.length];
		int count = 0;
		for(int i = 0; i < number.length; i++)
			if(!isRepeatedElements(number, number[i]))
				target[count++] = number[i];
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isRepeatedElements(int[] number, int value) {
		int count = 0;
		for(int i = 0; i < number.length; i++)
			if(value == number[i])
				count++;
		if(count > 1)
			return true;
		return false;
	}
	
	private static int compareAverageValues(int[] number) {
		int length = number.length;
		int sum1 = 0, sum2 = 0; 
		float firstAvg, secondAvg;
		
		for(int i = 0; i < length / 2; i++) 
			sum1 = sum1 + number[i];
		firstAvg = (float) sum1 / (length / 2);
		
		// nếu length chẵn thì nửa sau chạy từ cuối đến vị trí length/2
		//            lẻ thì nửa sau chạy từ cuối đến vị trí length/2 + 1
		for(int i = length - 1; length % 2 == 0 ? i >= length / 2 : i > length / 2; i--) 
			sum2 = sum2 + number[i];
		secondAvg = (float) sum2 / (length / 2);
		
		return firstAvg > secondAvg ? 1: firstAvg < secondAvg ? 2: 3;
	}
	
	private static int findThirdBiggestNumber(int[] number) {
		int firstMax = 0, secondMax = 0, thirdMax = 0;
		for(int i = 0; i < number.length; i++) {
			if(number[i] > firstMax) {
				firstMax = number[i];
				secondMax = firstMax;
			}
			else if(number[i] > secondMax) {
				secondMax = number[i];
				thirdMax = secondMax;
			}
			else if(number[i] > thirdMax)
				thirdMax = number[i];
		}
		return thirdMax;		
	}
}
