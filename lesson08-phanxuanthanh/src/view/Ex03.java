package view;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	
	public static void main(String[] args) {
		String input = "Em có yêu anh không anh để anh biết còn chờ\r\n"
				+ "Em xin lỗi em đã có thái độ không đúng với anh";
		
		String result = unsignedString(input);
		System.out.println(result);
	}
	
	public static String unsignedString(String input) {
		String temp = Normalizer.normalize(input, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("").replaceAll("đ", "d");
	}
}