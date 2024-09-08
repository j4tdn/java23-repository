package bean;

import java.text.Normalizer;

public class Ex03 {
	public static void main(String[] args) {
		String input = "Em có yêu anh không anh để anh biết còn chờ "
				+ "Em xin lỗi em đã có thái độ không đúng với anh";
		String output = removeAccent(input);

		System.out.println(output);
	}

	public static String removeAccent(String input) {
		String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
		return normalized.replaceAll("[\\p{M}]", "");
	}
}
