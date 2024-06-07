package videoArray;


import java.util.Arrays;

public class Ex03ArrayFilterString {
	public static void main(String[] args) {
		String[] students = {"Peter Cloud", "Michael Jackson", "Valdie", "Kaka", "Patrick"};
		System.out.println(Arrays.toString(getStudents(students)));
	}
		
		
	private static String[] getStudents(String[] elements) {
		String[] rs = new String[elements.length];
		int count = 0;
		for (String s : elements) {
			if(s.startsWith("P")){
				rs[count] = s;
				count++;
			}
		}
		return Arrays.copyOfRange(rs, 0, count); //Get dữ liệu từ mảng rs từ 0 đến count -> trả về 1 mảng khác
	}
}
