package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05Duration {
	
	//bài toán tìm hiệu giữa 2 mốc thời gian
	
	public static final String PATTERN = "dd.MM.yyyy HH:mm:ss";
	
	public static void main (String arg[]) {
		Calendar start = DateUtils.toCalendar("20.08.2024 20:10:00", PATTERN);
		Calendar end = Calendar.getInstance();
		
		
		long startInMs = start.getTimeInMillis();
		long endInMs = end.getTimeInMillis();
		
		long duration = endInMs - startInMs;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		long remaining = duration - TimeUnit.DAYS.toMillis(duration);
		long hours = TimeUnit.MILLISECONDS.toHours(remaining);
		
		remaining = remaining - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remaining);
		
		remaining = remaining - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remaining);
		
		System.out.println("day" + days + "hours" + hours + "minutes" + minutes + "seconds" + seconds);
	}
}
