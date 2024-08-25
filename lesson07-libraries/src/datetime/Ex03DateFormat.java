package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static utils.DateUtils.*;

public class Ex03DateFormat {

	// DateFormat,SimpleDateFormat

	// Date, Calendar,String

	// Date -->String
	// Calendar ->String

	public static void main(String[] args) {
//		String pattern = "dd/MM/yyyy hh:mm:ss a";
//		DateFormat df = new SimpleDateFormat(pattern);
//
//		Date date1 = new Date();
//		System.out.println("Date -->" + date1);
//
//		// convert date -> string
//		String str1 = df.format(date1);
//		System.out.println("date1 formated-->" + str1);
//
//		Calendar c1 = Calendar.getInstance();
//		Date date2 = c1.getTime();
//		String str2 = df.format(date2);
//		System.out.println("Date 2 formated :" + str2);
		Date date1 = new Date();
		System.out.println("date 1 -->"+date1);
		System.out.println("date1(string)-->"+format(date1,"dd.MM.yyy hh:mm:ss a"));
		System.out.println("date1(calendar)-->"+toCalendar(date1));
		
		System.out.println("\n");
		
		String str1 = "15/12/2024";
		System.out.println("str1-->"+str1);
		System.out.println("str1(date)-->:"+toDate(str1,"dd/MM/yyyy"));
		
		System.out.println("\n");
		
		Calendar c1= Calendar.getInstance();
		System.out.println("c1-->"+c1);
//		System.out.println("c1`(date)-->:"+format(c1,DEFAULT_DATE_PATTERN));
		System.out.println("c1(date)-->:"+toDate(c1));
		
	}

}
