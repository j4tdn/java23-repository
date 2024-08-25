package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03DateTimeOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1. Xem thời gian hiện tại ở khu vực bất kỳ
		System.out.print("Nhập mã khu vực (ví dụ: Asia/Ho_Chi_Minh): ");
		String timeZoneId = scanner.nextLine();
		viewCurrentTimeInTimeZone(timeZoneId);

		// 2. In ngày cuối cùng của tháng hiện tại
		printLastDayOfCurrentMonth();

		// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại
		printFirstAndLastDayOfCurrentWeek();

		// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm
		printCurrentWeekOfYear();

		// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy
		printDayAfter20Days();

		// 6. Kiểm tra bạn đã sống được bao nhiêu ngày
		System.out.print("Nhập ngày tháng năm sinh của bạn (dd/MM/yyyy): ");
		String birthDateInput = scanner.nextLine();
		calculateDaysLived(birthDateInput);

		scanner.close();
	}

	// 1. Xem thời gian hiện tại ở khu vực bất kỳ
	public static void viewCurrentTimeInTimeZone(String timeZoneId) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone(timeZoneId));
		String currentTime = sdf.format(new Date());
		System.out.println("Thời gian hiện tại ở " + timeZoneId + ": " + currentTime);
	}

	// 2. In ngày cuối cùng của tháng hiện tại
	public static void printLastDayOfCurrentMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Ngày cuối cùng của tháng hiện tại: " + sdf.format(calendar.getTime()));
	}

	// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại
	public static void printFirstAndLastDayOfCurrentWeek() {
		Calendar calendar = Calendar.getInstance();

		// Ngày đầu tiên của tuần (Thứ Hai)
		calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String firstDayOfWeek = sdf.format(calendar.getTime());

		// Ngày cuối cùng của tuần (Chủ Nhật)
		calendar.add(Calendar.DAY_OF_WEEK, 6);
		String lastDayOfWeek = sdf.format(calendar.getTime());

		System.out.println("Ngày đầu tiên của tuần: " + firstDayOfWeek);
		System.out.println("Ngày cuối cùng của tuần: " + lastDayOfWeek);
	}

	// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm
	public static void printCurrentWeekOfYear() {
		Calendar calendar = Calendar.getInstance();
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Ngày hiện tại đang ở tuần thứ: " + weekOfYear + " trong năm.");
	}

	// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy
	public static void printDayAfter20Days() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 20);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy EEEE");
		System.out.println("Sau 20 ngày nữa là: " + sdf.format(calendar.getTime()));
	}

	// 6. Kiểm tra bạn đã sống được bao nhiêu ngày
	public static void calculateDaysLived(String birthDateInput) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date birthDate = sdf.parse(birthDateInput);
			Calendar birthCalendar = Calendar.getInstance();
			birthCalendar.setTime(birthDate);

			Calendar today = Calendar.getInstance();
			long daysLived = (today.getTimeInMillis() - birthCalendar.getTimeInMillis()) / (1000 * 60 * 60 * 24);

			System.out.println("Bạn đã sống được: " + daysLived + " ngày.");
		} catch (Exception e) {
			System.out.println("Định dạng ngày tháng không hợp lệ!");
		}
	}

}
