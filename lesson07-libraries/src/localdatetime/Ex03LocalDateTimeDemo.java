package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateTimeDemo {

	public static void main(String[] args) {
//		LocalDateTime: LocalDate, LocalTime
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime ldatetime1 = LocalDateTime.now();
		LocalDateTime ldatetime2 = LocalDateTime.parse("07/10/2024 23:50:50",df);
		
		System.out.println("ldatetime1: --> " +ldatetime1);
		System.out.println("ldatetime2 --> " +df.format(ldatetime2));
		

	
	}
}
