package datetime;

import java.util.Calendar;
import java.util.Date;
import static utils.DateUtils.*;

public class Ex03DateFormat {

	// DateFormat, SimpleDateFormat
	
	// Date, Calendar, String
	
	// Date     --> String
	// Calendar --> String
	
	public static void main(String[] args) {
		
		Date date1 = new Date();
		System.out.println("date1 --> " + date1);
		System.out.println("date1(string) --> " + format(date1, "dd.MM.yyyy hh.mm.ss a"));
		System.out.println("date1(calender) --> " + toCalendar(date1));
		
		System.out.println("\n");
		
		String str1 = "15/12/2024 10:24";
		System.out.println("str1: " + str1);
		System.out.println("str1(date) --> " + toDate(str1, "dd/MM/yyyy HH:mm"));
		System.out.println("str1(calender) --> : " + toCalendar(str1, "dd/MM/yyyy HH:mm"));
		
		System.out.println("\n");
		Calendar c1 = Calendar.getInstance();
		System.out.println("c1: " + c1);
		System.out.println("c1(String) --> " + format(c1, DEFAULT_DATE_PATTERN));
		System.out.println("str1(calender) --> : " + toDate(c1));
		
	}
	
}
