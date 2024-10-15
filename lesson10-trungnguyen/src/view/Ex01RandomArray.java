package view;

import java.util.Arrays;
import java.util.Random;

/*
 *
 */
public class Ex01RandomArray {

	public static void main(String[] args) {
		int[] rdArray = mockData();
		
		int[] removeDuplicateArray = removeDuplicate(rdArray);
		System.out.println("\n========Loại bỏ phần tử trùng===========\n");
		 
		for (int i = 0; i < removeDuplicateArray.length; i++) {
				System.out.println(" " + removeDuplicateArray[i]);
			}
		 System.out.println("\n=========So sánh trung bình các phần tử===========\n");
		
		 compareArray(rdArray);
		 
		 System.out.println("\n=========Tìm phần tử lớn thứ 3===========\n");
		 findThirdLargest(rdArray);
	}
	
	private static int[] mockData() {
		Random rd = new Random();
		int[] rdArray = new int[rd.nextInt(1, 10)];
		
		for (int i = 0; i < rdArray.length; i++) {
			rdArray[i] = rd.nextInt(9,51);
		}
		for (int i = 0; i < rdArray.length; i++) {
			System.out.println("--> " + rdArray[i]);
		}
		
		return rdArray;
	}
	
	private static int[] removeDuplicate(int[] src) {
		int[] resultArray = new int[src.length];
		int count = 0, indexCount = 0;
		
		for (int i = 0; i < src.length; i++) {
			for (int j = 0; j < src.length; j++) {
				if (i == j) continue;
				if (src[i] == src[j]) count++;
			}
			if (count == 0) {
				resultArray[indexCount++] = src[i];
			}
			count = 0;
		}
		
		return Arrays.copyOfRange(resultArray,0, indexCount);
	}
	
	private static void compareArray(int[] src) {
		double sum1 = 0d, sum2 = 0d;
		
		if (src.length == 1) {
			System.out.println("mảng chỉ có 1 phần tử");
			return ;
		}
		for (int i = 0; i < src.length/2; i++) {
			sum1 += src[i];
		}
		sum1 /= src.length/2;
		
		for (int i = src.length/2; i < src.length; i++) {
			sum2 += src[i];
		}
		sum2 /= (src.length - (src.length/2));

		System.out.println("sum1 = "  +sum1);
		System.out.println("sum2 = "  +sum2);
		if (sum1 > sum2) {
			System.out.println("trung bình "+ src.length/2 + " phần tử đầu tiên lớn hơn trung bình " + (src.length -src.length/2) + " phần tử còn lại");
		}
		else if (sum1 == sum2) {
			System.out.println("trung bình "+ src.length/2 + " phần tử đầu tiên bằng trung bình " + (src.length -src.length/2) + " phần tử còn lại");
		}
		else {
			System.out.println("trung bình "+ src.length/2 + " phần tử đầu tiên bé hơn trung bình " + (src.length -src.length/2) + " phần tử còn lại");
		}
	}
	
	private static void findThirdLargest(int[] src) {
		if (src.length < 3) {
			System.out.println("Mảng không đủ 3 phần tử");
			return;
		}
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i = 0; i < src.length; i++) {
			 if (src[i] > first) {
				 third = second;
				 second = first;
				 first = src[i];
			 }
			 else if (src[i] > second && src[i] < first) {
				 third = second;
				 second = src[i];
			 } else if (src[i] > third && src[i] < second) {
				 third = src[i];
			 }
		}
		
		System.out.println("Phần tử lớn thứ 3 trong mảng là : " + third);
	}
}
