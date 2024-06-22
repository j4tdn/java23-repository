package video_array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 1.Tim nhung phan tu le trong mang  so nguyen
 * input : Mang
 * output: mang so le
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = {11,22,33,44,55};
		int[] oddNumbers=findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	private static int[] findOddNumbers(int[] elements) {
		int[] oddElement= new int[elements.length];
		int count = 0;
		for(int element: elements) {
			if(element % 2 != 0) {
				oddElement[count] = element;
				count++;
			}
		}
		int[] result= new int[count];
		for(int i=0;i<count;i++) {
			result[i] = oddElement[i];
		}
		
		return result;
	}
}
