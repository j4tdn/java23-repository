package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		input();
		
	}
	private static void input() {
//		while(true) {
		try {
			System.out.println("Nhập vào số nguyên N: ");
			int N = sc.nextInt();
			System.out.println("Nhập vào số nguyên M: ");
			int M = sc.nextInt();
			 System.out.println("Số nguyên N:" +N);
			 System.out.println("Số nguyên M:" +M);
		}catch(InputMismatchException e) {
		System.out.println("Value must be number" +e.getMessage());
	System.out.println("Please input again");
		}
}
	
    private static int SNT() {
		return 0;
    	
    }
}


//}