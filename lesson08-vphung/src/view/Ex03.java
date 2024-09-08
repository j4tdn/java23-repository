package view;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập chuỗi kí tự tiếng việt bất kì có dấu: ");
		String input = ip.nextLine();
		ip.close();
		
	    System.out.print("\nChuỗi không dấu: " + removeDiacritics(input));

	}

	 public static String removeDiacritics(String input) {
	        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
	        return normalized.replaceAll("\\p{M}", "");
	    }
}
