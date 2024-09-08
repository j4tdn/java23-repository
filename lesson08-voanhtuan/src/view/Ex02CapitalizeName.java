package view;

import java.util.Scanner;

public class Ex02CapitalizeName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập vào họ tên: ");
		String ip = sc.nextLine().toLowerCase().trim();

		// Tách từng từ trong họ tên
		String[] words = ip.split("\\s+");

		// Xử lý viết hoa chữ cái đầu của mỗi từ
		StringBuilder capitalizedFullName = new StringBuilder();
		for (String word : words) {
			if (!word.isEmpty()) {
				capitalizedFullName.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
			}
		}

		System.out.println("Kết quả: " + capitalizedFullName.toString().trim());
	}
}
