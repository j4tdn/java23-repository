package datetime;

import java.util.Date;
import static utils.DateUtils.*;
public class Ex03DateFormat {

	// DateFormat, SimpleDateFormat
	
	// Date, Calendar, String
	
	// Date --> String
	// Calendar --> String
	
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("date1 --> " + date1);
		System.out.println("date1(string) --> " + format(date1, "dd.MM.yyyy hh:mm:ss"));
		System.out.println("date1(calendar) --> " + toCalendar(date1));
		
		System.out.println("\n");
		
		String str1 = "15/12/2024 10:24";
		System.out.println("str1: " + str1);
		System.out.println("str1(date) --> : " + toDate(str1, "dd/MM/yyyy HH:mm"));
		System.out.println("str1(calendar) --> : " + toCalendar(str1, "dd/MM/yyyy HH:mm"));
		
		System.out.println("\n");
		
	}
}
