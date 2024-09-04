package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDateDemo {

	// Date: new -> setter -> void
	
	// Calendar: Calendar.getInstance() --> singleton
	
	// LocalDate: -> builder
	
	public static void main(String[] args) {
		
		// month: 1-12
		
		LocalDate ldate = LocalDate.now();
		System.out.println("\nldate: " + ldate);
		
		
		// Enum or number cho tháng
		LocalDate ldate1 = LocalDate.of(2025, Month.JUNE, 18);
		System.out.println("\nldate1: " + ldate1);
		
		LocalDate ldate2 = LocalDate.now()
				.withDayOfMonth(12)
				.withYear(2022)
				.plusWeeks(1);
		System.out.println("\nldate2: " + ldate2); // toString
		
		// format --> DateTimeFormatter
		// LocalDate -> String
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println("\nldate2 format: " + df.format(ldate2));
		
		// String -> LocalDate
		LocalDate ldate3 = LocalDate.parse("10.10.2020", df);
		System.out.println("\nldate3 parse: " + ldate3);
		
		System.out.println("\n=====================================\n");
		
		LocalDate start = LocalDate.parse("15.02.2024", df);
		LocalDate end = LocalDate.parse("22.08.2024", df);
		
		// Hiệu của LocalDate: Period
		Period period = Period.between(start, end);
		System.err.println("period: " + period); // toString
		System.err.println("period details: " + 
					otp(period.getYears(), "year")+
					otp(period.getMonths(), "month")  +
					otp(period.getDays(), "day"));
		
	}
	
	private static String otp(long value, String unit) {
		if(value <= 0) {
			return "";
		}
		return value + " " + unit + (value > 1 ? "(s)" : "") + " ";
	}
	
}
