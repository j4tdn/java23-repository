package view;

public class Ex03 {
	public static void main(String[] args) {
		String s = "Welcome to        JAVA10   class";
		System.out.println(s);
		System.out.println(revert(s));
	}

	private static String revert(String s) {
		String rs = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ')
			{
				int j = i - 1;
				if (s.charAt(j) == ' ') {
					continue;
				}
			}
			rs += s.charAt(i);
		}
		return rs;
	}
}
