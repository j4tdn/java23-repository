package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Ex03DateTime {

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {

		// 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
		LocalDateTime locale = LocalDateTime.now(ZoneId.of("Zulu"));
		
		printDateLocale(locale);
		
		// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
		printTheLastDayOfThisMonth(LocalDateTime.now());
		
		// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
		Calendar c = Calendar.getInstance();
		printTheFristAndLastDayOfWeek(c);
		
		// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		getWeekinWeeksYear(c);
		
		// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
		printAfter20Days(c);
		
		// 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
		getLive(LocalDate.of(2001,02,02));
	}

	private static void printDateLocale(LocalDateTime locale) {
		String dateTime = dtf.format(locale);
		System.out.println("Thời gian hiện tại của: " + locale + " " + dateTime);
	}

	private static void printTheLastDayOfThisMonth(LocalDateTime localDateTime) {
		LocalDate localdate = localDateTime.toLocalDate();
		System.out.println("Ngày cuối cùng của tháng hiện tại " + localdate.lengthOfMonth() + "/" + localdate.getMonthValue() + "/" +localdate.getYear());
	}

	private static void printTheFristAndLastDayOfWeek(Calendar c) {
		int firstDayOfWeek = c.getFirstDayOfWeek();
		int currenDayOfWeen = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DAY_OF_MONTH, firstDayOfWeek - currenDayOfWeen);
		String startDayOfWeek = df.format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 7);
		String endDayOfWeek = df.format(c.getTime());
		System.out.println("Ngày đầu tiên trong tuần hiện tại: " + startDayOfWeek);
		System.out.println("Ngày cuối cùng trong tuần hiện tại: " + endDayOfWeek);
	} 

	private static void getWeekinWeeksYear(Calendar c) {
		System.out.println("Tuần hiện tại là tuần thứ: " + c.get(Calendar.WEEK_OF_YEAR) + " trong năm");
	} 

	private static void printAfter20Days(Calendar c) {
		String currentDay = df.format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 20);
		String _20DaysAfter = df.format(c.getTime());

		System.out.println("Ngày hiện tại: " + currentDay);
		System.out.println("Sau 20 ngày:   " + _20DaysAfter);
	} 

	private static void getLive(LocalDate localDate) {
		LocalDateTime current = LocalDateTime.now();
		long daysLived = java.time.temporal.ChronoUnit.DAYS.between(localDate, current);
		System.out.println("Bạn đã sống được: " + daysLived + " days ");
	}
}