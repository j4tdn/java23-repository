package utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtils {

	public static final String DEFAULT_DATE_PATTERN = "dd.MM.yyyy";
	public static final String DEFAULT_DATE_TIME_PATTERN = "dd.MM.yyyy HH:mm:ss";
	
	private static final GregorianCalendar GC = new GregorianCalendar();
	
	public DateUtils() {
	}
	
	public static String opt(long value, String unit) {
		if(value <= 0 )
			return "";
		return value + " " + unit + (value > 1 ? "(s)" : "") + " ";
	}
	
	public static void printf(Calendar[] cals, String pattern) {
		for(Calendar c: cals) {
			System.out.println("--> " + format(c, pattern));
		}
	}
	
	public static Calendar cloneAndSet(Calendar c, int field, int value) {
		Calendar cloned = clone(c);
		cloned.set(field, value);
		return cloned;
	}
	
	public static Calendar clone(Calendar c) {
		Calendar cloned = Calendar.getInstance();
		cloned.setTimeInMillis(c.getTimeInMillis());
		return cloned;
	}
	
	public static boolean isLeapYear(int year) {
		return GC.isLeapYear(year);
	}
	
	public static String format(Calendar c, String pattern, TimeZone tz) {
		DateFormat df = new SimpleDateFormat(pattern);
		df.setTimeZone(tz);
		return df.format(toDate(c));
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
	
	public static Date toDate(Calendar c) {
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
