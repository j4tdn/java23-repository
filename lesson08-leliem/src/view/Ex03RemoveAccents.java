package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03RemoveAccents {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		
		System.out.println("Enter a Vietnamese string with accents:");
		String inputString = ip.nextLine();
		String resultString = removeAccents(inputString);

		System.out.println("Result:");
		System.out.println(resultString);
	}

	public static String removeAccents(String input) {
		String normalizedString = Normalizer.normalize(input, Normalizer.Form.NFD);

		Pattern accentPattern = Pattern.compile("\\p{M}");
		String result = accentPattern.matcher(normalizedString).replaceAll("").replaceAll("đ", "d").replaceAll("Đ", "D");;

		return result;
	}
}
