package fixcode;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

import bean.Pair;

public class Ex07RightSubString {

public static void main(String[] args) {
		
		
		LocalDate startDate = LocalDate.of(2023, 9, 11);
		int days = 5;
		
		LocalDate runningDate = startDate;
		
		int workingDays = 0;
		while(true) {
			if (workingDays == days) {
				// dừng lại --> ngày bàn giao
				break;
			}
			runningDate = runningDate.plusDays(1);
			DayOfWeek dow = runningDate.getDayOfWeek();
			if (dow != DayOfWeek.SATURDAY && dow != DayOfWeek.SUNDAY && !isHoliday(runningDate)) {
				workingDays++;
			}
		}
		
		System.out.println("Ngày bàn giao: " + runningDate);
		
		
		String s = "waaabaaabbaaaaa";
		
		System.out.println("pairs: " 
				+ Arrays.toString(getLongestRightSubStrings(getRightSubStrings(s))));
	}
	
	private static boolean isHoliday(LocalDate checkDate) {
		LocalDate[] holidays = {
			LocalDate.of(2024, 1, 1),
			LocalDate.of(2024, 1, 2),
			LocalDate.of(2024, 1, 3),
			LocalDate.of(2024, 1, 4),
			LocalDate.of(2024, 1, 5),
			LocalDate.of(2024, 4, 30),
			LocalDate.of(2024, 5, 1),
			LocalDate.of(2024, 9, 1),
			LocalDate.of(2024, 9, 2),
		};
		
		for(LocalDate holiday: holidays) {
			if (checkDate.equals(holiday)) {
				return true;
			}
		}
		return false;
	}
	
	private static Pair[] getLongestRightSubStrings(Pair[] pairs) {
		int maxLength = Integer.MIN_VALUE;
		for (Pair pair: pairs) {
			maxLength = Integer.max(maxLength, pair.getValue().length());
		}
		
		Pair[] result = new Pair[pairs.length];
		int count = 0;
		for (Pair pair: pairs) {
			if (pair.getValue().length() == maxLength) {
				result[count++] = pair;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Pair[] getRightSubStrings(String s) {
		Pair[] pairs = new Pair[s.length()];
		int count = 0;
		
		int start = 0;
		
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i-1)) {
				pairs[count++] = Pair.of(s.substring(start, i), start);
				start = i;
			}
		}
		
		if (start <= s.length() - 1) {
			pairs[count++] = Pair.of(s.substring(start), start);
		}
		
		return Arrays.copyOfRange(pairs, 0, count);
	}
	
	/*
	 Logic
	  
	 Dạng 1: Problem solving
	 --> Bài toán thực tế
	 --> Sử dụng logic suy luận giải quyết
	 
	 Dạng 2: Algorithm
	 --> Bắt buộc phải sử dụng các thuật toán để xử lý
	 
	 */
	
}
