package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;
public class Ex02LocalTimeDemo {
	public static void main(String[] args) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss a");
		LocalTime ltime1 = LocalTime.of(10, 12, 10);
		LocalTime ltime2 = LocalTime.of(18, 50, 30);
		
		System.out.println("ltime1: " + ltime1);
		System.out.println("ltime2 format: " + df.format(ltime2));
		
		// TimeUnit
		// Hieu cua LocalTime: Duration
		
		Duration duration = Duration.between(ltime1, ltime2);
		System.out.println("duration " + duration);
		System.out.println("duration details: " + 
							opt(duration.toHours(), "hour") +
							opt(duration.toMinutesPart(), "minute") +
							opt(duration.toSecondsPart(), "second"));
		
	}
}
