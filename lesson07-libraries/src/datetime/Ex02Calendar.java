package datetime;

import java.util.Calendar;

public class Ex02Calendar {
	public static void main(String[] args) {
		// c --> trả về thông tin thời gian hiện tại
		// month --> 0 -> 11
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 6); // set thời gian theo fiel HOUUR OF DAY
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
