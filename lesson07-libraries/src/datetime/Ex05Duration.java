package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05Duration {
	
	// Bai toan tim hieu giua 2 moc tg
	// VD1: Kiem tra xem ham chay trong bao lau
	// VD2: CHo moc A, B tim hieu giua 2 moc tg do
	
	// duration: ms --> day, hour, time, s
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	public static void main(String[] args) {
		Calendar start = DateUtils.toCalendar("20/06/2024 10:00:00", PATTERN);
		Calendar end = Calendar.getInstance();
		
		if(start.after(end)) {
			throw new IllegalArgumentException("StartTime should not greater than EndTime !!! ");
		}
		
		System.out.println("start = " + DateUtils.format(start, PATTERN));
		System.out.println("end = " + DateUtils.format(end, PATTERN));
		
		long startInMs = start.getTimeInMillis(); // So ms tu start den epoch
		long endInMs = end.getTimeInMillis(); // So ms tu start den epoch
		
		long duration = endInMs - startInMs; // ms
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		long remaining = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(remaining); // so gio 
		
		remaining = remaining - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toHours(remaining); // so phut
		
		remaining = remaining - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toHours(remaining); // so giay
		
		System.out.println("" + days + " day(s) " + hours + " hour(s) " + minutes + "minute(s)" + seconds + " second(s)" );
		
	}
}
