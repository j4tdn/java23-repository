package Ex03Revert;

public class Main {
	public static void main(String[] args) {
		String input = " Welcome   to JAVA10   class ";
		System.out.println(revert(input));
		
	}
	
	private static String revert(String s) {
		String output = " ";
		String[] words = s.strip().replaceAll(s, output).split(" ");
		                                    // ("\\s{1,}", " ")
		for(String word: words) {
			for(int i = word.length()-1; i>=0; i--) {
				output = output.concat(word.charAt(i)+ " ");
			output = output.concat(" " );
			}
		}
		return output;
		
	}

}
