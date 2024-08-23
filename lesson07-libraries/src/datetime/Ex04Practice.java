package datetime;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import utils.DateUtils;

public class Ex04Practice {

	/*
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(new Locale("vi", "VN"));// sử dụng default locale cho tất cả các Calender khi getInstance
		System.out.println("Default locale: " + Locale.getDefault());

		Calendar c = Calendar.getInstance();
//	    c.set(Calendar.MONTH, Calendar.APRIL);

		System.out.println(
				"1. In thong tin ngay thang nam voi DateFormatter: " + c.getActualMaximum(Calendar.DAY_OF_MONTH));

		System.out.println("2. Nam hien tai ? ngay: " + c.getActualMaximum(Calendar.DAY_OF_YEAR));

		System.out.println("3. Kiem tra nam hien tai co phai nam nhuan khong: " + DateUtils.isLeapYear(2024));

//  int:day of week: 1-->7
//	                :sunday --> saturday

		System.out.println("\n5A: So ngay trong thang hien tai");
	}

	private static void printDatesInWeek(Calendar c) {
		Calendar cStartDayOfWeek = DateUtils.clone(c);
		cStartDayOfWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_MONTH));
		Calendar cEndDayOfWeek = DateUtils.clone(c);

	}

	private static void printDatesInMonth(Calendar c) {
//	    	c 21.08.2024
		Calendar cStartDayOfMonth = DateUtils.clone(c); // 01.08.2024
		cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);

		Calendar cEndDayOfMonth = DateUtils.clone(c);
		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));

		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1); // first day of next month

//	    	for( )

//	    }

	}

	private static Calendar[] getSundaysOfMonth(Calendar c) {
		Calendar[] sundays = new Calendar[5];
		int count = 0;

		Calendar cStartDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1);

		Calendar cEndDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH,
				c.getActualMaximum(Calendar.DAY_OF_MONTH));

		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);

		System.out.println("cStartDayOfMonth: " + DateUtils.format(cStartDayOfMonth, "dd/MM//yyyy"));

		for (Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth);) {
			if (cr.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				sundays[count++] = DateUtils.clone(cr);
				cr.add(Calendar.DAY_OF_MONTH, 7);
			} else {
				cr.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		return Arrays.copyOfRange(sundays, 0, count);
	}
}
