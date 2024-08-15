package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

//	public static final String
//	public static final String

	private DateUtils() {
		
	}
	public static void main(String[] args) {

	}
   
	public static String toString(Calendar c, String pattern ) {
	      return toString(toDate(c),pattern);	
	//		Date date = c.getTime();
//		return toString(date,pattern);
		
	}
	public static String toString(Date date, String pattern ) {
	    DateFormat df = new   SimpleDateFormat(pattern);
		return df.format(date);
	
	}
	
	public static Date toDate(String str, String pattern) {
	    DateFormat df = new   SimpleDateFormat(pattern);
        Date date = null;
        try {
        	date = df.p
        }
	}
}
