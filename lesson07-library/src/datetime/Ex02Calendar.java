package datetime;

import java.util.Calendar;

public class Ex02Calendar {
	// strategy pattern:
	// singleton pattern: Calendar
	// builder pattern: LocalDate, LocalTime, LocalDateTime...

	public static void main(String[] args) {

		// singleton pattern

		// c-> trả về thông tin thời gian hiện tại
		Calendar c = Calendar.getInstance();

		// ngày tháng năm
		// giờ(12/24) phút giây am/pm

		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);

		System.out.println("dd/mm/yyyy --> " + (day + "/" + month + "/" + year));

		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		String ap = c.get(Calendar.AM_PM) == 0 ? "AM" : "PM";
		System.out.println("hour:minute:s " + hour + ":" + minute + " " + ap);

		// Date: Lưu trữ
		// Calendar: Lưu trữ + xử lý
		// String: Định dạng in ra giá trị Date, Calendar
		// : dd/MM/yyyy dd.MM.yyyy HH:mm:ss
		// : chuyển đổi string, date, calendar
		// ==> DateFormat, SimpleDateFormat
	}
}
