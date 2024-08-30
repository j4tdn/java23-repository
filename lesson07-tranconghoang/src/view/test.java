package view;

import static utils.DateUtils.opt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class test {
	
	public static void main(String[] args) {
		// LocalDateTime: LocalDate, LocalTime
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime ldatetime1 = LocalDateTime.now();
		LocalDateTime ldatetime2 = LocalDateTime.parse("07/10/2024 10:50:50", df);
		
		System.out.println("ldatetime1: " + df.format(ldatetime1));
		System.out.println("ldatetime2: " + df.format(ldatetime2));
		
		// Hiệu LocalDate: Period
		// Hiệu LocalTime: Duration
		// Hiệu LocalDateTime: ? --> DEV: Year, Month, Day, Hour, Minute, Second
		
		if (ldatetime1.isAfter(ldatetime2)) {
			throw new IllegalArgumentException("StartTime should not greater than EndTime !!!");
		}
		
		LocalDate ldate1 = ldatetime1.toLocalDate();
		LocalTime ltime1 = ldatetime1.toLocalTime();
		
		LocalDate ldate2 = ldatetime2.toLocalDate();
		LocalTime ltime2 = ldatetime2.toLocalTime();
		
		Period period = Period.between(ldate1, ldate2);
		Duration duration = Duration.between(ltime1, ltime2);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("Timing: " + 
			    opt(period.getYears(), "year") +
			    opt(period.getMonths(), "month") +
			    opt(period.getDays(), "day") + 
			    opt(duration.toHoursPart(), "hour") +
				opt(duration.toMinutesPart(), "minute") +
				opt(duration.toSecondsPart(), "second")
		);
	}
	
}