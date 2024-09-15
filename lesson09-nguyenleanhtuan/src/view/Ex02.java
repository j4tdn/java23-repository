package view;

public class Ex02 {

	public static void main(String[] args) {
		String string = "01a2b3456cde478 aa6b546c6e22h aa6b326c6e22h";
//		String n2 = "aa6b546c6e22h aa6b326c6e22h";
		
	}
	
	private static String[] getStrings(String str) {
		String[] strs = null;
		
		if (str.indexOf(" ") != -1) {
			strs = str.split(" ");
		}
		
		return strs;
	}
	
}
