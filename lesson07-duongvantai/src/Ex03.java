
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import utils.DateUtils;

import static utils.DateUtils.*;
public class Ex03 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("1.Curent time: " + format(date,"dd.MM.yyyy hh:mm:ss a"));
		Calendar c = Calendar.getInstance();
		System.out.println("2.The last day of the current month: " + c.getActualMaximum(Calendar.DAY_OF_MONTH) );
		printFirstLast(c);
		System.out.println("5. Check in 20 day: " + add20());
		
	}
	private static void printFirstLast(Calendar c) {
		Calendar firstDay = DateUtils.clone(c);
		firstDay.add(Calendar.DAY_OF_MONTH,c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK) );
		firstDay.add(Calendar.DAY_OF_MONTH, 1);
		Calendar lastDay = DateUtils.clone(firstDay);
		lastDay.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println("3. Fisrt Day of the current week: " + DateUtils.format(firstDay, "dd/MM/yyyy EEEE"));
		System.out.println("3. Last Day of the current week: " + DateUtils.format(lastDay, "dd/MM/yyyy EEEE"));
	}
	private static String  add20() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		return DateUtils.format(c, DEFAULT_DATE_PATTERN);
		
		
	}
}
