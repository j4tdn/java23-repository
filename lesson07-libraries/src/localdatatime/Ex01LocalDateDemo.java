package localdatatime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDateDemo {
	
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		System.out.println("ldate: " + ldate);
		
		//Enumm hoặc number cho tháng
		LocalDate ldate1 = LocalDate.of(2025, 06, 18);
		System.out.println("ldate1 : " + ldate1);
		
		LocalDate ldate2 = LocalDate.now().withDayOfMonth(12).withYear(2022).plusWeeks(1); //   19/08/2022
		System.out.println("ldate2 : " + ldate2);
		
		// format -- DatimeFormatter
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println("ldate2 format: "+df.format(ldate2));
		
		//String -> LocalDate
		LocalDate ldate3 = LocalDate.parse("10.10.2010",df);
		System.out.println("ldate3 parse: " + ldate3);
		
		System.out.println("\n=====================================================\n");
		LocalDate start = LocalDate.parse("15.02.2024",df);
		LocalDate end = LocalDate.parse("22.08.2024",df);
		
		//Hiệu 2 mốc thgian LocalDate: Period
		
		Period period = Period.between(start, end);
		System.out.println("period: " + period); // toString
		System.out.println("period details: " + opt(period.getYears() , " year(s) ") + opt( period.getMonths() ," months(s) ") + opt(period.getDays() , " day(s)"));
		
	}
	
	
	private static String opt(long value, String unit) {
		if(value <=0) {
			return "";
		}
		return value + " " + unit + (value > 1 ? "(s)" : "") + " ";
	}
}
