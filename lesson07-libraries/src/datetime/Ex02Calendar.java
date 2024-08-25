package datetime;

import java.util.Calendar;

public class Ex02Calendar {
	
	// Strategy pattern 
	// Singleton pattern: Calendar
	// builder pattern: LocalDate, LocalTime, LocalDateTime
	
	
	public static void main(String[] args) {
		
		// c --> trả về thông tin thời gian hiện tại
		// month --> 0 -> 11
		/*
		 c --> java.util.GregorianCalendar
		 [time=?,areFieldsSet=false,areAllFieldsSet=true
		 ,lenient=true,zone=sun.util.calendar
		 .ZoneInfo[id="Asia/Saigon",offset=25200000
		 ,dstSavings=0,useDaylight=false,transitions=10,
		 lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,
		 ERA=1,YEAR=2024,MONTH=7,WEEK_OF_YEAR=35,WEEK_OF_MONTH=5,
		 DAY_OF_MONTH=25,DAY_OF_YEAR=238,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,
		 AM_PM=1,HOUR=4,HOUR_OF_DAY=6,MINUTE=27,SECOND=5,MILLISECOND=681,
		 ZONE_OFFSET=25200000,DST_OFFSET=0]

		 */
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 6); // set thời gian theo field HOUUR OF DAY
		System.out.println("c --> " + c);
		
		// ngày, tháng, năm
		// giờ (12 / 24) phút giây am/pm
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(" + dd/MM/yyyy -->" + (day + "/" + month + "/" + year));
		
		int hour = c.get(Calendar.HOUR); // HOUR (clock 12) HOUR_OF_DAY(clock 24)
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String apText = c.get(Calendar.AM_PM) == 0 ? "AM" : "PM";
		System.out.println(" + Giờ phút giây --> " + (hour + ":" + minute + ":" + second + " " + apText));
		
		// Date: Lưu trữ
		// Calendar : Lưu trữ + Xử lý
		// String: Định dạng in giá trị của Date, Calendar ở dạng String ( Ko dc dùng để tính toán)
		//		 : dd//MM/yyyy dd.MM.yyyy HH:mm:ss
		//		 : Chuyển đổi String, Date, Calendar
		// 	==> DateFormat, SimpleDateFormat
	}
}
