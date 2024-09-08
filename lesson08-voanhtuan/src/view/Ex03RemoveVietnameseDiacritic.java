package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03RemoveVietnameseDiacritic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi tiếng Việt có dấu: ");
        String input = scanner.nextLine();

        String noAccentString = removeVietnameseAccent(input);

        System.out.println("\nChuỗi không dấu: ");
        System.out.println(noAccentString);
    }

	
    public static String removeVietnameseAccent(String str) {
        // Chuẩn hóa chuỗi thành dạng Unicode
        String normalized = Normalizer.normalize(str, Normalizer.Form.NFD);
        
        // Loại bỏ các dấu kết hợp bằng biểu thức chính quy
        // Cái này em học trên mạng ạ.
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("").replace("đ", "d").replace("Đ", "D");
    }
	
}
