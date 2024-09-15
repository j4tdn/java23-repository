package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String[] sequences = { "01a2b3456cde478", "aa6b326c6e22h", "aa6b546c6789110e22h" };

		int[] numbers = new int[sequences.length];
		int k = 0;
		for (String sequence : sequences) {
			numbers[k++] = getLargestNumbers(sequence);
		}
		System.out.println("Kết quả --> " + Arrays.toString(numbers));
	}

	private static int getLargestNumbers(String text) {
		String[] numbersText = text.split("[^0-9]+");
		int n = 0;
		for (String numberText : numbersText) {
			if (!numberText.isEmpty()) {
				int number = Integer.parseInt(numberText);
				if (n < number) {
					n = number;
				}
			}
		}
		return n;
	}
}