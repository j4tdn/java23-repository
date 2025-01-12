package ex_150_java;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
//		int attempts=0;
//		
//		while(attempts <5) {
//			
//		}
		System.out.println("Nhập N");
		int n = ip.nextInt();
		
		if(isTwo(n)) {
			System.out.println("Lũy thừa"+n);
		}else
			System.out.println(n+"không phải là lũy thừa của 2");
		
		
}
	public static  boolean isTwo (int n) {
		if(n<0) {
			return false;
		}
		return (n & (n - 1)) == 0;
		
	}
}

