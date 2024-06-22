package exercises;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số : ");
		int N = sc.nextInt();
		System.out.println("Giai thừa của " + N + "là :" + factorials(N) );
		
	}
	
	private static long factorials(int n) {
		  
	        if (n > 0) {
	            return n * factorials(n - 1);
	        } else {
	            return 1;
	        }
	    }
}
