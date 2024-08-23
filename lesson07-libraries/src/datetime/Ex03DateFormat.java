package datetime;

import java.util.Date;
import  utils.DateUtils;

public class Ex03DateFormat {

//	DateFormat,	SimpleDateFormat
//	Date, Calendar, String 
//	Date -- String
	
	// DateFormat, SimpleDateFormat
	
		// Date, Calendar, String
		
		// Date --> String
		// Calendar --> String
		
		public static void main(String[] args) {
			Date date1 = new Date();
			System.out.println("date1 --> " + date1);
			System.out.println("date1(string) --> " + DateUtils.format(date1, "dd.MM.yyyy hh:mm:ss"));
			System.out.println("date1(calendar) --> " + DateUtils.toCalendar(date1));
			
			System.out.println("\n");
			
			String str1 = "15/12/2024 10:24";
			System.out.println("str1: " + str1);
			System.out.println("str1(date) --> : " + DateUtils.toDate(str1, "dd/MM/yyyy HH:mm"));
			System.out.println("str1(calendar) --> : " + DateUtils.toCalendar(str1, "dd/MM/yyyy HH:mm"));
			
			System.out.println("\n");
			
		}
	}