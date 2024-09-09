package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	/*
	 Bài 4: Số nguyên tố tương đương
	 Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước
	 số nguyên tố.
	 Ví dụ: Các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên tố là
	 3 và 5.
	 Yêu cầu: Cho trước hai số tự nhiên N, M. Hãy viết chương trình kiểm tra xem các
	 số này có là nguyên tố tương đương với nhau hay không?
	 Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
	 Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO.
	 */
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		System.out.println("is relevant prime numbers -->"+ isRelevantPrimes(75,15));
	}
	//equivalent
	//relevant
	private static boolean isRelevantPrimes(long n1,long n2) {
		return Arrays.equals(getDividedPrimeNumbers(n1), getDividedPrimeNumbers(n1));
		
	}
	private static long[] getDividedPrimeNumbers(long number) {
		long[] divisible = new long[Integer.MAX_VALUE];
		int count =0;
		for(int i = 2 ;i<=number/2;i++) {
			if(number % i ==0) {
				divisible[count++]= i;
			}
		}
		return Arrays.copyOfRange(divisible, 0, count);
	}
	private static boolean isPrime(long number) {
		if(number <2) {
			return false;
		}
		
		for(long i = 2;i<number;i++) {
			if(number % i==0) {
				return false;
			}
		
			
		}
	}
}
