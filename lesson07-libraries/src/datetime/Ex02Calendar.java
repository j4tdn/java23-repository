package datetime;

import java.util.Calendar;

public class Ex02Calendar {

	// strategy pattern
	// singleton pattern: calender
	// builder pattern: localDate, LocalTime, LocalDateTime, ...
	
	public static void main(String[] args) {
		
		// c -> trả về thông tin thời gian hiện tại 
		Calendar c = Calendar.getInstance();
		System.out.println("c --> " + c);
		
		// ngày tháng năm 
		// giờ (12/24) phút giây am/pm
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day + " / " + month + " / " + year) ;
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String aptext = c.get(Calendar.AM_PM) == 0 ? "AM"  : "PM";
		System.out.println("Gio phut giay: " + hour + ":" + minute + ":" + second + " " + aptext);
		
		// Date : lưu trữ 
		// Calendar: lưu trữ xử lý 
		
	}

}
