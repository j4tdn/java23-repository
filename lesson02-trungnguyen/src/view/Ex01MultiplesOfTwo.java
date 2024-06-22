package view;

import java.util.Scanner;

public class Ex01MultiplesOfTwo {
	public static void main(String[] args) {
		// open connection to keyboard
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int N = 0;
		boolean validInput = false;

		// input N, 5 lan
		while (count < 5 && !validInput) {
			System.out.print("nhập một số nguyên dương N: ");
			//nextLine để xoá enter
			String input = scanner.nextLine();
			try {
				N = Integer.parseInt(input);
				if (N > 0) {
					validInput = true;
				} else {
					System.out.println("Lỗi: N phải là số nguyên dương, nhâpk lại");
					count++;
				}
			} catch (NumberFormatException e) {
				System.out.println("Lỗi: vui lòng nhập một số nguyên dương hợp lệ");
				count++;
			}
		}

		// Kiểm tra nếu đã nhập thành công sau tối đa 5 lần thử
		if (validInput) {
			// Kiểm tra N có phải là bội của 2 hay không
			boolean isMultipleOf2 = N % 2 == 0;
			System.out.println("Kết quả: " + isMultipleOf2);
		} else {
			System.out.println("Quá số lần thử tối đa, chương trình kết thúc");
		}
		scanner.close();
	}
}
