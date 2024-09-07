package view;

import java.util.Scanner;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {

	/*
	 3: Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả là chuỗi
		không dấu.
	    Input: Em có yêu anh không anh để anh biết còn chờ
		Em xin lỗi em đã có thái độ không đúng với anh
		Output: Em co yeu anh khong de anh biet con cho
		Em xin loi em da co thai do khong dung voi anh
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hãy nhập vào chuỗi tiếng việt ");
		String input = sc.nextLine();

		// Loại bỏ dấu
		String output = removeVietNamese(input);
		System.out.println("In ra chuỗi không dấu: " + output);

	}

	public static String removeVietNamese(String str) {
		// Chuyển đổi thành dạng unicode
		String normalized = Normalizer.normalize(str, Normalizer.Form.NFD);
		// loại bỏ các dấu  các từ từ các phím nút chữ tổ hợp
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(normalized).replaceAll("").replace('đ', 'd').replace('Đ', 'D');
	}
}