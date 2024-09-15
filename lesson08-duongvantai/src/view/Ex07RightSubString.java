package view;

import java.util.Arrays;

import bean.Pair;

public class Ex07RightSubString {

	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		System.out.println("pairs: " + Arrays.toString(getLongestRightSubString(getRightSubString(s))));
		
	}
	private static Pair[] getLongestRightSubString(Pair [] pairs) {
		int maxLength = Integer.MIN_VALUE;
		for(Pair pair:pairs) {
			maxLength = Integer.max(maxLength, pair.getValue().length());
		}
		Pair [] result = new Pair[pairs.length];
		int count = 0;
		for(Pair pair:pairs) {
			if(pair.getValue().length() == maxLength) {
				result[count++] = pair;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static Pair [] getRightSubString(String s) {
		Pair[] pairs = new Pair[s.length()];
		int start = 0;
		int count = 0;
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i- 1)) {
				 pairs[count++] = Pair.of(s.substring(start), start);
			start = i;
		}
			
	}

}
}
