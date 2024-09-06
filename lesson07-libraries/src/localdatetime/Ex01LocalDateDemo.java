package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDateDemo {

	public static void main(String[] args) {
//		Date: new
//		Calendar: 	Calendar.getInstance()--> singleton
//		Local Date: --> builder 

		LocalDate lDate = LocalDate.now();
		System.out.println("ldate:  " + lDate);

		LocalDate lDate1 = LocalDate.of(2025, Month.JANUARY, 18);
		System.out.println("\nldate1: " + lDate1);

		LocalDate lDate2 = LocalDate.now().withDayOfMonth(12).withYear(2022).plusWeeks(1);// 19.08.2022
		                               //set lại thành ngày 12 -- năm 2022 - cộng 1 tuần 
		
		System.out.println("\nldate2: " + lDate2);

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println("ldate2 format: " + df.format(lDate2));

		//String --> LocalDate
		
		LocalDate lDate3 = LocalDate.parse("10.10.2020", df);
		System.out.println("\nlDate3: "+lDate3);
		
		System.out.println("\n==============\n");

		
		LocalDate start = LocalDate.parse("15.10.2022", df);
		LocalDate end = LocalDate.parse("22.08.2023", df);
		
//		Hiệu của LocalDate: Period
		Period period = Period.between(start, end);
		System.out.println("period " +period);//toString
		System.out.println("Detail period: " + period.getYears() +"year(s)" 
		+ period.getMonths() +"month(s) " 
		+ period.getDays()+ "day(s)");
		
		
		
	}
	private  String opt(long value, String unit) {
		if(value <=0 ) {
			return "";
		}
	return value +" " + unit + (value >1 ?"(s)" : "")+ " "; 	
	}
}
