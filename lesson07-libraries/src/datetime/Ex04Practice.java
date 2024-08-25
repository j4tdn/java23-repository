package datetime;

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
		printDatesInMont(c);
		
		System.out.println("\n");
		int fdowAsInt = c.getFirstDayOfWeek();
		System.out.println("Ngay dau tuan co so-->"+fdowAsInt);

	}
	private static void printDatesInMont(Calendar c) {
		Calendar cStartDayOfMonth = DateUtils.clone(c);
		cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		
		Calendar cEndDayOfMonth = DateUtils.clone(c);
		cEndDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		cEndDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		
		for (Calendar cr =  cStartDayOfMonth;cr.before(cEndDayOfMonth);cr.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("-->"+DateUtils.format(cr, "dd/MM/yyyy EEEE"));
		}
	}
}
