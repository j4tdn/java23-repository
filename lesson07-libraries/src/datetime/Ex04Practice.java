package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex04Practice {
	
	private static String [] weekdays = {"CN", "Thu 2" , "Thu 3", "Thu 4", "Thu 5", "Thu 6", "Thu 7"};
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//c.set(Calendar.MONTH, Calendar.APRIL);
		//c.set(Calendar.YEAR, 2023);
		System.out.println("1. In thong tin ngay thang nam voi DateFormatter"
				+ DateUtils.format(c,"dd.MM.yyyy"));
		System.out.println("2A. Thang hien tai co ? ngay " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println("c runtime --> " + gc.isLeapYear(c.get(Calendar.YEAR)));
		
		// int: day of week: 1 -> 7
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("4. Ngay trong tuan(so) = " + dowAsInt);
		System.out.println("4. Ngay trong tuan(chu) = " + weekdays[dowAsInt-1]);
	}
}
