package src;

import java.util.Scanner;

public class Ex04 {

	public static long gcd (long a , long b) {
		while (b != 0) {
			long temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so tu nhien N: ");
		long N = sc.nextLong();
		System.out.println("Nhap so tu nhien M: ");
		long M = sc.nextLong();
		
		if (M < 2 || N < M || N > 300000000000000000L) {
			System.out.println("Gia tri cua M va N khong hop le ");
			return;
		}
		
		long UCLN = gcd(N, M);
		if (UCLN > 1) {
			System.out.println("YES");
		}	else System.out.println("NO");
	}
	
}
