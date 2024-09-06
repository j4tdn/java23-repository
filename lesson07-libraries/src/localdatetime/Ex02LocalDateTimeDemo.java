package localdatetime;

import static utils.DateUtils.*;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Ex02LocalDateTimeDemo {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:yyyy");
		
		LocalTime ltime1 = LocalTime.of(10, 12, 10);	
		LocalTime ltime2 = LocalTime.of(18, 50, 30);	
		
		System.out.println("ltime1 --> "+ltime1);
		System.out.println("ltime2 --> " +df.format(ltime2));
	
	Duration duration = Duration.between(ltime1, ltime2);
	System.out.println("duration: " +duration);
	System.out.println("duration details: " +
			opt(duration.toHoursPart(),"hour")+ 
			opt(duration.toMinutesPart(),"minutue") + 
			 opt(duration.toSecondsPart(), "second")
			);
	
	
	}
}
