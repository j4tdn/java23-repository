package view;

public class Ex03StreamProcessing {
	
	public static void main(String[] args) {
		String input = "   Welcome to JAVA10 class   ";
		revert(input);
	}
	private static void revert(String input) {
		String[] words = input.strip().split("\\s+");
		for (String word : words) {
			for (int i = word.length() -1 ; i >= 0  ; i--) {
				System.out.print(word.charAt(i));	
			}
			System.out.print(" ");
		}
	}
}
