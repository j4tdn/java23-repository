/*
	Bài 3: Viết chương trình tìm giai thừa của một số 	nguyên dương N	
	Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
	Ví dụ: Nhập N = 1 → 1! = 1
	Nhập N = 5 → 5! = 5.4.3.2.1 = 120
*/
package view;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int count = 1;
		while (true) {
			System.out.print("ENTER N: ");
			String input = ip.nextLine().trim();
			if (count == 5) {
				System.out.println("ENTER MORE THAN 5 TIMES , END");
				break;
			}
			if (isValidNumber(input)) {
				int number = Integer.parseInt(input);
				long result = Factorial(number);
				System.out.println(number + "! = " + result);
			} else {
				System.out.println("ERROR, PLEASE RE-ENTER.");
				count++;
			}
		}
		ip.close();
	}

	private static long Factorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

	public static boolean isValidNumber(String str) {
		if (str.isEmpty()) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}