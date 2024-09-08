package view;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04EquivalentPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số tự nhiên N: ");
		long N = sc.nextLong();
		System.out.print("Nhập số tự nhiên M: ");
		long M = sc.nextLong();

		if (M < 2 || N < M || N > 300000000000000000L) {
			System.out.println("Giá trị của M và N không hợp lệ");
			return;
		}

		// Lấy tập hợp các ước số nguyên tố của N và M
		Set<Long> primeFactorsN = getPrimeFactors(N);
		Set<Long> primeFactorsM = getPrimeFactors(M);

		if (primeFactorsN.equals(primeFactorsM)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static Set<Long> getPrimeFactors(long num) {
		Set<Long> primeFactors = new HashSet<>();

		// Kiểm tra 2 là ước số nguyên tố hay không
		while (num % 2 == 0) {
			primeFactors.add(2L);
			num /= 2;
		}
		// Kiểm tra các số lẻ là ước số nguyên tố
		for (long i = 3; i * i <= num; i += 2) {
			while (num % i == 0) {
				primeFactors.add(i);
				num /= i;
			}
		}
		// Nếu num còn lại là số nguyên tố lớn hơn 2
		if (num > 2) {
			primeFactors.add(num);
		}
		
		return primeFactors;
	}

}
