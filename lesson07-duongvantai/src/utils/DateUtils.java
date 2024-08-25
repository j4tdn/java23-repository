package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	public static final String DEFAULT_DATE_PATTERN = "dd.MM.yyyy";
	public static final String DEFAULT_DATE_TIME_PATTERN = "dd.MM.yyyy HH:mm:ss";
	public DateUtils() {
	}
	public static String format(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	public static String format(Calendar c, String pattern) {
		
		return format(toDate(c), pattern);
	}
	public static Date toDate(Calendar c) {
		return c.getTime();
	}
	public static Calendar clone(Calendar c) {
		Calendar clone = Calendar.getInstance();
		clone.setTimeInMillis(c.getTimeInMillis());
		return clone;
	}
}
