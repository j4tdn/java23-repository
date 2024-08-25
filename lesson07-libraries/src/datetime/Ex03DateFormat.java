package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static utils.DateUtils.*;

public class Ex03DateFormat {
	
	// DateFormat, SimpleDateFormat
	
	// Date, Calendar, String
	
	// Date 	    --> String
	// Calendar --> String 
	
	public static void main(String[] args) {
		
		Date date1 = new Date();
		System.out.println("date 1 : " + date1);
		System.out.println("date1(String) --> " + format(date1, "dd/MM/yyyy hh:mm:ss a"));
		System.out.println("date1(Calendar) --> " + toCalendar(date1));
		
		System.out.println("\n");
		
		String s1 = "15/12/2024";
		System.out.println("String1 : " + s1);
		System.out.println("String1 (Date) : " + toDate(s1, "dd/MM/yyyy"));
		System.out.println("String1 (Calendar :" +toCalendar(s1, "dd/MM/yyyy"));
		
		System.out.println("\n");
		Calendar c1 = Calendar.getInstance();
		System.out.println("c1 : " + c1);
		System.out.println("c1(String) : " + format(c1, DEFAULT_DATE_PATTERN));
		System.out.println("c1(date) : " + toDate(c1) );
	}
		
}
