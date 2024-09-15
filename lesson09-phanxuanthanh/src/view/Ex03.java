package view;

public class Ex03{
	
	public static void main(String[] args) {
		String text = "Welcome    to JAVA10     class              Heloooo";
		System.out.println("result --> " + reverse(text));
		
	}
	private static String reverse(String text) {
		// Loại bỏ khoảng trắng
		text = text.strip().replaceAll("\\s+", " ");
		// Đảo chuỗi
		String[] words = text.split("\\s");
		String[] result = new String[words.length];
		int k = 0;
		for(String word: words) {
			result[k] = new StringBuilder(word).reverse().toString();
			k++;
		}
		
		return String.join(" ", result);
	}
}