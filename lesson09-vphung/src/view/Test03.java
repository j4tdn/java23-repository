package view;

public class Test03 {

	public static void main(String[] args) {
		
		String text = "Welcome   to JAVA10     class";
		System.out.println("Text ban đầu: " + text);
		
		System.out.println("\nText sau khi bỏ khoảng trắng:");
		System.out.println(removeSpace(text));
		
		System.out.println("\nText sau khi đảo chuỗi:");
		reverseText(text);
		
		
	}
	
	private static String removeSpace(String text) {
		String noSpace = text.replaceAll("\\s+", " ");
		// return new StringBuilder(noSpace).reverse().toString();
		return noSpace;
	}
	
	private static void reverseText(String... text) {
		String[] word = text;
		for (int i = word.length - 1; i >= 0; i--) {
	           System.out.print(word[i] + " ");
	     }
	}
	
	
}
