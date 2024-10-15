package view;

public class Ex04SortString {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		String[] ascendingSorted = sortArray(strings, true);
		System.out.println("\nSắp xếp tăng dần:");
		printArray(ascendingSorted);

		String[] descendingSorted = sortArray(strings, false);
		System.out.println("\nSắp xếp giảm dần:");
		printArray(descendingSorted);
	}

	public static void printArray(String[] array) {
		for (String s : array) {
			System.out.print((s != null ? s : "null") + " ");
		}
		System.out.println();
	}

	public static String[] sortArray(String[] strings, boolean ascending) {
		int n = strings.length;
		String[] special = new String[n];
		String[] negatives = new String[n];
		String[] positives = new String[n];
		String[] words = new String[n];
		String[] nulls = new String[n];

		int specialCount = 0, negCount = 0, posCount = 0, wordCount = 0, nullCount = 0;

		for (String s : strings) {
			if (s == null) {
				nulls[nullCount++] = null;
			} else if (s.equals("Special")) {
				special[specialCount++] = s;
			} else if (isInteger(s)) {
				int num = Integer.parseInt(s);
				if (num < 0) {
					negatives[negCount++] = s;
				} else {
					positives[posCount++] = s;
				}
			} else {
				words[wordCount++] = s;
			}
		}

		bubbleSort(special, specialCount, ascending);
		bubbleSort(negatives, negCount, ascending);
		bubbleSort(positives, posCount, ascending);
		bubbleSort(words, wordCount, ascending);

		if (ascending) {
			return mergeArrays(special, negatives, positives, words, nulls, specialCount, negCount, posCount, wordCount,
					nullCount);
		} else {
			return mergeArrays(nulls, words, positives, negatives, special, nullCount, wordCount, posCount, negCount,
					specialCount);
		}
	}

	private static boolean isInteger(String s) {
		if (s.isEmpty())
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(i) == '-')
				continue;
			if (!Character.isDigit(s.charAt(i)))
				return false;
		}
		return true;
	}

	private static void bubbleSort(String[] array, int count, boolean ascending) {
		for (int i = 0; i < count - 1; i++) {
			for (int j = 0; j < count - i - 1; j++) {
				if (compare(array[j], array[j + 1], ascending) > 0) {
					// Swap
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	private static int compare(String a, String b, boolean ascending) {
		if (ascending) {
			return a.compareTo(b);
		} else {
			return b.compareTo(a);
		}
	}

	private static String[] mergeArrays(String[] first, String[] second, String[] third, String[] fourth,
			String[] fifth, int firstCount, int secondCount, int thirdCount, int fourthCount, int fifthCount) {
		String[] result = new String[firstCount + secondCount + thirdCount + fourthCount + fifthCount];
		int index = 0;

		for (int i = 0; i < firstCount; i++)
			result[index++] = first[i];
		for (int i = 0; i < secondCount; i++)
			result[index++] = second[i];
		for (int i = 0; i < thirdCount; i++)
			result[index++] = third[i];
		for (int i = 0; i < fourthCount; i++)
			result[index++] = fourth[i];
		for (int i = 0; i < fifthCount; i++)
			result[index++] = fifth[i];

		return result;
	}
}
