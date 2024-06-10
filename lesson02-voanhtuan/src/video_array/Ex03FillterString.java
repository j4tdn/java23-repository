package video_array;

import java.util.Arrays;

public class Ex03FillterString {
	public static void main(String[] args) {
		
		int[] numbers = {15,16,17,18,19};
		int[] copied = Arrays.copyOfRange(numbers, 0, 3);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(copied));
		
		System.out.println("=====================");
		
		String[] students = { "Peter Croud", "Kaka", "Valdes", "Peter Croud" };
		
		System.out.println(Arrays.toString(getStudents(students)));

	}

	private static String[] getStudents(String[] elements) {
		// Peter Croud, Peter Croud, null, null
		String[] result = new String[elements.length];
		int count = 0;
		for (String element : elements) {
			if (element.startsWith("P")) {
				result[count] = element;
				count++;
			}
		}
		//return Arrays.copyOfRange(original, from, to);
		return Arrays.copyOfRange(result, 0, count);
	}
}
