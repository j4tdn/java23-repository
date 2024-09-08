package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03UnicodeWork {

	
	public static void main(String[] args) {
		System.out.println("Nhập chuỗi tiếng Việt: ");
		Scanner ip = new Scanner(System.in);
		String inputStream = ip.nextLine().trim();
		
//		for (int i = 0; i < inputStream.length(); i++) {
//            char c = inputStream.charAt(i);
//            System.out.printf("Ký tự: %c, Mã Unicode: %04x\n", c, (int) c);
//           }
		// normalize - form NFD tách dấu ra so với ký tự
		String temp = Normalizer.normalize(inputStream, Normalizer.Form.NFD);
		
//		for (int i = 0; i < temp.length(); i++) {
//	            char c = temp.charAt(i);
//	            System.out.printf("Ký tự: %c, Mã Unicode: %04x\n", c, (int) c);
//	       }
		//(diacritical marks) : pattern loại bỏ dấu thanh
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		
		// matcher(temp) -> tạo objecct Matcher -> check, tìm ký tự thuộc temp match với pattern
		// replaceAll của Matcher -> tìm các ký tự thuộc temp match với pattern -> thay thế = ""
		System.out.println("stream : "+ pattern.matcher(temp).replaceAll(""));

	
	}
}
