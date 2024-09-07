package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05Duration {

	private static final String PATTERN = "dd/MM/yyyy HH:mms:ss";
	
	public static void main(String[] args) {
		Calendar start = DateUtils.toCalendar("15/09/2024 19:00:00", PATTERN);
		Calendar end = Calendar.getInstance();
		
		if (start.after(end)) {
			throw new IllegalArgumentException("StartTime should not greater than EndTime !!!");
		}
		
		System.out.println("start = " + DateUtils.format(start, PATTERN));
		System.out.println("end = " + DateUtils.format(end, PATTERN));
		
		long startInMs = start.getTimeInMillis();
		long endInMs = start.getTimeInMillis();
		
		long duration = endInMs - startInMs;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		long remaining = duration -  TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remaining);
		
		remaining = remaining -  TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remaining);
		
		remaining = remaining -  TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remaining);
		
		System.out.println("" 
		+ days + " day(s) "
		+ hours + " hour(s) "
		+ minutes + " minute(s) "
		+ seconds + " second(s)");
		
	}
	
}
