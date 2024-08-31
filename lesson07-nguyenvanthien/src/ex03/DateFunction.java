package ex03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class DateFunction {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter shortDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();

		// 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.ip
		System.out.println("Xem thời gian hiện tại " + now.format(formatter));

		// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
		LocalDate endOfMonth = now.toLocalDate().with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("In ngày cuối cùng của tháng hiện tại  " + endOfMonth.format(shortDateFormatter));

		// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
		LocalDate startOfWeek = now.toLocalDate().with(TemporalAdjusters.previousOrSame(java.time.DayOfWeek.MONDAY));
		LocalDate endOfWeek = now.toLocalDate().with(TemporalAdjusters.nextOrSame(java.time.DayOfWeek.SUNDAY));
		System.out.println("ngày đầu tiên của tuần hiện tại" + startOfWeek.format(shortDateFormatter));
		System.out.println("cuối cùng của tuần hiện tại " + endOfWeek.format(shortDateFormatter));

		// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
//		int dayOfYear = now.getDayOfYear();
//		System.out.println("Xem ngày hiện tại đang ở tuần thứ " + dayOfYear + " trong năm.");

		// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
		LocalDate in20Days = now.toLocalDate().plusDays(20);
		System.out.println("sau 20 ngày nữa là " + in20Days.format(shortDateFormatter) + ", " + in20Days.getDayOfWeek());

		// 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu
		// ngày.
		System.out.println("Enter ngày tháng năm sinh (dd/MM/yyyy):");
		String birthDateString = ip.nextLine();
		LocalDate birthDate = LocalDate.parse(birthDateString, shortDateFormatter);
		long daysAlive = ChronoUnit.DAYS.between(birthDate, LocalDate.now());
		System.out.println("bạn đã sống được " + daysAlive + " ngày.");
	}
}