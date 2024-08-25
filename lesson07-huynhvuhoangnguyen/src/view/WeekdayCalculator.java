package view;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WeekdayCalculator {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		LocalDate date = null;
		while(date == null) {
			System.out.println("Enter date (dd/MM/yyyy): ");
			String input = ip.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			try {
				date = LocalDate.parse(input, formatter);
			} catch(DateTimeException e) {
				System.out.println("Invalid date format. Please try again.");
			}
		}
		ip.close();
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")) + " is a " + dayOfWeek);
		
		int dayOfYear = date.getDayOfYear();
		System.out.println("It is day number " + dayOfYear + " of the year.");
		
		int daysInYear = Year.of(date.getYear()).isLeap() ? 366 : 365;
		int remainintDays = daysInYear - dayOfYear;
		System.out.println(remainintDays + " days left.");
		
		int weekDayCount = countWeekDaysInYear(date.getYear(), dayOfWeek);
		System.out.println("It is " + dayOfWeek + " number " + weekDayCount + " out of " 
							+ getTotalWeekdays(date.getYear(), dayOfWeek) + " in " + date.getMonth() 
							+ " " + date.getYear() + ".");
		
		System.out.println("Year " + date.getYear() + " has " + daysInYear + " days.");
		System.out.println(date.getMonth() + " " + date.getYear() + " has " + date.lengthOfMonth() + " days.");
		
	}
	
	public static int countWeekDaysInYear(int year, DayOfWeek dayOfWeek) {
		int count = 0;
		LocalDate date = LocalDate.of(year, 1, 1);
		while(date.getYear() == year) {
			if(date.getDayOfWeek() == dayOfWeek) {
				count++;
			}
			date = date.plusDays(1);
		}
		return count;
	}
	
	public static int getTotalWeekdays(int year, DayOfWeek dayOfWeek) {
		int count = 0;
		LocalDate date = LocalDate.of(year, 1, 1);
		while(date.getYear() == year) {
			if(date.getDayOfWeek() == dayOfWeek) {
				count++;
			}
			date = date.plusDays(1);
		}
		return count;
	}
	
}