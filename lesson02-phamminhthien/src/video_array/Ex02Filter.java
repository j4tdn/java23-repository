package video_array;

import java.util.Arrays;

/*
 1.Tìm phần tử trong mảng số nguyên.
 	input: Mảng
 	output: Mảng số lẻ
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int []numbers = {1,2,3,4,5,6};
		int [] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
		
	}
	
	// int [] elements = numbers;
	private static int[] findOddNumbers(int []elements) {
		int[] oddElements = new int[elements.length];
		int count = 0;
		for(int element: elements) {
			if(element % 2 != 0) {
				oddElements[count] = element;
				count++;
			}		
		}
		int []result = new int[count]; //mảng result dùng để lưu các pt lẻ // count để duyệt theo mảng oddElements để lấy chuẩn số pt lẻ
		for(int i=0; i < count; i++) {
			result[i]=oddElements[i];
		}
		return result;
	}
	
	
}
