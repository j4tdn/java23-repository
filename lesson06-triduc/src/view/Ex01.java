package view;

import java.util.Scanner;

public class Ex01 {
//	Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím. Sử dụng try -
//	catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ. Bẫy lỗi chia 0,
//	trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra
//	kết qua x = -b/a
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("aX + b = 0");

		do {
			Integer a = inputInteger("a");
			Integer b = inputInteger("b");
			try {
				Integer div = (-b) / a; // Khai báo int để test bẫy lỗi! đúng sẽ là double mà double thì chia 0 bth...
				System.out.println("Result: x = " + div);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Can't divide with 0 !!");
			}
		} while (true);
	}

	private static Integer inputInteger(String variable) {
		do {
			try {
				System.out.print("Enter the number of " + variable + ": ");
				String input = sc.nextLine();
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Invalid number, please try again!");
			}
		} while (true);

	}
}
