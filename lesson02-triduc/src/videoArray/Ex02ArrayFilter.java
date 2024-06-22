package videoArray;

import java.util.Arrays;

public class Ex02ArrayFilter {
	public static void main(String[] args) {
		//tìm số lẻ
		int[] numbers = {1,2,3,4,5,6};
//		for(int n : numbers) {
//			if(n%2 != 0)
//			{
//				System.out.println(n);
//			}
//		}
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	private static int[] findOddNumbers(int[] a) {
		int[] oddNumbers = new int[a.length];
		int index = 0;
		for(int n : a) {
			if(n%2 != 0)
			{
				oddNumbers[index] = n;
				index ++;
			}
		}
		int[] rs = new int[index];
		for(int i = 0; i < index; i++) {
			rs[i] = oddNumbers[i];
		}
		return rs;
	}
}
