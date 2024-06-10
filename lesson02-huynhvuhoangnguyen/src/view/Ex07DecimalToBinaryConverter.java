package view;

import java.util.Scanner;

public class Ex07DecimalToBinaryConverter {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// Nhập số hệ thập phân
		System.out.println("Input decimal number: ");
		int N = ip.nextInt();

		// Kiểm tra N khác 0
		if (N == 0) {
			System.out.println("Binary of 0 is 0.");
			return;
		}

		// Chuyển từ số thập phần sang số nhị phân
		StringBuilder binaryNumber = new StringBuilder();
		while (N > 0) {
			int remainder = N % 2;
			binaryNumber.append(remainder);
			N = N / 2;
		}
		System.out.println("Binary number result: " + binaryNumber);
		
		// Đảo ngược kết quả của quá trình chuyển đổi để có được số nhị phân đúng
		binaryNumber.reverse();

		System.out.println("Binary number is: " + binaryNumber.toString());
		ip.close();

	}
}