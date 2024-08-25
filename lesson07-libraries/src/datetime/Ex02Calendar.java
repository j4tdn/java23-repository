package datetime;

import java.util.Calendar;

public class Ex02Calendar {
	// strategy pattern
	// singleton pattern: Calendar
	// builder pattern : LocalDate, LocalTime, LocalDateTime ...

	public static void main(String[] args) {

		// date day
		// c --> trả về thông tin thời gian hiện tại
		// month: 0-11
		// java.util.GregorianCalendar[time=1723642869473,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
		// zone=sun.util.calendar.ZoneInfo[id="Asia/Bangkok",offset=25200000,dstSavings=0,
		// useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,
		// minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=7,WEEK_OF_YEAR=33,WEEK_OF_MONTH=3,
		// DAY_OF_MONTH=14,DAY_OF_YEAR=227,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,
		// HOUR_OF_DAY=20,MINUTE=41,SECOND=9,MILLISECOND=473,ZONE_OFFSET=25200000,DST_OFFSET=0]
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 6); // set thời gian theo field HOUR_OF_DAY
		System.out.println("c --> " + c);

		// ngày tháng năm
		// giờ(12/24) phút giây am/pm

		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);

		System.out.println("+ Ngày tháng năm --> " + (day + "/" + month + "/" + year));

		int hour = c.get(Calendar.HOUR); // HOUR(clock 12) HOUR_OF_DAY(clock 24)
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String apText = c.get(Calendar.AM_PM) == 0 ? "AM" : "PM";
		System.out.println("+ Giờ phút giây --> " + (hour + ":" + minute + ":" + second + " " + apText));

		// Date : Lưu trữ
		// Calendar: Lưu trữ + Xử lý
		// String : Định dang in giá trị của Date, Calendar ở dạng String(ko được dùng
		// để tính toán)
		// : dd/MM/yyyy dd.MM.yyyy HH:mm:ss
		// : Chuyển đổi String, Date, Calendar
		// ==> DateFormat, SimpleDateFormat
	}
}