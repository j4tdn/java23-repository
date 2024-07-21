package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
	public static void main(String[] args) {
		
		int [] arr = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		
		int [] sortedArr = sortArray(arr);
		System.out.println("Mang sau khi sap xep --> " + Arrays.toString(sortedArr) );
	}
	
	public static int [] sortArray(int [] arr) {
		List<Integer> chiaHetCho7 = new ArrayList<>();
		List<Integer> giua = new ArrayList<>();
		List<Integer> chiaHetCho5 = new ArrayList<>();
		
		for (int num : arr) {
			if (num % 7 == 0) {
				chiaHetCho7.add(num);
			}else if (num%5==0) {
				chiaHetCho5.add(num);
			} else {
				giua.add(num);
			}
		}
		int [] sortedArr = new int[arr.length];
		int index = 0;
		
		for (int num : chiaHetCho7) {
			sortedArr[index++] = num;
			
		}
		for (int num : giua) {
			sortedArr[index++] = num;
			
		}
		for (int num : chiaHetCho5) {
			sortedArr[index++] = num;
			
		}
		
		return sortedArr;
	}

	
}