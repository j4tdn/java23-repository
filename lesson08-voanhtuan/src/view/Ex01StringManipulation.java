package view;

import java.util.Scanner;

public class Ex01StringManipulation {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập vào một chuỗi kí tự: ");
		String ip = sc.nextLine();

		// In ra mỗi kí tự trên một dòng
		System.out.println("\nMỗi kí tự trên một dòng:");
		for (int i = 0; i < ip.length(); i++) {
			System.out.println(ip.charAt(i));
		}

		// In ra mỗi từ trên một dòng
		System.out.println("\nMỗi từ trên một dòng:");
		String[] words = ip.split(" ");
		for (String word : words) {
			System.out.println(word);
		}

		// In ra chuỗi đảo ngược theo kí tự
		System.out.println("\nChuỗi đảo ngược theo kí tự:");
		String reversedByChar = new StringBuilder(ip).reverse().toString();
		System.out.println(reversedByChar);

		// In ra chuỗi đảo ngược theo từ
		System.out.println("\nChuỗi đảo ngược theo từ:");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}

}
