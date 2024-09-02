package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import static utils.DateUtils.*;

public class Ex02LocalTimeDemo {
	public  static String opt(long value, String unit) {
		if(value<=0) {
			return "";
		}
		return value +" "+unit +(value >1 ?"(s)":"")+"";
	}
	
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		
		LocalTime ltime1 = LocalTime.of(10, 12, 10) ;
		LocalTime ltime2 =LocalTime.of(18, 50, 30);
		
		System.out.println("ltime1"+ltime1);
		System.out.println("ltime2 format "+df.format(ltime2));
		
		
		//Time
		Duration duration = Duration.between(ltime1, ltime2);
		System.out.println("duration"+duration);
		System.out.println("duration details"+
				opt(duration.toHoursPart(),"hour")+
				opt(duration.toMinutes(),"minutes")+
				opt(duration.getSeconds(),"seconds")
				);
	}
	
	
	
}