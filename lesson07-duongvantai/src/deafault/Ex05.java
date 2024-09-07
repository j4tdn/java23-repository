package deafault;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05 {
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	public static void main(String[] args) {
		Calendar start = DateUtils.toCalendar("20/06/2024 10:00:00",PATTERN );
		Calendar end = Calendar.getInstance();
		if(start.after(end)) {
			throw new IllegalArgumentException("StarTIme should not greater than EndTime");
			
		}
		System.out.println("start = " + DateUtils.format(start, PATTERN));
		System.out.println("end = " + DateUtils.format(end, PATTERN));
		
		long startInMs= start.getTimeInMillis();
		long endInMs = end.getTimeInMillis();
		
		long duration = endInMs - startInMs;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		long remaining = duration - TimeUnit.DAYS.toMillis(days);
		//long hours = TimeUnit.MILLISECONDS.toHours(hour);
		
	}

}
