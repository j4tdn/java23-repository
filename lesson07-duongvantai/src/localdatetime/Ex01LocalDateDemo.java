package localdatetime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDateDemo {
	 
	 // 	Date : new 
	// 		Calendar: Calendar.getInstance()
	// 
	
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		System.out.println("ldate-> " + ldate);
		
		LocalDate ldate1 = LocalDate.of(2025, 06, 18);
		System.out.println("ldate1-> " + ldate1);
		
		LocalDate ldate2 = LocalDate.now()
				.withDayOfMonth(12)
				.withYear(2022)
				.plusWeeks(1);
		
		System.out.println("ldate2-> " + ldate2);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println("ldate2-> " + ldate2);
		LocalDate ldate3 = LocalDate.parse("10.10.2020", df);
		System.out.println("================================");
		LocalDate start = LocalDate.parse("15.02.2024", df);
		LocalDate end = LocalDate.parse("22.08.2024", df);
		Period period = Period.between(start, end);
		System.out.println("period: " + period);
		System.out.println("period details: " + 
											period.getYears()+ " year"
											+ period.getMonths() + " month(s)"
											+ period.getDays() + " day (s)");
		
		
	}
	private String opt(long value , String unit) {
		if(value <= 0) {
			return "";
		} 
		return value + " " + unit +(value > 1?"(s)" : "") + " ";
	}

}
