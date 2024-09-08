package datetime;

import java.nio.channels.CancelledKeyException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import utils.DateUtils;

public class Ex04Practice {

	/*
	 * 1. In thông tin ngày tháng năm với DateFormatter 
	 * 2. Tháng, năm hiện tại có bao nhiêu ngày 
	 * 3. Kiểm tra năm hiện tại có phải là năm nhuận không 
	 * 4. Ngày hiện tại là ngày thứ mấy(trong tuần), in ra ngày theo tiếng việt 
	 * 5. In thông tin các ngày trong tháng, tuần hiện tại --> dd/MM/yyyy week_day 
	 * 6. Đếm xem trong tháng có bao nhiêu ngày chủ nhật và in ra
	 */

	// Enum ???
	private static String[] weekdays = { "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy" };

	public static void main(String[] args) {
		// locale --> ảnh hưởng đến ngày đầu tuần (chủ nhật / thứ hai)
		// default locale: en_US
		// Locale.setDefault(new Locale("vi", "VN")); // sử dụng default locale cho tất cả các Calendar khi getInstance
		System.out.println("default locale: " + Locale.getDefault());

		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH, 2);
		// c.set(Calendar.MONTH, Calendar.APRIL);
		// c.set(Calendar.YEAR, 2023);

		// 21.04.2024

		System.out.println("1. In thông tin ngày tháng năm với DateFormatter: " + DateUtils.format(c, "dd.MM.yyyy"));

		System.out.println("\n2A. Tháng hiện tại có ? ngày = " + c.getActualMaximum(Calendar.DAY_OF_MONTH));

		System.out.println("2B. Năm hiện tại có ? ngày = " + c.getActualMaximum(Calendar.DAY_OF_YEAR));

		System.out.println("\n3. Kiểm tra năm hiện tại có phải là năm nhuận không: " + DateUtils.isLeapYear(c.get(Calendar.YEAR)));

		// int: day of week: 1 -> 7
		// : sunday -> saturday
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("\n4. Ngày trong tuần(số) = " + dowAsInt);
		System.out.println("4. Ngày trong tuần(chữ) = " + weekdays[dowAsInt - 1]);
		
		System.out.println("\n5A. Số ngày trong tháng hiện tại");
		printDatesInMonth(c);
		
		System.out.println("\n5. Số ngày trong tuần hiện tại");
		printDatesInWeek(c);
		
		System.out.println("\n6. Số ngày chủ nhật trong tháng");
		Calendar[] sundays = getSundaysOfMonth(c);
		
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
		
		Calendar cEndDayOfWeek = DateUtils.clone(cStartDayOfWeek);
		cEndDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		
		for (Calendar cr = cStartDayOfWeek; cr.before(cEndDayOfWeek); cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy EEEE"));
		}
	}

	private static void printDatesInMonth(Calendar c) {
		// c 21.08.2024
		// Calendar cStartDayOfMonth = DateUtils.clone(c); // 01.08.2024
		// cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		Calendar cStartDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1);

		Calendar cEndDayOfMonth = DateUtils.clone(c); // 31.08.2024
		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));

		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1); // first day of next month

		for (Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth); cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy EEEE"));
		}
	}

}