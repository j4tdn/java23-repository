package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03DateFormat {
	
	// DateFormat, SimpleDateFormat
	
	// Date, Calendar, String
	
	//Date --> String
	
	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat();
		
		Date date1 = new Date();
		System.out.println("date 1 : " + date1);
	}
}
