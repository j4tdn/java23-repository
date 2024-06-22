package view;

import java.util.Scanner;

public class Ex05SymmetricalNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 0;
		boolean validInput = false;
		while (!validInput) {
			System.out.print("Nhập một số nguyên dương có ít nhất 2 chữ số: ");
			String input = scanner.nextLine();
			try {
				N = Integer.parseInt(input);
				if (N > 9) {
					validInput = true;
				} else {
					System.out.println("Lỗi: N phải là số nguyên dương có ít nhất 2 chữ số. Vui lòng nhậpk lại");
				}
			} catch (NumberFormatException e) {
				System.out.println("Lỗi: Nhập số hợp lệ");
			}
			
		}
		

		boolean isSymmetrical = isSymmetrical(N);
		System.out.println("Kết quả: " + isSymmetrical);
		scanner.close();
	}

	public static boolean isSymmetrical(int n) {
		int original = n;
		int reversed = 0; // đảo số

		while (n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}
		System.out.println("Đảo số : " + reversed);
		return original == reversed;
	}
	
}
