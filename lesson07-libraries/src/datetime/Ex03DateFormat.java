package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static utils.DateUtils.*;

public class Ex03DateFormat {
	// DateFormat, SimpleDateFormat
	// Date Calendar, String
	// Date --> Strig
	
	// Calendar -> String
	public static void main(String[] args) {
		String pattern = "dd/MM/yyyy hh:mm:ss a";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		
		Date date1 = new Date();
		
		System.out.println("date1(string) --> " + format(date1, DEFAULT_DATE_PATTERN));
		System.out.println("date1(string) --> " + toCalendar(date1));
		
		
		System.out.println("\n");
		
		String str1 = "15/12/2024 10:24:14";
		System.out.println("str1: --> " +str1);
		System.out.println("str1(date) --> :  " + toDate(str1, "dd/MM/yyyy HH:mm"));
		System.out.println("str1(calendar) --> :  " + toCalendar(date1));
		
		System.out.println("\n");
		Calendar c1 = Calendar.getInstance();
		System.out.println("c1 -->" + c1);
		System.out.println("c1(string) --> : " + format(c1, DEFAULT_DATE_PATTERN));
		System.out.println("c1(date) --> : " + toDate(c1));
		// convert date -> string
		//String str1 = df.format(date1);
		System.out.println("date1 formated:  --> " + str1) ;
		
	}
}
