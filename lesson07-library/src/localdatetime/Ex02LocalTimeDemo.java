package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import utils.DateUtils;

public class Ex02LocalTimeDemo {
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");

		LocalTime ltime1 = LocalTime.of(15, 30, 10);
		LocalTime ltime2 = LocalTime.of(20, 15, 15);

		System.out.println(ltime1);

		// TimeUnit
		// Hiệu của LocalTime: Duration
		Duration duration = Duration.between(ltime1, ltime2);

		System.out.println(duration);
		
		System.out.println("Duration detail: " + 
					DateUtils.opt(duration.toHoursPart(), "hour") +
					DateUtils.opt(duration.toMinutesPart(), "minute") +
				DateUtils.opt(duration.toSecondsPart(), "second")
				);
	}

}
