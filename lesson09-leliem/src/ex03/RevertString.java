package ex03;

public class RevertString {

	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		String output = revert(input);
		System.out.println("output: " + output);
	}

	private static String revert(String s) {
		String trimed = s.trim();
		String singleSpaced = trimed.replaceAll("\\s+", " ");
        
		String[] words = singleSpaced.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word: words) {
			StringBuilder reversedword = new StringBuilder(word);
			result.append(reversedword.reverse().toString()).append(" ");
			
		}
		return result.toString().trim();
	}
}
