package datetime;

import java.util.Calendar;

public class Ex02Calendar {
		
	// strategy pattern
	//singleton pattern : calendar
	//builder pattern : LocalDate, LocalTime, LocalDateTime ...
	
	public static void main(String[] args) {
		
		//date day
		// c--> tra ve thong tin thoi gian hien tai
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 6);// set lai thoi gian theo fiel theo hour_of_day
		System.out.println("c-->"+c);
		
		// ngay thang na
		// gio (12/24) phut giau am/pm
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		
		System.out.println("dd/mm/yyyy"+(day+"/"+month+"/"+year));
		
		int hour = c.get(Calendar.HOUR);//Hour(clock 12) Hour_of_day(clock 24)
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String apText = c.get(Calendar.AM_PM) == 0 ? "Am" : "PM";
		
		System.out.println("+Gio phut giay"+(hour+":"+minute+":"+second+":"+apText));
		
		
		//Date : Luu tru 
		//Calendar :Luu tru +xu ly
		//string : dinh dang in gia tri cua date, calendar o dang String (ko dc dung de tinh toan)
		//		  :dd/mm/yyyy dd.mm.yyyy hh:mm:ss
		//		   : Chuyen doi String ,date, calendar
		//==>DateFormat, SimpleDateFormat
	}
	
	
}
