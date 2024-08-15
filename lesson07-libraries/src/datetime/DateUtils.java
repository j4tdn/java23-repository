package datetime;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateUtils {
	public static final String DEFAULT_DATE_PATTERN = "dd.MM.yyyy";
    public static final String DEFAULT_DATE_TIME_PATTERN = "dd.MM.yyyy HH:mm:ss";

    private DateUtils() {
    }

    public static String toString(Calendar c, String pattern) {
        return toString(toDate(c), pattern);
    }

    public static String toString(Date date, String pattern) {
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

    public static Date toDate(Calendar c) {
        return c.getTime();
    }
    
    public static Calendar toCalendar (Date date) {
    	Calendar c = Calendar.getInstance();
    	c.setTime(date);
    	return c;
    
    }
    
    public static Calendar toCalendar (String str, String pattern) {
    	return toCalendar(toDate(str, pattern));
    }
    
    // string -> df.parse -> date -> c.setTime -> calendar
    // calendar -> c.getTime -> date -> d.format -> string
}

