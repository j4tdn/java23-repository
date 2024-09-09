package view;

import java.util.Scanner;

public class Ex01String {
	
	/*
	 * Bài 1: Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
	   Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
	   In ra mỗi kí tự trên một dòng
	   In ra mỗi từ trên mỗi dòng
	   In ra chuỗi đảo ngược theo kí tự
       In ra chuỗi đảo ngược theo từ
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào Chuỗi");
		String input = sc.nextLine();
		
		
		System.out.println("In ra mỗi kí tư trên 1 dòng :");
		for(int i=0;i< input.length();i++) {
			System.out.println(input.charAt(i));
		}
		
		System.out.println("==============");
		
		System.out.println("Mỗi từ trên 1 dòng");
		String[] words = input.trim().split("\\s+");
		for (String word: words) {
			System.out.println(word);
		}
		System.out.println("==============");
		
		System.out.println("In ra chuỗi đảo ngược kí tự");
		String Reverse= new StringBuilder(input).reverse().toString();
		System.out.println(Reverse);
		
		System.out.println("==============");
		
		System.out.println("In ra chuỗi đảo ngược theo từ");
		for(int i= words.length -1;i>=0;i--) {
			System.out.println(words[i]+(i ==0 ? " ":" "));
		}
	}
}
