package utils;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtils {

	public static final String DEFAULT_DATE_PATTERN = "dd.MM.yyyy";
	public static final String DEFAULT_DATE_TIME_PATTERN = "dd.MM.yyyy HH:mm:ss";
	
	public DateUtils() {
	}
	
	public static String format(Calendar c, String pattern) {
		return format(toDate(c), pattern);
	}
	
	public static String format(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	
	public static Date toDate(String str, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	// Date là 1 thuộc tính trong class calendar
	
	private static Date toDate(Calendar c) {
		return c.getTime();
	}
	
	public static Calendar toCalendar(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	
	public static Calendar toCalendar(String str, String pattern) {
		return toCalendar(toDate(str, pattern));
	}
	
	// string -> df.parse -> date -> c.setTime -> calendar
	// calendar -> c.getTime -> date -> d.format -> string
	// string: pattern
}
