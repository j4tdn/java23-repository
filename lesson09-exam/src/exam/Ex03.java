package exam;

public class Ex03 {
	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		String result = revert(input);
		System.out.println(result);
	}

	public static String revert(String s) {
		String trimmed = s.trim().replaceAll("\\s+", " ");
		StringBuilder reversed = new StringBuilder(trimmed).reverse();
		return reversed.toString();
	}
}
