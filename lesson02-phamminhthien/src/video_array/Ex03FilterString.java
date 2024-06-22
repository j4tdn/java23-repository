package video_array;

import java.util.Arrays;

public class Ex03FilterString {
	public static void main(String[] args) {
		String[] students = {"Peter Croud", "KaKa", "Valdes", "Patrick Veria"};
		System.out.println(Arrays.toString(getStudents(students)));
		
	}
	
	private static String[] getStudents(String []elements) {
		//Peter Croud, Patrick Veria, null, null
		String []result = new String[elements.length];
		int count=0;
		for(String element:elements) {
			if(element.startsWith("P")) {
				result[count] = element;
				count++;
			}//Peter Croud, Patrick Veria, null, null

		}
		return Arrays.copyOfRange(result, 0, 2); // số 2 là biến count
	}
}
