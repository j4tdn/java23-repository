package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	
	// DateFormat, SimpleDateFormat
	
	
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("date1 --> " + date1);
		String pattern = "dd/MM/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
		
		// convert date --> string 
		String str1 = df.format(date1);
		System.out.println("date1 formated: " + str1);
		
		Calendar c1 = Calendar.getInstance();
		
	}
}
