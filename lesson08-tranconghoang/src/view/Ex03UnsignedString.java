package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03UnsignedString {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Nhập chuỗi tiếng việt: ");
		String text = ip.nextLine();
		String result = removeAccents(text);
		System.out.println("\n--> " + result);

	}

	private static String removeAccents(String text) {
		// chuan hoa dang Unicode
		String normalized = Normalizer.normalize(text, Normalizer.Form.NFD);

		Pattern accentPattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

		String result = accentPattern.matcher(normalized)
									 .replaceAll("")
									 .replaceAll("đ", "d")
									 .replaceAll("Đ", "D");
		return result;
	}
}
