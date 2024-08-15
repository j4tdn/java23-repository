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
	public static String toString(Calendar c, String pattern) {
		Date date = c.getTime();
		return toString(date, pattern);
	}
	public static String toString (Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}

}
