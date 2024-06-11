package exercises;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10,20);
		int b = rd.nextInt(10,20);
		int c = rd.nextInt(10,20);
		int d = rd.nextInt(10,20);
		
		System.out.println("Giai thừa của " + a + " là :" + factorials(a) );
		System.out.println("Giai thừa của " + b + " là :" + factorials(b) );
		System.out.println("Giai thừa của " + c + " là :" + factorials(c) );
		System.out.println("Giai thừa của " + d + " là :" + factorials(d) );
		System.out.println(" Tổng của các giai thừa là : " + (factorials(a)+factorials(b)+factorials(c)+factorials(d)));
	}
	private static long factorials(int n) {
		  // dung de quy
	        if (n > 0) {
	            return n * factorials(n - 1);
	        } else {
	            return 1;
	        }
	    }
}
