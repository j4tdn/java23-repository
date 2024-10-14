package view;

import java.util.Arrays;

import functional.Intest;

public class Ex05OperationsT {
	/*
	 Cho danh sách mảng số nguyên gồm 5 pt
	 Viết chương trình
	 1.Tìm các phần tử chẵn trong mảnh
	 2.Tìm phần tử là bội của 5
	 3.Tìm các số nguyên tố
	 */
	public static void main(String[] args) {
		int []number = {0, 3,  20, 50, 13,12,34, 77, 45,29, 66};
		
		Intest evenTest = nbr -> nbr % 2 == 0;
		print("So chan ", number,a -> a % 2 == 0);
		print("So boi 5  ", number,a -> a % 5 == 0);
		print("So nguyen to ", number,a -> isPrime(a));
	}
	private static void print(String prefix , int [] numbers, Intest intest) {
		System.out.println(prefix  + " ==> " + Arrays.toString(getNumber(numbers, intest)));
	}
	private static int [] getNumber(int [] source, Intest intest) {
		int [] target = new int [source.length];
		int count =0; 
		for(int number: source) {
			if(intest.strategy(number) ) {
				target[count++] = number;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	private static boolean isPrime(int number) {
		if(number < 2) {
			return false;
		}
		for(int i = 2; i < Math.sqrt(number); i ++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
