package view;

import java.util.Arrays;

import Functional.StringComparator;

public class Ex04BubbleSortString {

	public static void main(String[] args) {
		String[] strings = {"-2", "-6", "10", null, "-100", "4", "8", null, "Special", "a", "c",
				"b", "xx"};
		
		// Tăng dần: Special => số âm tăng dần => số dương tăng dần => chuỗi tăng dần
		boolean Asc = true;
		boolean Desc = false;
		
		BubbleSort(strings, (s1, s2) -> compareSpecialAndNumber(s1, s2, Asc));
		System.out.println("sort (asc) --> " + Arrays.toString(strings));
		
		System.out.println("\n======================");
		
		BubbleSort(strings, (s1, s2) -> compareSpecialAndNumber(s1, s2, Desc));
		
		System.out.println("sort (desc) --> " + Arrays.toString(strings));

	}
	
	private static void BubbleSort(String[] strings, StringComparator stringComp) {
		int length = strings.length;
		for (int i = 0 ; i < length ; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if(stringComp.stratety(strings[j], strings[j+1]) > 0) {
					String temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;
				}
			}
		}
	}
	
	private static int compareSpecialAndNumber(String s1, String s2, boolean checkSort) {

		// Xử lý trường hợp null
		if (s1 == null && s2 != null) {
			return checkSort ? 1 : -1; 
		}
		
		if (s2 == null) {
			return checkSort ? -1 : 1; 
		}
		boolean s1Special = s1.equals("Special");
		boolean s2Special = s2.equals("Special");
		int s1Number = getNumberType(s1);
		int s2Number = getNumberType(s2);

		// So sánh Special
		if (s1Special && !s2Special) {
			return checkSort ? -1 : 1;
		}
		if (s2Special) {
			return checkSort ? 1 : -1;
		}
		
		// So sánh số âm và số dương
		if (s1Number < 0 && s2Number >= 0) {
			return checkSort ? -1 : 1;
		}
		if (s1Number >= 0 && s2Number < 0) {
			return checkSort ? 1 : -1; 
		}
		
		// So sánh số trực tiếp
		if (s1Number != 0 && s2Number != 0) {
			return checkSort ? Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2))
					: Integer.compare(Integer.parseInt(s2), Integer.parseInt(s1));
		}

		// Nếu cả hai đều không phải số
		if (s1Number == 0 && s2Number == 0) {
			return checkSort ? s1.compareTo(s2) : s2.compareTo(s1);
		}

		// Nếu một là chuỗi và một là số, sắp xếp sao cho số đứng trước chuỗi
		if (s1Number == 0) {
			return checkSort ? 1 : -1; // s1 là chuỗi, s2 là số
		}
		if (s2Number == 0) {
			return checkSort ? -1 : 1; // s2 là chuỗi, s1 là số
		}
		
		return 0;
	}
	
	private static int getNumberType(String s) {
		try {
			int number = Integer.parseInt(s);
			if (number < 0) {
				return -1;
			}
			if (number > 0) {
				return 1;
			}
		}catch (NumberFormatException e) {
			
		}
		return 0;
	}
	
}
