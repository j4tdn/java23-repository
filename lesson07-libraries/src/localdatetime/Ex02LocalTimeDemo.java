package localdatetime;

import java.io.OptionalDataException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import utils.DateUtils;

public class Ex02LocalTimeDemo {
	
	
	public static void main(String[] args) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss"); 
		
		LocalTime ltime1 = LocalTime.of(10,12,10);
		LocalTime ltime2 = LocalTime.of(18, 50, 30);
		
		System.out.println("ltime 1 : " + ltime1);
		System.out.println("ltime 2 format: " + df.format(ltime2));
		
		//TimeUnit
		// Hiệu của LocalTime: Duration
		Duration duration = Duration.between(ltime1, ltime2);
		System.out.println("duration : " + duration);
		System.out.println("duration : "
				+ DateUtils.opt(duration.toHours(), "hours")
				+ DateUtils.opt(duration.toMinutesPart(), "minute")
				+ DateUtils.opt(duration.toSecondsPart(), "second")
				);
	}
}
