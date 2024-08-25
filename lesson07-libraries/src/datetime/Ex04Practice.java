package datetime;

import java.util.Arrays;
import java.util.Calendar;

import utils.DateUtils;

public class Ex04Practice {
	private static String[] weekday = {"Chu nhat", "Thu 2", "Thu 3", "Thu 4", "Thu 5", "Thu 6", "Thu 7" };
	
	    
	private static void printDateInWeek(Calendar c ) {
		Calendar cStartDayOfWeek = DateUtils.clone(c);
		cStartDayOfWeek.add(Calendar.DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		
		Calendar cEndDayOfWeek = DateUtils.clone(cStartDayOfWeek);
		cEndDayOfWeek.add(Calendar.WEEK_OF_MONTH, 0);
	}
	
		public static void main(String[] args) {
			
			
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, Calendar.APRIL);
			c.set(Calendar.YEAR, 2023);
			System.out.println(
					"1.In thong tin ngay thang nam voi DateFormatter: " + DateUtils.format(c, "dd.MM.yyyy")
					);
			System.out.println(
					"2A. Thang hien tai co ? ngay: " + c.getActualMaximum(Calendar.DAY_OF_MONTH)
					);
			System.out.println(
					"2.B. Nam hien tai co bao nhieu ngay: " + c.getActualMaximum(Calendar.DAY_OF_YEAR)
					);
			System.out.println(
					"3. Kiem tra nam hien tai co pphai nam nhuan hay khong " + DateUtils.isLeapYear(c.get(Calendar.YEAR))
					);
			// int : Day of week: 1     -> 7
			                 //  sunday -> saturday
			 int dowAsItn = c.get(Calendar.DAY_OF_WEEK);
			System.out.println("4. Ngay trong tuan = " + dowAsItn);
			System.out.println("4. Ngay trong tuan = " + weekday[dowAsItn - 1]);
		}
			
		private static void printDateInMonth(Calendar c) {
			Calendar cStartDayOfMonth = DateUtils.clone(c);
			cStartDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
			
			Calendar cEndtDayOfMonth = DateUtils.clone(c);
			cEndtDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
			
			for (Calendar cr = cStartDayOfMonth; cr.before(cEndtDayOfMonth); cr.add(Calendar.DAY_OF_MONTH, 1)) {
				System.out.println("--> " + DateUtils.format(cr, "dd/MM/yyyy EEEE"));
			}
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
			
			
			
			
		
		
		private static Calendar [] getSundaysOfMonth(Calendar c ) {
			Calendar [] sunday = new Calendar[5];
			int count = 0;
			
			Calendar cStartDayOfMonth = DateUtils.cloneAndSet(c,Calendar.DAY_OF_MONTH,1);
			Calendar cEndtDayOfMonth = DateUtils.cloneAndSet(c,Calendar.DAY_OF_MONTH,c.getActualMaximum(Calendar.DAY_OF_MONTH));
			cEndtDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
			
			for(Calendar cr = cStartDayOfMonth; cr.before(cEndtDayOfMonth);) {
				if(cr.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
					sunday[count++] = DateUtils.clone(cr);
					cr.add(Calendar.DAY_OF_MONTH, 1);
				}else {
					cr.add(Calendar.DAY_OF_MONTH, 1);
				}
			}
			return Arrays.copyOfRange(sunday, 0, count);

			
			
		}
}
