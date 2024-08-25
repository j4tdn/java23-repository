package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.print("Enter day: ");
				int day = Integer.parseInt(sc.nextLine());
				System.out.print("Enter month: ");
				int month = Integer.parseInt(sc.nextLine());
				System.out.print("Enter year: ");
				int year = Integer.parseInt(sc.nextLine());

				String dateString = day + "/" + month + "/" + year;
				LocalDate localDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
				System.out.println(localDate.getDayOfMonth() + " " + localDate.getMonth() + " " + localDate.getYear() + " is a "
						+ localDate.getDayOfWeek());

				System.out.println("Additional fact");
				System.out.println("It is day number " + localDate.getDayOfYear() + " days of the year, "
						+ (localDate.lengthOfYear() - localDate.getDayOfYear()) + " days left");

				// Tìm tổng số thứ trong năm và ngày hiện tại thuộc số thứ mấy của thứ trong năm
				int countDayOfWeekInYear = 0;
				int currentDayOfWeekInYear = 0;
				for (int i = 1; i < localDate.lengthOfYear(); i++) {
					LocalDate ldateTemp = LocalDate.ofYearDay(year, i);
					if (ldateTemp.getDayOfWeek() == localDate.getDayOfWeek()) {
						countDayOfWeekInYear++;
						if (ldateTemp.equals(localDate)) {
							currentDayOfWeekInYear = countDayOfWeekInYear;
						}
					}
				}

				// Tìm tổng số thứ trong tháng và ngày hiện tại thuộc số thứ mấy của thứ trong
				// năm
				int countDayOfWeekInMonth = 0;
				int currentDayOfWeekInMonth = 0;
				for (int i = 1; i < localDate.lengthOfMonth(); i++) {
					LocalDate ldateTemp = LocalDate.of(year, localDate.getMonth(), i);
					if (ldateTemp.getDayOfWeek() == localDate.getDayOfWeek()) {
						countDayOfWeekInMonth++;
						if (ldateTemp.equals(localDate)) {
							currentDayOfWeekInMonth = countDayOfWeekInMonth;
						}
					}
				}
				System.out.println("It is " + localDate.getDayOfWeek() + " number " + currentDayOfWeekInYear + " out of "
						+ countDayOfWeekInYear + " in " + year);
				System.out.println("It is " + localDate.getDayOfWeek() + " number " + currentDayOfWeekInMonth + " out of "
						+ countDayOfWeekInMonth + " in " + localDate.getMonth());
				System.out.println("Year " + localDate.getYear() + " has " + localDate.lengthOfYear() + " days");
				System.out
						.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}

}