package ex_150_java;

import java.util.Arrays;

public class ex06 {
	 //Các phần tử trùng nhau
	public static void main(String[] args) {
		int[] arr =  new int[] { 1 ,  2 ,  3 ,  4 ,  2 ,  7 ,  8 ,  8 ,  3 };   
		System.out.println("Các phần tử chưa lọc"+Arrays.toString(arr));
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] ==arr[j])
					System.out.println("Các phần tử giống nhau"+arr[i]);
			}
		}
	}
}
