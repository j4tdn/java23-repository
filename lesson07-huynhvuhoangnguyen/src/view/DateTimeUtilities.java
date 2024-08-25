package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class DateTimeUtilities {

	public static void main(String[] args) {

		viewCurrentTimeInZone("Asia/Ho_Chi_Minh");
		printLastDayOfCurrentMonth();
		firstAndLastDayOfCurrentWeek();
		currentWeekOfYear();
		dateAfterTwentyDays();
		calculateDaysLives("03/02/1995");

	}

	// 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
	public static void viewCurrentTimeInZone(String zoneId) {

		ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(zoneId));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Current time in " + zoneId + ": " + currentTime.format(formatter));

	}

	// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
	public static void printLastDayOfCurrentMonth() {
		LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("The last day of this month is: " + lastDay.format(formatter));
	}

	// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
	public static void firstAndLastDayOfCurrentWeek() {
		LocalDate today = LocalDate.now();
		LocalDate firstDayOfWeek = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		LocalDate lastDayOfWeek = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("First day of this week: " + firstDayOfWeek.format(formatter));
		System.out.println("Last day of this week : " + lastDayOfWeek.format(formatter));
	}

	// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
	public static void currentWeekOfYear() {
		LocalDate today = LocalDate.now();
		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		int weekNunber = today.get(weekFields.weekOfWeekBasedYear());
		System.out.println("Today is in week number " + weekNunber + " of this year.");
	}

	// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
	public static void dateAfterTwentyDays() {
		LocalDate today = LocalDate.now();
		LocalDate futureDay = today.plusDays(20);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DayOfWeek dayOfWeek = futureDay.getDayOfWeek();
		System.out.println(
				"The date 20 days from now will be: " + futureDay.format(formatter) + " and it will be " + dayOfWeek);
	}

	// 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu
	// ngày.
	public static void calculateDaysLives(String birthDayString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthDay = LocalDate.parse(birthDayString, formatter);
		LocalDate today = LocalDate.now();
		long daysLived = ChronoUnit.DAYS.between(birthDay, today);
		System.out.println("You have lived for " + daysLived + " days.");
	}

}