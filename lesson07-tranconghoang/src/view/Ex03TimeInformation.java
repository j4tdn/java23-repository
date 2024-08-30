package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import utils.DateUtils;
import static utils.DateUtils.*;

public class Ex03TimeInformation {

	private static Scanner ip = new Scanner(System.in);
	private static String[] weekdays = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm"
			, "Thứ Sáu", "Thứ Bảy"};
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar c = Calendar.getInstance();
		System.out.println("1. Hiển thị thời gian hiện tại (VN):\n--> " + format(c, "dd/MM/yyyy HH:mm:ss"));
		
		int lastDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, lastDayOfMonth);
		System.out.println("2. Ngày cuối cùng của tháng hiện tại: " + format(c, "dd/MM/yyyy"));
		
		int firstDayOfWeek = c.getFirstDayOfWeek();
		Calendar cStartDayOfWeek = DateUtils.cloneAndSet(c, Calendar.DAY_OF_WEEK, firstDayOfWeek); 
		Calendar cEndDayOfWeek = DateUtils.cloneAndSet(c, Calendar.DAY_OF_WEEK, firstDayOfWeek + 6);
		System.out.println("3A. Xem ngày đầu tiên của tuần hiện tại: " + format(cStartDayOfWeek, "dd/MM/yyyy"));
		System.out.println("3A. Xem ngày cuối cùng của tuần hiện tại: " + format(cEndDayOfWeek, "dd/MM/yyyy"));
		
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("4. Xem ngày hiện tại ở tuần thứ mấy trong năm:\n--> Tuần thứ " + weekOfYear);
		
		int dowASVN = c.get(Calendar.DAY_OF_WEEK);
		c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy:\n--> "
							+ weekdays[dowASVN - 1] + " " + format(c, "dd/MM/yyyy"));
		
		System.out.println("6. Nhập ngày tháng năm sinh của bạn:");
		String dateOfBirth1 = ip.nextLine();
		
		LocalDateTime dateOfBirth2 = LocalDateTime.of(toCalendar(dateOfBirth1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.YEAR), 
				 toCalendar(dateOfBirth1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.MONTH) + 1,
				 toCalendar(dateOfBirth1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.DAY_OF_MONTH),
				 toCalendar(dateOfBirth1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.MINUTE),
				 toCalendar(dateOfBirth1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.SECOND));
		
		LocalDateTime ldatetime = LocalDateTime.now();
		
		LocalDate ldate1 = ldatetime.toLocalDate();
		LocalTime ltime1 = ldatetime.toLocalTime();
		
		LocalDate dateOfBirthToDate = dateOfBirth2.toLocalDate();
		LocalTime dateOfBirthToTime = dateOfBirth2.toLocalTime();
		
		Period period = Period.between(dateOfBirthToDate, ldate1);
		Duration duration = Duration.between(dateOfBirthToTime, ltime1);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("--> Bạn đã sống đươc: " + 
			    opt(period.getYears(), "year") +
			    opt(period.getMonths(), "month") +
			    opt(period.getDays(), "day") + 
			    opt(duration.toHoursPart(), "hour") +
				opt(duration.toMinutesPart(), "minute") +
				opt(duration.toSecondsPart(), "second")
		);
		
	}
}