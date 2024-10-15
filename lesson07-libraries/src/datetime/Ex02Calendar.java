package datetime;

import java.util.Calendar;

public class Ex02Calendar {
	// strategy pattern
	// singleton pattern
	//builder pattern : :LocalDate, LocalTime, LocalDateTime ...
	
	public static void main(String[] args) {
		
		// c--> tra ve thong tin thoi gian hien tai
		//args java.util.GregorianCalendar[time=1728551424077,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Saigon",offset=25200000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=284,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=10,SECOND=24,MILLISECOND=77,ZONE_OFFSET=25200000,DST_OFFSET=0]

		Calendar c =  Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 6);
		System.out.println("c --> " + c);
		
		// ngày tháng năm
		// giờ (12/24) phút giây am/pm 
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		
		System.out.println("đ/MM/yyyy --> " + day + "/" + month + "/" + year);
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String apText = c.get(Calendar.AM_PM) == 0 ? "AM" : "PM";
		
		System.out.println("+ Giờ phút giây --> " + (hour + ":" + minute + ":" + second + ":" + apText));
		
		//Date : lưu trữ
		// Calendar: Lưu trữ + xử lý
		// String: Định dạng in giá trị của Date, Calendar ở dạng String (k ddược dùng để tính toán)
		// 		: dd/MM/yyyy  dd.MM.yyyy HH:mm:ss
		//		: chuyển đổi String, Date, Calendar
		// 		==> DateFormat, SimpleDateFormat
}
}
