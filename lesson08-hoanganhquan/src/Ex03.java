import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập chuỗi tiếng việt có dấu: ");
		String input = sc.nextLine();
		
		String output = removeAccents(input);
		
		System.out.println("Chuỗi không dấu: " + output);
	}
	
	public static String removeAccents (String input) {
		String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(normalized).replaceAll("").replace("đ", "d").replace("Đ", "D");
	}
}
