package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import utils.DateUtils;



/*
 * In thong tin ngay thang nam voi DateFormatter
 * Thag, nam hien tai co bao nhieu ngay
 * Kiem tra nam hien tai co phai la nam nhuan ko 
 * ngay hien tai la ngay thu may, in ra ngay theo tieng viet
 * in thong tin cac ngay trong thang, tuan hien tai
 * --> dd/MM/yyyy wweek_day
 * Dem xem trong thang co bao nhieu ngay chu nhat va in ra
 */
public class Ex04Practice {
	
	private static String [] weekdays = {"CN", "Thu 2" , "Thu 3", "Thu 4", "Thu 5", "Thu 6", "Thu 7"};
	
	public static void main(String[] args) {
		Locale.setDefault(new Locale("vi", "VN")); // su dung default locale cho tat ca Calendar khi getInstance
		System.out.println("default locale: " + Locale.getDefault());
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		//c.set(Calendar.MONTH, Calendar.APRIL);
		//c.set(Calendar.YEAR, 2023);
		System.out.println("1. In thong tin ngay thang nam voi DateFormatter"
				+ DateUtils.format(c,"dd.MM.yyyy"));
		
		System.out.println("2A. Thang hien tai co ? ngay " + c.getActualMaximum(Calendar.DAY_OF_MONTH));// lay gia tri lon nhat trong thang 
		System.out.println("2B. Nam hien tai co ? ngay " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("3. Kiem tra hien tai co phai la nam nhuan ko : " + DateUtils.isLeapYear(c.getActualMaximum(Calendar.DAY_OF_MONTH)));
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println("c runtime --> " + gc.isLeapYear(c.get(Calendar.YEAR)));
		
		// int: day of week: 1 -> 7
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("4. Ngay trog tuan(so) = " + dowAsInt);
		System.out.println("4. Ngay trong tuan(chu) = " + weekdays[dowAsInt-1]);
		
		int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("5A. In ra so ngay trong thang hien tai");
		printDatesInMonth(c);
		
		System.out.println("\n");
		int fdowAsInt = c.getFirstDayOfWeek ();
		System.out.println("Ngay dau tuan .... " + +fdowAsInt);
		
		printDatesInWeek(c);
		}	
	
	private static void printDatesInWeek(Calendar c) {
		Calendar cStartDayOfWeek = DateUtils.clone(c);
		cStartDayOfWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		
		Calendar cEndDayOfWeek = DateUtils.clone(cStartDayOfWeek);
		cEndDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		
		cEndDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		
		for (Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth); cr.add(Calendar.DAY_OF_MONTH,1)) {
			System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy E"));
	}
	}
	
	private static void printDatesInMonth (Calendar c) {
		// c 21.08.2024
		Calendar cStartDayOfMonth = DateUtils.clone(c); //1.08.2024
		cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
			
		Calendar cEndDayOfMonth = DateUtils.clone(c); //31.08.2024
		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
				
		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1); // first day
		for (Calendar cr = cStartDayOfMonth; cr.before(cEndDayOfMonth); cr.add(Calendar.DAY_OF_MONTH,1)) {
			System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy E"));
	}
	}
}
