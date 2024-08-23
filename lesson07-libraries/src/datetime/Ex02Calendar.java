package datetime;

import java.util.Calendar;

public class Ex02Calendar {

//	stragery pattern
//	singleton pattern: Calendar
//	builder pattern : LocalDate,LocalTime,LocalDateTime,....

	// strategy pattern
		// string pattern: Calendar
		// builder pattern: LocalDate, LocalTime, LocalDateTime ...
		public static void main(String[] args) {
			
               Calendar c = Calendar.getInstance();			
			c.set(Calendar.HOUR_OF_DAY, 6); // set thời gian theo field HOUR_OF_DAY
			System.out.println("c --> "+ c);
			
			int day = c.get(Calendar.DAY_OF_MONTH);
			int month = c.get(Calendar.MONTH);
			int year = c.get(Calendar.YEAR);
			
			System.out.println("+ dd/MM/YY --> " + (day + "/" + month + "/" + year));
			
			int hour = c.get(Calendar.HOUR); // HOUR(clock 12) HOUR_OF_DAY(clock 24)
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			String apText = c.get(Calendar.AM_PM) == 0 ? "AM" : "PM";
			
			System.out.println("+ Giờ phút giây --> " + (hour + ":" + minute + ":" + second + " " + apText));
			
			// Date		: lưu trữ
			// Calendar	: lưu trữ + xử lý
			// String	: định dạng in giá trị của Date, Calendar ở dạng String(ko đc dùng để tính toán)
			// 			: dd/MM/yyyy dd.MM.yyyy HH:mm:ss
			//			: chuyển đổi String, Date, Calendar
			// Date Format, SimpleDateFormat
		}
	}