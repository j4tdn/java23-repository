package view;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Day (dd): ");
		int day = ip.nextInt();

		System.out.print("Month (MM): ");
		int month = ip.nextInt();

		System.out.print("Year (yyyy): ");
		int year = ip.nextInt();

		calculateDateInfo(day, month, year);

		ip.close();
	}

	public static boolean validateDate(int day, int month, int year) {
		try {
			LocalDate.of(year, month, day);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	  public static void calculateDateInfo(int day, int month, int year) {
		  try {
	            if (!validateDate(day, month, year)) {
	                System.out.println("Invalid date. Please enter a valid date.");
	                return;
	            }

	            LocalDate date = LocalDate.of(year, month, day);
	            DayOfWeek dayOfWeek = date.getDayOfWeek();
	            String dayOfWeekText = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH);
	            String formattedDate = date.format(formatter);

	            int dayOfYear = date.getDayOfYear();

	            int daysLeftInYear = Year.of(year).length() - dayOfYear;

	            int weekOfYear = date.get(WeekFields.of(Locale.getDefault()).weekOfYear());

	            int daysInYear = Year.of(year).length();

	            int daysInMonth = date.lengthOfMonth();

	            System.out.println(formattedDate + " is a " + dayOfWeekText);
	            System.out.println("Additional facts:");
	            System.out.println("It is day number " + dayOfYear + " of the year, " + daysLeftInYear + " days left.");
	            System.out.println("It is " + dayOfWeekText + " number " + weekOfYear + " out of " + (daysInYear / 7 + 1)
	                    + " in " + year + ".");
	            System.out.println("Year " + year + " has " + daysInYear + " days.");
	            System.out.println("Month " + month + " of " + year + " has " + daysInMonth + " days.");
	        } catch (DateTimeException e) {
	            System.out.println("Invalid date. Please enter a valid date.");
	        } catch (Exception e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
}