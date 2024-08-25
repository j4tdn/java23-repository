package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		LocalDate today = LocalDate.now();
		
//		 	Ngày cuối cùng của tháng hiện tại 
		int lastday = c.getActualMaximum(Calendar.DATE);
		System.out.println("The last day of month: " + lastday);

//	Ngày đầu tiên và cuối cùng của tuần hiện tại 
		int fDOWeek = c.getActualMinimum(Calendar.DAY_OF_WEEK);

		System.out.println(fDOWeek);

//	 Ngày hiện tại đang là thứ mấy trong năm

		WeekFields wField = WeekFields.of(Locale.getDefault());
		int wOYear = today.get(wField.weekBasedYear());
		System.out.println("Today is " + wOYear + " in this year");

		// Sau 20 ngày là thứ mấy
		LocalDate fDay = today.plusDays(20);
		DayOfWeek dOWeek = fDay.getDayOfWeek();
		System.out.println("The day after 20 day: " +dOWeek);
	}
}
