package view;

import java.util.Arrays;

public class Ex05LongestSubString {

	public static void main(String[] args) {
		//   từng kí tự giống nhau tại từng vị trí 
		String s1 = "as";
		String s2 = "xc";
		String [] commonSubStrings = getsCommonSubString(s1,s2);
		String [] longestCommonSubString = getsLongestCommonSubString(commonSubStrings);
		System.out.println("longest common sub string --> " + Arrays.toString(longestCommonSubString));
		
	}
	private static String []getsLongestCommonSubString(String []comonSubString){
		int maxLength = Integer.MIN_VALUE;
		for(String subString : comonSubString) {
			if(maxLength < subString.length()) {
				maxLength = subString.length();
			}
		}
		String [] result = new String [comonSubString.length];
		int count = 0;
		for(String suString: comonSubString) {
			if(suString.length() == maxLength) {
				result[count++] = suString;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static String [] getsCommonSubString(String s1, String s2) {
		int length = Math.min(s1.length(),s2.length() );
		String [] result = new String[length];
		int count = 0;
		
		int start = -1;
		for(int i = 0; i < length; i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				if(!hasFirstDupLetter(start)) {
					start =i;
				}
				if(i == length -1) {
					String commonSubString= s1.substring(start, length);
					result[count++] = commonSubString;
				}
			}else if(hasFirstDupLetter(start)){
				String commonSubString= s1.substring(start, i);
				result[count++] = commonSubString;
				start = -1;
			}
		}
		return Arrays.copyOfRange(result , 0, count);
	}
	private static boolean hasFirstDupLetter(int start) {
		return start != -1;
	}
}
