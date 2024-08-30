package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import static utils.DateUtils.*;

public class Ex01TheUltimateRelationshipCalculator {

	private static Scanner ip = new Scanner(System.in);
	private static String[] weekdays = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm"
			, "Thứ Sáu", "Thứ Bảy"};
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar c = Calendar.getInstance();
		System.out.println("Nhập thời gian bắt đầu hẹn hò:");
		String datingTime1 = ip.nextLine();
		
		System.out.println("Nhập thời gian chia tay (nếu chưa chia tay nhập thời gian hiện tại): ");
		String breakUpTime1 = ip.nextLine();
		
		int dowAsVN = toCalendar(datingTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.DAY_OF_WEEK);
		
		System.out.println("--> Ngày bắt đầu hẹn hò là: " + weekdays[dowAsVN - 1]);
		
		
		// Calendar -> LocalDateTime
		LocalDateTime datingTime2 = LocalDateTime.of(toCalendar(datingTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.YEAR), 
													 toCalendar(datingTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.MONTH) + 1,
													 toCalendar(datingTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.DAY_OF_MONTH),
													 toCalendar(datingTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.HOUR_OF_DAY),
													 toCalendar(datingTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.MINUTE),
													 toCalendar(datingTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.SECOND));
		
		LocalDateTime breakUpTime2 = LocalDateTime.of(toCalendar(breakUpTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.YEAR), 
				 									  toCalendar(breakUpTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.MONTH) + 1,
				 									  toCalendar(breakUpTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.DAY_OF_MONTH),
				 									  toCalendar(breakUpTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.HOUR_OF_DAY),
				 									  toCalendar(breakUpTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.MINUTE),
				 									  toCalendar(breakUpTime1, DEFAULT_DATE_TIME_PATTERN).get(Calendar.SECOND));
		
		LocalDate datingTimeToDate = datingTime2.toLocalDate();
		LocalTime datingTimeToTime = datingTime2.toLocalTime();
		
		LocalDate breakUpTimetoDate = breakUpTime2.toLocalDate();
		LocalTime breakUpTimeToTime = breakUpTime2.toLocalTime();
		
		Period period = Period.between(datingTimeToDate, breakUpTimetoDate);
		Duration duration = Duration.between(datingTimeToTime, breakUpTimeToTime);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("Mối tình đã bắt đầu được: " + 
			    opt(period.getYears(), "year") +
			    opt(period.getMonths(), "month") +
			    opt(period.getDays(), "day") + 
			    opt(duration.toHoursPart(), "hour") +
				opt(duration.toMinutesPart(), "minute") +
				opt(duration.toSecondsPart(), "second")
		);
	}
}