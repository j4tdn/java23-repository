package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateTimeDemo {
	
	public  static String opt(long value, String unit) {
		if(value<=0) {
			return "";
		}
		return value +" "+unit +(value >1 ?"(s)":"")+"";
	}
	
	public static void main(String[] args) {
		//LocalDateTime: LocalDate, LocalTime
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime ldatetime1 = LocalDateTime.now();
		LocalDateTime ldatetime2 = LocalDateTime.parse("07/10/2024 22:50:50",df);
		
		System.out.println("ldatetime1 "+df.format(ldatetime1));
		System.out.println("ldatetime 2"+df.format(ldatetime2));
		
		if(ldatetime1.isAfter(ldatetime2)) {
			throw new IllegalArgumentException("startTime should not greater than End Time");
		}
		
		LocalDate ldate1= ldatetime1.toLocalDate();
		LocalDate ltime1= ldatetime1.toLocalDate();
		
		LocalDate ldate2 = ldatetime2.toLocalDate();
		LocalDate ltime2 = ldatetime2.toLocalDate();
		
		Period period = Period.between(ldate1, ldate2);
		Duration duration = Duration.between(ltime1, ltime2);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("Timing "+
				opt(period.getYears(),"years")+
				opt(period.getMonths(),"months")+
				opt(period.getDays(),"day")+
				opt(duration.toHoursPart(),"hour")+
				opt(duration.toMinutesPart(),"minute")+
				opt(duration.toSecondsPart(),"seconds")
				);
		
		
		// Hieu LocalDate : Period
		//Hieu LocalTime :Duration
		//Hieu LocalDate : ? --> DEV
	}
}