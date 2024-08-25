package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class ProjectDeadlineCalculator {

	public static void main(String[] args) {
		
		LocalDate startDate = LocalDate.of(2024, 8, 23);
		
		int workingDays = 110;
		
		List<LocalDate> holidays = List.of(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 27), LocalDate.of(2025, 1, 28), 
				LocalDate.of(2025, 1, 29), LocalDate.of(2025, 1, 30), LocalDate.of(2025, 1, 31), LocalDate.of(2025, 2, 1), 
				LocalDate.of(2025, 1, 2), LocalDate.of(2025, 4, 30), LocalDate.of(2025, 5, 1), LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 2));
		
		LocalDate deliveryDate = calculateDiliveryDate(startDate, workingDays, holidays);
		
		System.out.println("The delivery date is: " + deliveryDate);
		
	}
	
	public static boolean isHoliday(LocalDate date, List<LocalDate> holidays) {
		return holidays.contains(date);
	}
	
	public static LocalDate calculateDiliveryDate(LocalDate startDate, int workingDays, List<LocalDate> holidays) {
		LocalDate diliveryDate = startDate;
		int daysAdded = 0;
		
		while(daysAdded < workingDays) {
			diliveryDate = diliveryDate.plusDays(1);
			
			if(diliveryDate.getDayOfWeek() != DayOfWeek.SATURDAY &&
			   diliveryDate.getDayOfWeek() != DayOfWeek.SUNDAY &&
			   !isHoliday(diliveryDate, holidays)) {
				daysAdded++;
			}
		}
		return diliveryDate;
	}
	
}