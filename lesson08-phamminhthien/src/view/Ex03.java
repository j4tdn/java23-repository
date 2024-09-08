package view;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập chuỗi kí tự tiếng việt bất kì có dấu: ");
		String input = ip.nextLine();
		ip.close();
//		String output = removeDiacritics(input);
	    System.out.print("\nChuỗi không dấu: "+removeDiacritics(input));
		
	}
	
	 public static String removeDiacritics(String input) {
	        // Normalize the input string
	        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
	        // Remove diacritics (accents)
	        return normalized.replaceAll("\\p{M}", "");
	    }
}
