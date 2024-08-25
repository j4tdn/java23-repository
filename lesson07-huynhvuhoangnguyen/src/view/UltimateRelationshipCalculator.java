package view;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;


public class UltimateRelationshipCalculator {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter the start date of the relationship (yyyy-MM-dd): ");
		String startDateInput = ip.nextLine();
		LocalDate startDate = LocalDate.parse(startDateInput);
		
		LocalDateTime endDateTime = null;
		boolean validInput = false;
		
		while(!validInput) {
			System.out.println("Is the relationship ongoing? (yes/no): ");
			String ongoing = ip.nextLine();
			
			if(ongoing.equalsIgnoreCase("yes")) {
				endDateTime = LocalDateTime.now();
			} else if(ongoing.equalsIgnoreCase("no")){
				System.out.println("Enter the end date of the relationship (yyyy-MM-dd): ");
				String endDateInput = ip.nextLine();
				LocalDate endDate = LocalDate.parse(endDateInput);
				
				endDateTime = endDate.atStartOfDay();
				validInput = true;
			} else {
				 System.out.println("Invalid input. Please enter 'yes' or 'no'.");
			}
		}
		
		ip.close();
		
		LocalDateTime startDateTime = startDate.atStartOfDay();
		
		DayOfWeek dayOfWeek = startDate.getDayOfWeek();
		System.out.println("The relationship started on a " + dayOfWeek);
		
		Period period = Period.between(startDate, endDateTime.toLocalDate());
		Duration duration = Duration.between(startDateTime, endDateTime);
		
		long years = period.getYears();
		long months = period.getMonths();
		long days = period.getDays();
		long hours = duration.toHoursPart();
		long mins = duration.toMinutesPart();
		long secs = duration.toSecondsPart();
		
		System.out.println("The relationship lasted for: ");
		System.out.println(years + " years, " + months + " months, " + days + " days, " 
                + hours + " hours, " + mins + " minutes, " + secs + " seconds.");
		
	}
	
}