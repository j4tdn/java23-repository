package view;

import java.util.Iterator;
import java.util.Scanner;

public class Ex02NameFormat {

	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String inputName = "";
		
		do {
			System.out.println("Nhập họ tên : ");
			inputName = ip.nextLine().trim();
			if (inputName.matches("^[A-Za-z ]+$")) break;
			else System.out.println("Họ tên không hợp lệ !");
		}
		while (true);
		
		String[] splittedName = inputName.split("\\s+");
		
		StringBuilder formatName = new StringBuilder();
		for (String word : splittedName) {
			formatName.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
		}
		System.out.println("Tên : " +formatName);
	}
}
