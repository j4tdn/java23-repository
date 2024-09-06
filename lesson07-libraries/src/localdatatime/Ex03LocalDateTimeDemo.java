package localdatatime;

import static utils.DateUtils.opt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import utils.DateUtils;
public class Ex03LocalDateTimeDemo {
	public static void main(String[] args) {
		// LocalDate: LocalDate, LocalTime
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime ldatetime1 = LocalDateTime.now();
		LocalDateTime ldatetime2 = LocalDateTime.parse("07/10/2024 23:20:50",df);

		System.out.println("ldate1: " + df.format(ldatetime1));
		System.out.println("ldate2: " + df.format(ldatetime2));

		// Hiệu LocalDate: Period
		// Hiệu LocalTime: Duration
		// Hiệu LocalDatetime: ? -> Dev: Year, Month, Day, Hours, minute, second
		
		LocalDate ldate1 = ldatetime1.toLocalDate();
		LocalTime ltime1 = ldatetime1.toLocalTime();
		
		LocalDate ldate2 = ldatetime1.toLocalDate();
		LocalTime ltime2 = ldatetime1.toLocalTime();
		
		Period period = Period.between(ldate1, ldate2);
		Duration duration = Duration.between(ltime1, ltime2);
		
		if(duration.isNegative()) {
			duration = duration.plus(duration);
			period = period.minusDays(1);
		}
		System.out.println("Timing " + opt(period.getYears() , " year(s) ") + opt(period.getMonths() ," months(s) ") + opt(period.getDays() , " day(s)" + opt(duration.toHoursPart(), "hour") + opt(duration.toMinutesPart(), "minute") + opt(duration.toSecondsPart(), "second")));
				
	}
}
