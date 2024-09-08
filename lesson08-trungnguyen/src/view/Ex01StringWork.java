package view;

import java.util.Scanner;

public class Ex01StringWork {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập chuỗi : ");
		String inputString = ip.nextLine().trim();
		
		System.out.println("=== 1. In ra mỗi ký tự trên mỗi dòng ===");
		for (int i = 0; i < inputString.length(); i++)
			System.out.println("-> " + inputString.charAt(i));
		
		System.out.println("=== 2. In ra mỗi từ trên mỗi dòng ===");
		String[] inputStringToArray = inputString.split("\\s+");
		for (String word: inputStringToArray) {
			System.out.println("-> " + word);
		}

		System.out.println("=== 3. In ra chuỗi đảo ngược theo ký tự ===");
		for (int i = inputString.length()-1; i >= 0; i--) {
			System.out.println("-> " + inputString.charAt(i));
		}
		
		System.out.println("=== 4. In ra chuỗi đảo ngược theo từ ===");
		for (int i = inputStringToArray.length-1; i >= 0; i--) {
			System.out.println("-> " + inputStringToArray[i]);
		}
	}
}
