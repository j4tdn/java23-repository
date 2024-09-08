package localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import utils.DateUtils;

public class Ex01LocalDateDemo {
	// Date: new
	// Calendar: Singleton.
	// LocalDate: --> Builder

	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		System.out.println(ldate);

		LocalDate ldate1 = LocalDate.of(2025, Month.JUNE, 18);
		System.out.println(ldate1);

		LocalDate ldate2 = LocalDate.now()
				.withDayOfMonth(12)
				.withYear(2022)
				.plusWeeks(1);
		System.out.println("ldate2: " + ldate2);

		// format --> DateTimeFormatter
		// LocalDate -> String.
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println(ldate.format(df));

		// String --> LocalDate
		LocalDate ldate3 = LocalDate.parse("20.10.2020", df);
		System.out.println(ldate3);

		LocalDate start = LocalDate.parse("15.02.2024", df);
		LocalDate end = LocalDate.parse("25.02.2024", df);

		// Hiệu của LocalDate, Period.
		Period period = Period.between(start, end);
		System.out.println("Period: " + period);
		System.out.println("Period details: " +
				DateUtils.opt(period.getYears(), "year") +
				DateUtils.opt(period.getMonths(), "month") +
				DateUtils.opt(period.getDays(), "day")
				);
	}


}
