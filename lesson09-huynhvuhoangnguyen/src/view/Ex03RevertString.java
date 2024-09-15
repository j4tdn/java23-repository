package view;

public class Ex03RevertString {

	public static void main(String[] args) {
		
		String input = "Welcome to JAVA10 class";
		System.out.println("Reversed string: " + revert(input));
		
	}
	
	private static String revert(String s) {
		String removeWhiteSpaces = s.trim().replaceAll("\\s", " ");
		StringBuilder reversed = new StringBuilder(removeWhiteSpaces).reverse();
		return reversed.toString();
	}
	
}
