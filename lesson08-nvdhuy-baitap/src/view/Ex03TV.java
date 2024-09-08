package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03TV {
	 public static String removeDiacritics(String chuoi) {
	        
	        String chuoiNormalized = Normalizer.normalize(chuoi, Normalizer.Form.NFD);
	        
	        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	        return pattern.matcher(chuoiNormalized).replaceAll(""); 
	    }

	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập vào chuỗi Tiếng Việt có dấu: ");
	        String chuoiCoDau = scanner.nextLine();

	        
	        String chuoiKhongDau = removeDiacritics(chuoiCoDau);

	       
	        System.out.println("Chuỗi không dấu: ");
	        System.out.println(chuoiKhongDau);
	    }
}
