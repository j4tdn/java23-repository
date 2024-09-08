package view;

import java.util.Scanner;

public class Ex01StringOperation {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Nhập chuỗi:");
		String text = ip.nextLine();
		
		System.out.println("1. In ra mỗi ký tự trên một dòng:");
		for(int i = 0; i < text.length(); i++)
			System.out.print(text.charAt(i) + " ");
		
		System.out.println("\n2. In ra mỗi từ trên mỗi dòng:");
		String[] words = text.trim().split("\\s+");
		for(String word: words)
			System.out.println(word);
		
		System.out.println("3. In ra chuỗi đảo ngược theo kí tự:");
		for(int i = text.length() - 1; i >= 0; i--)
			System.out.print(text.charAt(i));
		
		System.out.println("\n4. In ra chuỗi đảo ngược theo từ:");
		for(int i = words.length - 1; i >= 0; i--)
			System.out.print(words[i] + " ");
			
	}
}
