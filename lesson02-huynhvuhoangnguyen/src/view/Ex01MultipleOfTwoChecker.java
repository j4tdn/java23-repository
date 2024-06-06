package view;

import java.util.Scanner;

public class Ex01MultipleOfTwoChecker {
	
	public static boolean isMultipleOfTwo(int n) {
		return n % 2 == 0;
	}

	public static int getValidInput() {
		Scanner ip = new Scanner(System.in);
		int attempts = 0;

		while (attempts < 5) {
			System.out.println("Input positive integer N: ");
			// try...catch block dùng để xử lý lỗi xảy ra trong code
			// vì đề bài yêu cầu in ra thông báo lỗi khi số nhập vào không phải số nguyên dương
			
			// block code kiểu tra lỗi
			try {
				int n = Integer.parseInt(ip.nextLine());
				if (n > 0) {
					return n;
				} else {
					System.out.println("Input is not a positive integer. Please try again");
				}
			} catch (NumberFormatException e) { // block code xử lý khi có lỗi xảy ra
				System.out.println("Invalid input. Please enter an Integer");
			}
			// NumberFormatException: lỗi xảy ra khi chương trình chuyển đổi một string sang kiểu số
			// nhưng string không thuộc định dạng phù hợp. Trong trường hợp này là số nguyên dương.
			attempts++;
		}
		ip.close();
		System.out.println("You have exceeded the maximum of 5 attempts. The program will terminate!");
		return -1; // Trả về -1 chỉ ra đầu vào không hợp lệ sau 5 lần nhập
	}

	public static void main(String[] args) {
		int n = getValidInput();
		if (n != -1) {
			if (isMultipleOfTwo(n)) {
				System.out.println(n + " is multiple of 2.");
			} else {
				System.out.println(n + " is not multiple of 2");
			}
		}
	}

}
