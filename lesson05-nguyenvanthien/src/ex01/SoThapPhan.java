package ex01;

import java.util.Scanner;

public class SoThapPhan {
	/*
	  Bài 1 (20đ): Viết chương trình nhập vào 1 số thực có phần thập phân khác 0.
	 Yêu cầu nhập lại(tối đa 3 lần) nếu nhập sai Sau đó tìm phân số tối giản của
	  số thập phân đó. Ví dụ ▪ 0.1 → 1/10 ▪ 0.2 → 1/5 ▪ 0.04 → 1/25 ▪ 0.75 → 3/4 ▪
	  1.5 → 3/2
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double input = 0.0;
		boolean validInput = false;
		int attempts = 0;

		while (!validInput && attempts < 3) {
			System.out.print("hay nhap vao so thap phan ");
			if (scanner.hasNextDouble()) {
				input = scanner.nextDouble();
				if (input != Math.floor(input)) {
					validInput = true;
				} else {
					System.out.println("nhap sai ");
				}
			} else {
				System.out.println("nhap sai hay nhap lai");
				scanner.next();
			}
			attempts++;
		}

		if (validInput) {
			System.out.println("phan so toi gian " + getMinFract(input));
		} else {
			System.out.println("da nhap qua 3  lan");
		}

		scanner.close();
	}

	public static String getMinFract(double number) {
		int sign = number < 0 ? -1 : 1;
		number = Math.abs(number);

		String numStr = String.valueOf(number);
		int digitsDec = numStr.length() - 1 - numStr.indexOf('.');

		int denom = 1;
		for (int i = 0; i < digitsDec; i++) {
			number *= 10;
			denom *= 10;
		}

		int num = (int) Math.round(number);

		int gcd = gcd(num, denom);
		return (sign * (num / gcd)) + "/" + (denom / gcd);
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
}
