package view;

public class Ex03Spacing {
	public static void main(String[] args) {
		String input = "Welcome         to          JAVA10         class";
		
		String result = Revert(input);
		System.out.println(result);
	}
	
	private static String Revert (String input) {
		String trimmedString = input.trim().replaceAll("\\s+", " ");
		
		StringBuilder reverdString = new StringBuilder (trimmedString);
		reverdString.reverse();
		
		return reverdString.toString();
	}
}
