package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateTimeDemo {

	public static void main(String[] args) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime ldatetime1 = LocalDateTime.now();
		LocalDateTime ldatetime2 = LocalDateTime.parse("07/10/2024 23:50:50", df);
		
		System.out.println("ldatetime1 : "+ df.format(ldatetime1));
		System.out.println("ldatetime2 : "+ df.format(ldatetime2));
		// Hiệu LocalDate : period
		// Hiệu localTime: Duration 
		if(ldatetime1.isAfter(ldatetime2)) {
			throw new IllegalArgumentException("startTime should not greater than EndTime");
		}
		 LocalDate ldate1 = ldatetime1.toLocalDate();
		 LocalTime ltime1 = ldatetime1.toLocalTime();
		 
		 LocalDate ldate2= ldatetime2.toLocalDate();
		 LocalTime ltime2 = ldatetime2.toLocalTime();
		 
		 Period period = Period.between(ldate1, ldate2);
		 Duration duration = Duration.between(ldate2, ltime2);
		 if(duration.isNegative()) {
			 duration = duration.plusDays(1);
			// period = period.
		 }
	}

}
