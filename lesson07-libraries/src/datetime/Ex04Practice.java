package datetime;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

import utils.DateUtils;

public class Ex04Practice {

	/*
	1. In thong tin ngay thang nam voi DateFormatter
	2. Thang, nam hien tai co bao nhieu ngay
	3. Kiem tra nam hien tai co phai nam nhuan khong
	4. Ngay hien tai la ngay thu may, in ra ngay theo tieng viet
	5. In thong tin cac ngay trong thang, tuan hien tai
	   --> dd/MM/yyyy week_day
	6. Dem xem trong thang co bao nhieu ngay chu nhat va in ra
	 */
	private static String[] weekdays = {"Chu Nhat", "Thu Hai", "Thu Ba", "Thu Tu", "Thu nam"
			, "Thu Sau", "Thu Bay"};
	
	public static void main(String[] args) {
		
		// default locale: en_US
		Locale.setDefault(new Locale("vi", "VN")); // su dung default locale cho tat ca cac Calendar khi getInstance
		System.out.println("default locale: " + Locale.getDefault());
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, Calendar.APRIL);
		// c.set(Calendar.YEAR, 2023);
		// 21.04.2024
		
		System.out.println(
				"1. In thong tin ngay thang nam voi DatFormatter:"
				+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println(
				"\n2B. Nam hien tai co ? ngay = "
				+ c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		System.out.println(
				"\n3. Kiem tra nam hien tai co phai nam nhuan khong: "
				+ DateUtils.isLeapYear(c.get(Calendar.YEAR)));
		
		// int: day of week: 1      -> 7
		//		 	  	   : sunday -> saturday
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("\n4. Ngay trong tuan(so) = " + dowAsInt);
		System.out.println("4. Ngay trong tuan(chu) = " + weekdays[dowAsInt - 1]);
		System.out.println("\n5A. So ngay trong thang hien tai");
		printDatesInMonth(c);
		System.out.println("\n5B. So ngay trong tuan hien tai");
		printDatesInWeek(c);
		System.out.println("\n6. So ngay chu nhat trong thang");
		Calendar[] sundays = getSundayOfMonth(c);
		DateUtils.printf(sundays, "dd/MM/yyyy EEEE");
		
	}
	private static Calendar[] getSundayOfMonth(Calendar c) {
		Calendar[] sundays = new Calendar[5];
		int count = 0;
		
		Calendar cStartDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1); 
		Calendar cEndDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		
		System.out.println("cStartDayOfMonth: " + DateUtils.format(cStartDayOfMonth, "dd/MM/yyyy"));
		System.out.println("cEndDayOfMonth: " + DateUtils.format(cEndDayOfMonth, "dd/MM/yyyy"));
		
		for(Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth);)
			if(cr.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				sundays[count++] = DateUtils.clone(cr);
				cr.add(Calendar.DAY_OF_MONTH, 7);
			} else 
				cr.add(Calendar.DAY_OF_MONTH, 1);
		return Arrays.copyOfRange(sundays, 0, count);
		
	}
	private static void printDatesInWeek(Calendar c) {
		Calendar cStartDayOfWeek = DateUtils.clone(c);
		cStartDayOfWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		
		Calendar cEndDayOfWeek = DateUtils.clone(cStartDayOfWeek);
		cEndDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		
		for(Calendar cr = cStartDayOfWeek; cr.before(cEndDayOfWeek); cr.add(Calendar.DAY_OF_MONTH, 1))
		System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy EEEE"));
	}
	
	private static void printDatesInMonth(Calendar c) {
		// c 21.08.2024
				Calendar cStartDayOfMonth = DateUtils.clone(c); // 01.08.2024
				cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
				
				Calendar cEndDayOfMonth = DateUtils.clone(c); // 01.08.2024
				cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
				
				cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
				
				for(Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth); cr.add(Calendar.DAY_OF_MONTH, 1))
					System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy EEEE"));
	}
}
