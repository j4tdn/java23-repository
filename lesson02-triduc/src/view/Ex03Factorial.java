package view;

import java.util.Scanner;

public class Ex03Factorial {
//	Viết chương trình tìm giai thừa của một số nguyên dương N
//	Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
//	Ví dụ: Nhập N = 1 → 1! = 1
//	Nhập N = 5 → 5! = 5.4.3.2.1 = 120
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		System.out.println(n+ "!" + ": " + calcFactorialOfN(n));
	}
	
	private static int calcFactorialOfN(int n) {
		int sum = 1;
		for(int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		return sum;
	}
}
