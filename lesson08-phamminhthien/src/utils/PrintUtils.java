package utils;

public class PrintUtils {
	
	public PrintUtils() {
	}
	
	public static String printOneLine(String words) {
		for(int i=0; i< words.length(); i++) {
			 words.charAt(i);
		}
		return words;
	}
	
	public static String[] printSWords(String words) {
		String[] S = words.split("[\\s-]+");
		for(int i=0; i< S.length; i++) {
//			System.out.println("-> " + S[i]);
		}
		return S;
	}
	
	public static void printReverseCharacter(String words) {
		for(int i=words.length() - 1; i>= 0; i--) {
			System.out.println("-> " + words.charAt(i));
		}
	}
	
	public static void printReverseWords(String words) {
		String[] S = words.split("[\\s-]+");
		for(int i=S.length - 1; i>= 0; i--) {
			System.out.println("-> " + S[i]);
		}
	}
}
