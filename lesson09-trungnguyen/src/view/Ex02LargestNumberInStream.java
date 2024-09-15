package view;

import java.util.Arrays;

public class Ex02LargestNumberInStream {

	
	public static void main(String[] args) {
		String[] streams = new String [3];
		streams[0] = "01a2b3456cde478";
		streams[1] = "aa6b546c6e22h";
		streams[2] = "aa6b326c6e22h:";
		for (int i = 0; i < 3; i++) {
			System.out.println("-->" + getLargestNumber(getNumbers(streams[i])));
		}
		
	}
	
	private static String[] getNumbers(String stream) {
		if (stream.equals("")) {
			return null;
		}
		int start = -1;
		int count = 0;
		String[] numberInString = new String[stream.length()];
		for (int i = 0; i < stream.length(); i++) {
			if (stream.charAt(i) >= '0' && stream.charAt(i) <= '9') {
				if (start == -1) {
					start = i;
				}
			} else if (start != -1){
				numberInString[count++] = stream.substring(start, i);
				start = -1;
			}
		}
		if (start != -1 ) {
			numberInString[count++] = stream.substring(start, stream.length());
			
		}
		if (count == 0) {
			count = 1;
			numberInString[0] = "0";
		}
		return Arrays.copyOfRange(numberInString, 0, count);
	}
	private static int getLargestNumber(String[] numbersInString) {
		if (numbersInString == null) {
			return 0;
		}
		int[] result = new int[numbersInString.length];
		int count = 0;
		Integer maxNumber = Integer.MIN_VALUE;
		for (String number : numbersInString) {
			result[count++] = Integer.valueOf(number); 
		}
		for (int i = 0; i < result.length; i++) {
			if (maxNumber < result[i]) maxNumber = result[i];
		}
		return maxNumber;
	}
}
 
