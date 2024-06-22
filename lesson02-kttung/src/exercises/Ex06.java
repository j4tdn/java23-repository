package exercises;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = getInput(sc);
		int b = getInput(sc);
		int c = getInput(sc);
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
			
		int minNumber = findMinNumber(a, b, c);
		int maxNumber = findMaxNumber(a, minNumber, c);
		
		System.out.println("Số nguyên nhỏ nhất là " + minNumber);
		System.out.println("Số nguyên lớn nhất là " + maxNumber);
		}
	
	public static int getInput(Scanner sc) {
		int ip;
		while (true) {
			System.out.println("Nhập số nguyên ");
			ip = Integer.parseInt(sc.nextLine());
			
			if(ip >= 0 && ip < 20 ) {
				return ip;
			}else {
				System.out.println("Nhập lại số nguyên trong khoảng [0, 20) ");
			}
		}
	}
	public static int findMinNumber(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
	public static int findMaxNumber(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}
}
