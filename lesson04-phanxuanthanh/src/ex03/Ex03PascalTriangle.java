package ex03;

import java.util.Scanner;

public class Ex03PascalTriangle {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(ip.nextLine()) + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%3d", pascal(j, i));
			}
			System.out.println("\n");
		}
		ip.close();
	}

	private static int pascal(int k, int n) {
		if (k == 0 || k == n)
			return 1;
		return pascal(k, n - 1) + pascal(k - 1, n - 1);
	}
}
