package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05Duration {
	
	// Bài toán tìm hiệu giữa 2 mốc thời gian
	// VD1: Kiểm tra xem hàm chạy trong bao lâu
	// VD2: Cho mốc A, B, tìm hiệu giữa 2 mốc thời gian đó
	
	// Hiệu: Năm, tháng, ngày, giờ, phút, giây
	
	// duration: ms --> day, hour, minute, second ==> hạn chế
	
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	
	public static void main(String[] args) {
		Calendar start = DateUtils.toCalendar("20/06/2024 10:00", PATTERN);
		Calendar end = Calendar.getInstance();
		
		if(start.after(end)) {
			throw new IllegalArgumentException("StartTime should not greater than EndTime !!!");
		}
		
		System.out.println("start = " + DateUtils.format(start, PATTERN));
		System.out.println("end = " + DateUtils.format(end, PATTERN));
		
		System.out.println();
		
		long startInMS = start.getTimeInMillis(); // Số ms từ start đến epoch
		long endInMs = end.getTimeInMillis(); // Số ms từ end đến epoch
		
		long duration = endInMs - startInMS; // ms
		
		long days = TimeUnit.MILLISECONDS.toDays(duration); // số ngày
		
		long remaining = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remaining); // số giờ
		
		remaining = remaining - TimeUnit.HOURS.toMillis(days);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remaining); // số phút
		
		remaining = remaining - TimeUnit.MINUTES.toMillis(days);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remaining); // số giây
		
		System.out.println(""
				+ days + "day(s) "
				+ hours + "hours(s) "
				+ minutes + "minutes(s) "
				+ seconds + "seconds ");
	}
	
}
