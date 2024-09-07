package datetime;

import java.util.Calendar;

public class Ex02Calendar {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 6);
		System.out.println("c --> " + c);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		
		System.out.println("dd/MM/yyyy --> " + (day + "/" + month + "/" + year));
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String apText = c.get(Calendar.AM_PM) == 0 ? "AM" : "PM";
		System.out.println("+ Giờ phút giây --> " + (hour + ":" + minute + ":" + second + " " + apText));
		
	}
	
}
