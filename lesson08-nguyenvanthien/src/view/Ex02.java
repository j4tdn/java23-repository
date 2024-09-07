package view;

import java.util.Scanner;

public class Ex02 {
	/*
	 * Viết chương trình cho phép người dùng nhập vào họ tên sau, in ra kết quả theo yêu cầu sau:

		Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
		Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
		Các từ cách nhau một khoảng trắng
		Ví dụ: aDam Le vAN john Son => Adam Le Van John Son
		Anne frAnk => Anne Frank
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập Họ Và tên");
		String input = sc.nextLine();
		
		String[] words = input.trim().split("\\s+");
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			if(!word.isEmpty()) {
				
			}
		}
		
	}
}
