package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05Duration {
	// bài toán tìm hiệu giữa 2 mốc thgian
	// VD1: Ktra hàm chạy trong bao lâu
	// VD2: Cho mốc A, B tìm hiệu giữa 2 mốc tgian đó
	private static final String PATTEN = "dd/MM/yyyy HH:mm:ss"; 
	public static void main(String[] args) {
		Calendar start = DateUtils.toCalendar("20/08/2025 20:00:00",PATTEN);
		Calendar end = Calendar.getInstance();
		
		if(start.after(end)) {
			throw new IllegalArgumentException("StartTime should not greater than EndTime !!");
		}
		System.out.println("Start = " + DateUtils.format(start, PATTEN));
		System.out.println("End = " + DateUtils.format(end, PATTEN));

		long startInMs = start.getTimeInMillis(); // số ms từ start đến epoch
		long endInMs = end.getTimeInMillis(); // số ms từ end đến epoch
		
		long duration = endInMs - startInMs;
		long days = TimeUnit.MILLISECONDS.toDays(duration); // class xử lý đổi ms sang ngày
		
		long remaining = duration - TimeUnit.DAYS.toMillis(days); // đổi ngc lại 
		long hours = TimeUnit.MILLISECONDS.toHours(remaining); // số giờ
		
		remaining = remaining - TimeUnit.HOURS.toMillis(hours); 
		long minutes = TimeUnit.MILLISECONDS.toHours(remaining); // số phút
		
		remaining = remaining - TimeUnit.MINUTES.toMillis(minutes); 
		long second = TimeUnit.MICROSECONDS.toMillis(remaining); // sô giây
	}
}
