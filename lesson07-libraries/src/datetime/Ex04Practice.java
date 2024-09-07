package datetime;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import utils.DateUtils;

public class Ex04Practice {
	
	private static String[] weekdays = {"Chủ Nhật","Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
	
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("vi", "VN"));
		System.out.println("default locale: " + Locale.getDefault());
		
		Calendar c = Calendar.getInstance();
		
		// c.set(Calendar.DAY_OF_MONTH, 18);
		// c.set(Calendar.MONTH, Calendar.APRIL);
		// c.set(Calendar.YEAR, 2023);
		
		System.out.println("1. In thông tin ngày tháng năm với DateFormatted: " + DateUtils.format(c, "dd.MM.yyyy"));
		
		System.out.println("2A. Tháng hiện tại có ? ngày = " + 	c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println("2B. Năm hiện tại có ? ngày = " + 	c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		System.out.println("3. Kiểm tra năm hiện tại có phải là năm nhuận không: " + DateUtils.isLeapYear(c.get(Calendar.YEAR)));
		
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("\n4. Ngày trong tuần(số) = " + dowAsInt);
		System.out.println("4. Ngày trong tuần(chữ) = " + weekdays[dowAsInt-1]);

		System.out.println("\n5A. Số ngày trong tháng hiện tại");
		printDatesInMonth(c);
		
		System.out.println("\n5. Số ngày trong tuần hiện tại");
		printDatesInMonth(c);
		
		System.out.println("\n6. Số ngày chủ nhật trong tháng" );
		Calendar[] sundays = getSundaysOfMonth(c);
		
		System.out.println("length --> " + sundays.length);
		 
		DateUtils.printf(sundays, "dd/MM/yyyy EEEE");
	}
	
	private static Calendar[] getSundaysOfMonth(Calendar c) {
		Calendar[] sundays = new Calendar[5];
		int count = 0;
		
		Calendar cStartDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1);
		Calendar cEndDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		
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
	
	private static void printDatesInWeek(Calendar c) {
		Calendar cStartDayOfWeek = DateUtils.clone(c);
		cStartDayOfWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		
		Calendar cEndDayOfWeek = DateUtils.clone(c);
		cEndDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		
		for (Calendar cr = cStartDayOfWeek; cr.before(cEndDayOfWeek); cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy EEEE"));
		}
	}
	private static void printDatesInMonth(Calendar c) {
		
		// Calendar cStartDayOfMonth = DateUtils.clone(c); //01.08.2024
		// cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		Calendar cStartDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1);
		
		Calendar cEndDayOfMonth = DateUtils.clone(c); //31.08.2024
		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, 1); // first day of next month
		
		for (Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth); cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy E"));
		}
	}

}
