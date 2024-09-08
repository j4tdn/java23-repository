package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05Duration {
	
	// bài toán tìm hiệu giữa 2 mốc thời gian
	// VD1: Kiểm tra xem hàm chạy trong bao lâu
	// VD2: Cho mốc A, B, tìm hiệu giữa 2 mốc thời gian đó
	
	// Hiệu: Năm, tháng, ngày, giờ, phút, giây
	
	// duration: ms -> day, hour, minute, second --> hạn chế
	
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	
	public static void main(String[] args) {
		Calendar start = DateUtils.toCalendar("20/06/2024 10:00:00", PATTERN);
		Calendar end = Calendar.getInstance();
		
		if (start.after(end)) {
			throw new IllegalArgumentException("StartTime should not greater than EndTime !!!");
		}
		
		System.out.println("start = " + DateUtils.format(start, PATTERN));
		System.out.println("end = " + DateUtils.format(end, PATTERN));
		
		long startInMs = start.getTimeInMillis(); // số ms từ start epoch 01.01.1970
		long endInMs = end.getTimeInMillis();
		
		long duration = endInMs - startInMs; // ms
		
		long days = TimeUnit.MILLISECONDS.toDays(duration); // số ngày
		
		long remaining = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remaining); // số giờ
		
		remaining = remaining - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remaining); // số phút
		
		remaining = remaining - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remaining); // số giây
		
		System.out.println(""
				+ days + " day(s) "
				+ hours + " hour(s) "
				+ minutes + " minutes(s) "
				+ seconds + " second(s) ");
	}
}
