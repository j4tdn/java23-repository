package datetime;

import java.util.Date;

import utils.DateUtils;

public class Ex03DateFormat {
	// DateFormat, SimpleDateFormat
	// Date, Calendar, String
	// Date --> String

	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("Date1: " + date1);
		System.out.println("date1(String): " + DateUtils.format(date1, "dd.MM.yyyy HH:mm:ss"));
		System.out.println("date1(Calendar): " + DateUtils.toCalendar(date1));

	}
}
