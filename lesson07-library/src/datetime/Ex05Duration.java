package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05Duration {
	// Bài toán tìm hiệu giữa 2 mốc time
	// VD1: Kiểm tra hàm chạy trong blau
	// VD2: A,B, hiệu mốc 2 thời gian.

	// duration: ms --> day, hour, minute, second ==> hạn chế
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static void main(String[] args) {
		Calendar start = DateUtils.toCalendar("20/06/2024 10:00:00", PATTERN);
		Calendar end = Calendar.getInstance();

		if (start.after(end)) {
			throw new IllegalArgumentException("StartTime should not greater than EndTime");
		}

		long startInMs = start.getTimeInMillis(); // số ms từ start đến epoch (1970)
		long endInMs = end.getTimeInMillis();

		long duration = endInMs - startInMs;

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		long remaining = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remaining);

		remaining = remaining - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remaining);

		remaining = remaining - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remaining);

		System.out.println(" " + days + "days " + hours + "h " + minutes + "m " + seconds + "s");
	}
}
