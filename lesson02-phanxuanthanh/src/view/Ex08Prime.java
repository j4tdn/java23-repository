/*
	 	Bài 8: Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
	Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
	(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
	
	= 4 → false
	= 7 → true
 */
package view;

import java.util.Scanner;

public class Ex08Prime {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int i = 0;
		int count = 1;
		while (i == 0) {
			System.out.print("ENTER N: ");
			String input = ip.nextLine().trim();
			if (count == 5) {
				System.out.println("ENTER MORE THAN 5 TIMES , END");
				break;
			}
			if (isValidNumber(input)) {
				int number = Integer.parseInt(input);
				if (isPrime(number)) {
					System.out.println(input + " --> True");
				} else {
					System.out.println(input + " --> False");
				}
			} else {
				System.out.println("ERROR, PLEASE RE-ENTER.");
				count++;
			}
		}
		ip.close();
	}
	private static boolean isPrime(int N) {
		if (N <= 1) {
			return false;
		}
		if (N <= 3) {
			return true;
		}
		if (N % 2 == 0 || N % 3 == 0) {
			return false;
		}
		int i = 5;
		while (i * i <= N) {
			if (N % i == 0 || N % (i + 2) == 0) {
				return false;
			}
			i = i + 6;
		}
		return true;
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
