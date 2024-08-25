package datetime;

import java.awt.datatransfer.ClipboardOwner;
import java.sql.Date;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import utils.DateUtils;

public class Ex04Practice {

	/*
	  1. In thông tin ngày tháng năm với DateFormatter
	  2. Tháng năm hiện tại có bao nhiêu ngày
	  3. Kiểm tra năm hiện tại có phải là năm nhuận không
	  4. Ngày hiện tại là ngày thú mấy, in ra ngày theo tiếng việt
	  5. In thông tin các ngày trong tháng, tuần hiện tại
	   --> dd/MM/yyyy week_day
	  6. Đếm xem trong tháng có bao nhiêu ngày chủ nhật và in ra
	 */
	
	private static String[] weekdays = {
			"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"
	};
	public static void main(String[] args) {
		
		// default locale: en_us
		Locale.setDefault(new Locale("vi" , "VN")); // sử dụng default locale cho tất cả các Calendar khi getInstance
		System.out.println("default locale: " + Locale.getDefault());
		
		Calendar c = Calendar.getInstance();
		
//		c.set(Calendar.MONTH, Calendar.APRIL);
//		c.set(Calendar.YEAR, 2023);
//		c.set(Calendar.DATE, 23);
		System.out.println(
				"\n1. In thông tin ngày tháng năm với DateFormatter :"
				+ DateUtils.format(c, "dd.MM.yyyy"));
		System.out.println(
				"\n2A. Thang hien tai co ? ngay ="
				+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(
				"\n2B. Nam hien tai co ? ngay ="
				+ c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		System.out.println(
				"\n3. Nam hien tai co phai la nam nhuan khong: " + DateUtils.isLeapYear(c.get(Calendar.YEAR)));
		
		// int : first day of week : 1 ----> 7
		// 					  : sunday --> saturday
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(
				"\n4. Ngay trong tuan (So) : " + dowAsInt);
		System.out.println("\n4. Ngày trong tuần( chữ) = " + weekdays[dowAsInt-1]);
		
		// c 21.08.2024
		System.out.println("\n5A. So ngay trong thang hien tai: ");
		printDateInMonth(c);
		System.out.println("\n5B. Cac ngay trong tuan hien tai: ");

		printDatesInWeek(c);
		Calendar[] sundays = getSundaysOfMonth(c);
		DateUtils.printf(sundays, "dd/MM/yyyy EEEE");
	}
	/*
	private static Calendar[] countSundays(Calendar c) { 
		Calendar[] sundays = new Calendar[5];
		Calendar cStartDayOfMonth = DateUtils.clone(c); 
		int count = 0;
		
		cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		Calendar cEndDayOfMonth = DateUtils.clone(c); 
		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		for (Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth); cr.add(Calendar.DAY_OF_MONTH, 1)) {
			if (cr.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				sundays[count++] = cr;
			}
		}
		return Arrays.copyOfRange(sundays, 0, count);
		
	}
	*/
	private static Calendar[] getSundaysOfMonth(Calendar c) {
		Calendar[] sundays = new Calendar[5];
		int count = 0;
		
		Calendar cStartDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1);
		Calendar cEndDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		
//		System.out.println("cStartDayOfMonth: " + DateUtils.format(cStartDayOfMonth, "dd/MM/yyyy"));
		
		for(Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth);) {
			if(cr.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				sundays[count++] = DateUtils.clone(cr);
				cr.add(Calendar.DAY_OF_MONTH, 7);
			}
			else {
				cr.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		return Arrays.copyOfRange(sundays, 0, count);
	}
	
	private static void printDatesInWeek(Calendar c) {
		// Theo locale VN - > Thu 2 la ngay dau tuan
		// Theo locale us -> Cn la ngay dau tuan
		Calendar cStartDayOfWeek = DateUtils.clone(c);
		cStartDayOfWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		
		Calendar cEndDayOfWeek = DateUtils.clone(cStartDayOfWeek);
		cEndDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		
		for(Calendar cr = cStartDayOfWeek; cr.before(cEndDayOfWeek); cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy EEEE"));
		}
	}
	
	private static void printDateInMonth(Calendar c) {
		Calendar cStartDayOfMonth = DateUtils.clone(c); // 01.08.2024
		cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		
		Calendar cEndDayOfMonth = DateUtils.clone(c); // 31.08.2024
		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		for( Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth);cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy EEEE"));
			
		}
	}
}
