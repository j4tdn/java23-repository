package view;

import java.util.Scanner;

public class IsPowerOf {

	
//	Cho 2 số a và b
//	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a = ");
		int a = sc.nextInt();
		System.out.println("Input b = ");
		int b = sc.nextInt();
		isPowerOf(a, b);
	}
	
	private static boolean isPowerOf(int a, int b) {
        int total = a;
        for(int i =0;i < b;i++) {
		total = total * a;
        if(total == b) {
        System.out.println("It is a power of");
		return true;
	}
}
        System.out.println("It is not a power of");
		return false;
	}
}