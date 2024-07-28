package view;

import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		int a1[] = {2, 3};
		System.out.println("BCNN: "+ getLeastCommonMultiple(a1));
		int a2[] = {2, 3, 4};
		System.out.println("BCNN: "+ getLeastCommonMultiple(a2));
	}
	
	private static int uscnn(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	private static int bcnn (int a, int b) {
		return a * (b / uscnn(a, b));
	}
	
	public static int getLeastCommonMultiple(int a[]) {
		int boiChungNhoNhat = a[0];
		for (int i = 0; i < a.length; i++) {
			boiChungNhoNhat = bcnn(boiChungNhoNhat, a[i]);
		}
		return boiChungNhoNhat;
	}
}
