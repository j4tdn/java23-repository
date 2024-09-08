package bean;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {
//	Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước
//	số nguyên tố.
//	Ví dụ: Các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên tố là
//	3 và 5.
//	Yêu cầu: Cho trước hai số tự nhiên N, M. Hãy viết chương trình kiểm tra xem các
//	số này có là nguyên tố tương đương với nhau hay không?
//	Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
//	Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		Integer n = sc.nextInt();

		System.out.println("Enter M: ");
		Integer m = sc.nextInt();

		System.out.println(getPrimeFactory(n));
		System.out.println(getPrimeFactory(m));

		if (getPrimeFactory(m).equals(getPrimeFactory(n))) {
			System.out.println("yes");
		} else
			System.out.println("no");
	}

	private static Set<Integer> getPrimeFactory(int n) {
		Set<Integer> rs = new HashSet<>();

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				rs.add(i);
				n /= i;
			}
		}

		if (n > 2) {
			rs.add(n);
		}

		return rs;
	}
}
