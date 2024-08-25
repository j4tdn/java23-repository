package datetime;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import utils.DateUtils;

public class Ex04Practices {
	/*
	 * 1. In thông tin ngày tháng năm với DateFormatter 
	 * 2. Tháng, năm hiện tại có bao nhiêu ngày ? 3. Kiểm tra năm hiện tại có phải nhuận? 
	 * 4. Ngày hiện tại thứ mấy ? in ra tiếng việt
	 * 5. In thông tin các ngày
	 * 6. Đếm xem trong tháng có bao nhiêu ngày chủ
	 * nhật
	 */
	private static String[] weekdays = { "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy" };

	public static void main(String[] args) {

		// Ảnh hưởng đến firstDayOfWeek -> CN or T2
		Locale.setDefault(new Locale("vi", "VN"));

		Calendar c = Calendar.getInstance();
		System.out.println("formatted: " + DateUtils.format(c, "dd.MM.yyyy"));
		
//		c.set(Calendar.MONTH, Calendar.APRIL);
		System.out.println("2A. Tháng hiện tại có ? ngày " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("2B. Năm hiện tại có ? ngày" + c.getActualMaximum(Calendar.DAY_OF_YEAR));

		GregorianCalendar gc = new GregorianCalendar();

		System.out.println("3. Năm hiện tại có phải nhuận ? " + gc.isLeapYear(c.get(Calendar.YEAR)));

		System.out.println("4. Ngày hiện tại thứ mấy ?, in theo tiếng việt ");

		int dowAsInt = c.get(Calendar.DAY_OF_WEEK); // 1 -> 7 (Sunday -> Saturday)
		System.out.println("4. Ngày trong tuần (số): " + dowAsInt);

		System.out.println("4. Ngày trong tuần (chữ): " + weekdays[dowAsInt - 1]);

		System.out.println("5. Thông tin các ngày trong tháng: ");

//		int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//		for (int i = 1; i <= maxDayOfMonth; i++) {
//			c.set(Calendar.DAY_OF_MONTH, i);
//			System.out.println("--> " + DateUtils.format(c, "dd/MM/yyyy EEEE"));
//		}

		printDatesInMonth(c);

		System.out.println("5. Thông tin các ngày trong tuần: ");
		printDatesInWeek(c);
		
		System.out.println("\n6. Số ngày chủ nhật trong tuần: ");
		DateUtils.printf(getSundaysOfMonth(c), "dd/MM/yyyy EEEE");
	}

	private static Calendar[] getSundaysOfMonth(Calendar c) {
		Calendar[] sundays = new Calendar[5];
		int count = 0;

		Calendar cStartDMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1);
		Calendar cEndDMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH,
				c.getActualMaximum(Calendar.DAY_OF_MONTH));

		for (Calendar cr = cStartDMonth; cr.before(cEndDMonth); cr.add(Calendar.DAY_OF_MONTH, 1)) {
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
//		Calendar cStartDayOfWeek = DateUtils.clone(c);
//		cStartDayOfWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));

		Calendar cStartDayOfWeek = DateUtils.cloneAndSet(c, Calendar.DAY_OF_WEEK, 1);

		Calendar cEndDayOfWeek = DateUtils.clone(c);
		cEndDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);

		for (Calendar cr = cStartDayOfWeek; cr.before(cEndDayOfWeek); cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy EEEE"));
		}
	}

	private static void printDatesInMonth(Calendar c) {
		Calendar cStartDayOfMonth = DateUtils.clone(c);
		cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);

		Calendar cEndDayOfMonth = DateUtils.clone(c);
		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));

		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);// first day of next month

		for (Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth); cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy EEEE"));
		}
	}
}
