package view;

import java.util.Arrays;
import java.util.Random;

public class Ex01ArraysOperations {
	
	public static void main(String[] args) {
		
		int[] array = generateRandomArray(8);
		// int[] array = {1,2,3,4,3,1};
		System.out.println("Original array: " + Arrays.toString(array));
		
		int[] uniqueArray = removeDuplicates(array);
		System.out.println("\n1. Loại bỏ những phần tử trùng nhau: " + Arrays.toString(uniqueArray));
		
		System.out.println("\n2.So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng");
		compareAverages(array);
		
		System.out.println("\n3. Tìm số lớn thứ 3 trong mảng.");
		int thirdLargestElement = findThirdLargest(array);
		System.out.println("Số lớn thứ 3: " + thirdLargestElement);
		
	}
	
	private static int findThirdLargest(int[] array) {
		
		Integer first = null, second = null, third = null;
		
		for(int element : array) {
			// Bỏ qua nếu phần tử đã được xem xét
			if((first != null && element == first) 
					|| (second != null && element == second) 
					|| (third != null && element == third)) {
				continue;
			}
			
			// Cập nhật giá trị lớn nhất
			if(first == null || element > first) {
				third = second;
				second = first;
				first = element;
			} 
			// Cập nhật giá trị lớn thứ hai
			else if(second == null || element > second) { 
				third = second;
				second = element;
			}
			// Cập nhật giá trị lớn thứ ba
			else if(third == null || element > third) {
				third = element;
			}
		}
		// Nếu không có đủ 3 giá trị khác nhau, trả về giá trị nhỏ nhất trong các số
		if(third == null) {
			return first != null ? first : Integer.MIN_VALUE; // Nếu chỉ có 1 phần tử, trả về giá trị lớn nhất
		}
		
		return third;
	}
	
	private static void compareAverages(int[] array) {
		int length = array.length;
		if(length % 2 != 0) {
			System.out.println("Không thể tách mảng làm hai phần!!!");
			return;
		}
		
		int sumFirstHalf = 0;
		int sumSecondHalf = 0;
		
		for(int i = 0; i < length / 2; i++) {
			sumFirstHalf += array[i];
		}
		
		for(int i = length / 2; i < length; i++) {
			sumSecondHalf += array[i];
		}
		
		double avgFirstHalf = (double) sumFirstHalf / (length / 2);
		double avgSecondHalf = (double) sumSecondHalf / (length / 2);
		
		System.out.println("Giá trị trung bình của nửa đầu tiên: " + avgFirstHalf);
        System.out.println("Giá trị trung bình của nửa thứ hai : " + avgSecondHalf);
        
        if(avgFirstHalf > avgSecondHalf) {
        	System.out.println("Giá trị trung bình của nữa đầu tiên lớn hơn.");
        } else if(avgFirstHalf < avgSecondHalf) {
        	System.out.println("Giá trị trung bình của nữa thứ hai lớn hơn.");
        } else {
        	System.out.println("Giá trị trung bình của hai nửa bằng nhau.");
        }
	}
	
	private static int[] removeDuplicates(int[] array) {
		
		// Sắp xếp array
		Arrays.sort(array);
		
		// Tạo một mảng để lưu những giá trị không trùng nhau
		int n = array.length;
		int[] temp = new int[n];
		int index = 0;
		
		// Duyệt qua mảng này để chỉ lấy các phần tử không trùng nhau
		for(int i = 0; i < n; ) {
			int current = array[i];
			int count = 0;
			
			// Đếm số lần xuất hiện của phần tử hiện tại
			while(i < n && array[i] == current) {
				count++;
				i++;
			}
			
			// Nếu phần tử hiện tại chỉ xuất hiện 1 lần thì đưa vào kết quả
			if(count == 1) {
				temp[index++] = current;
			}
		}
		
		return Arrays.copyOf(temp, index);
	}
	
	private static int[] generateRandomArray(int n)	{
		Random rd = new Random();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = rd.nextInt(100);
		}
		return array;
	}

}