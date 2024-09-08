package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import utils.DateUtils;

public class Ex03LocalDateTime {
	public static void main(String[] args) throws IllegalAccessException {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime ldatetime1 = LocalDateTime.now();
		LocalDateTime ldatetime2 = LocalDateTime.parse("07/10/2024 10:30:15", df);
		
		// Hiệu LocalDate: Period
		// Hiệu LocalTime: Duration
		// Hiệu LocalDateTime: ? --> DEV
		
		if(ldatetime1.isAfter(ldatetime2)) {
			throw new IllegalAccessException("Starting time should not greater than EndingTime");
		}
		
		System.out.println(ldatetime1);
		System.out.println(ldatetime2);

		LocalDate ldate1 = ldatetime1.toLocalDate();
		LocalTime ltime1 = ldatetime1.toLocalTime();
		
		LocalDate ldate2 = ldatetime2.toLocalDate();
		LocalTime ltime2 = ldatetime2.toLocalTime();

		Period period = Period.between(ldate1, ldate2);
		Duration duration = Duration.between(ltime1, ltime2);
		
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}

		System.out.println("Timing details: " +
				DateUtils.opt(period.getYears(), "year") +
				DateUtils.opt(period.getMonths(), "month") +
				DateUtils.opt(period.getDays(), "day") +
				DateUtils.opt(duration.toHoursPart(), "hour") +
				DateUtils.opt(duration.toMinutesPart(), "minute") +
			DateUtils.opt(duration.toSecondsPart(), "second")
		);

	}
}
