package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import utils.DateUtils;
import static utils.DateUtils.*;
public class Ex02LocalDateTimeDemo {

	public static void main(String[] args) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime ltime1 = LocalTime.of(10, 12, 10);
		LocalTime ltime2 = LocalTime.of(18, 50, 30);
		
		System.out.println("ltime1: " + ltime1);
		System.out.println("ltime2 format: " + df.format(ltime2));
		
		if(ltime1.isAfter(ltime2)) {
			throw new IllegalArgumentException("StartTime should not greater than EndTime !!!");
		}
		
		// TimeUnit
		// Hieu cua LocalTime: Duration
		Duration duration = Duration.between(ltime1, ltime2);
		System.out.println("duration: " + duration);
		System.out.println("duration details: " + opt(duration.toHoursPart(), "hour") 
												+ opt(duration.toMinutesPart(), "minute")
												+ opt(duration.toSecondsPart(), "second"));
	}
}
