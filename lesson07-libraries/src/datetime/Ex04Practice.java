
package datetime;

import java.awt.desktop.PrintFilesEvent;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import utils.DateUtils;

public class Ex04Practice {
		
	private static String[] weekdays = {
			"chu nhat","thu 2","thu 3","thu 4","thu 5 ", "thu 6", "thu 7"
	};
	
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("vi","VN"));
		System.out.println("default locale:"+Locale.getDefault());
		
		
		
		Calendar c = Calendar.getInstance();
//		int x=	Calendar.SUNDAY;
//		c.set(Calendar.MONTH, Calendar.APRIL);
//		c.set(Calendar.YEAR, 2023);
//		c.set(Calendar.DAY_OF_MONTH, 18);
		System.out.println("1.In thong tinh ngay thang nam voi DateFormatter :"+DateUtils.format(c, "dd.MM.yyyy"));
		
		c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("2A. Thang ngay hien tai co bao nhieu ngay "+c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println("2B. Thang ngay hien tai co bao nhieu ngay "+c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		
//		System.out.println("Ktra co phai nam nhuan hay khong "+DateUtils.isLeapYear(c.get(Calendar.YEAR)));
		
		
		//int :day of week 1->7
		//				  :sunday ->saturday
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("4.Ngay trong tuan(so)="+dowAsInt);
		System.out.println("4.Ngay trong tuan(chu)="+ weekdays[dowAsInt-1]);
		
		
		System.out.println("5A.So ngay trong thang hien tai");
		printDatesInMonth(c);
		
		System.out.println("5A.So ngay trong tuan hien tai");
		printDatesInWeek(c);
		
		
		System.out.println("\n");
		int fdowAsInt = c.getFirstDayOfWeek();
		System.out.println("Ngay dau tuan co so-->"+fdowAsInt);
		
		System.out.println("\n So ngay chu nhat trong thang");
		DateUtils.printf(getSundaysOfMonth(c),"dd/MM/yyyy EEEE");

	}
	private static Calendar[] getSundaysOfMonth(Calendar c) {
		Calendar[] sundays = new Calendar[5];
		int count =0;
 		
		Calendar cStartDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1);
		Calendar cEndDayOfMonth = DateUtils.cloneAndSet(c,Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH)); // 31.08.2024
		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		
	
	

		for (Calendar cr =  cStartDayOfMonth;cr.before(cEndDayOfMonth);) {
			if(cr.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				sundays[count++]= DateUtils.clone(cr);
				cr.add(Calendar.DAY_OF_MONTH, 7);
			} else {
				cr.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		return Arrays.copyOfRange(sundays, 0, count);
	}
	
	private static void printDatesInWeek(Calendar c) {
		Calendar cStartDayOfWeek = DateUtils.clone(c);
		cStartDayOfWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek()- c.get(Calendar.DAY_OF_WEEK));
		
		Calendar cEndDayOfWeek = DateUtils.clone(cStartDayOfWeek);
		cEndDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		
		cEndDayOfWeek.add(Calendar.DAY_OF_MONTH, 1);
		
		for (Calendar cr =  cStartDayOfWeek;cr.before(cEndDayOfWeek);cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("-->"+DateUtils.format(cr, "dd/MM/yyyy EEEE"));
		}
	}
	private static void printDatesInMonth(Calendar c) {
//		Calendar cStartDayOfMonth = DateUtils.clone(c);
//		cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
//		
//		Calendar cEndDayOfMonth = DateUtils.clone(c);
//		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
//		
//		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		Calendar cStartDayOfMonth = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1);

		Calendar cEndDayOfMonth = DateUtils.clone(c); // 31.08.2024
		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));

		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1); // first day of next month
		
		for (Calendar cr =  cStartDayOfMonth;cr.before(cEndDayOfMonth);cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("-->"+DateUtils.format(cr, "dd/MM/yyyy EEEE"));
		}
	}
}
