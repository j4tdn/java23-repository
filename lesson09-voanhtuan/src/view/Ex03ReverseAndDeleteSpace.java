package view;

public class Ex03ReverseAndDeleteSpace {

	public static void main(String[] args) {
		String input = "Welcome     to JAVA23    class";
		System.out.println("Chuỗi ban đầu:\n" + input);
		String result = revert(input);
		System.out.println("\nKết quả:\n" + result);
	}
	
	public static String revert(String s) {
		String trimmed = s.trim().replaceAll("\\s+", " ");
		StringBuilder reversed = new StringBuilder(trimmed).reverse();
		return reversed.toString();
	}

}
