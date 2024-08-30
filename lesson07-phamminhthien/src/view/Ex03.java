package view;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Chọn chức năng:");
		System.out.println("1. Xem thời gian hiện tại ở khu vực bất kỳ.");
		System.out.println("2. In ngày cuối cùng của tháng hiện tại.");
		System.out.println("3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.");
		System.out.println("4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.");
		System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.");
		System.out.println("6. Kiểm tra số ngày đã sống kể từ ngày sinh.");
		System.out.println("7. Dừng chương trình");
		while (true) {
		System.out.print("\n-> Chọn: ");
		int choice = ip.nextInt();
		
		ip.nextLine(); // Đọc ký tự newline sau số
			switch (choice) {
			case 1:
				System.out.print("Nhập tên múi giờ (ví dụ: Asia/Ho_Chi_Minh):");
				String timezoneId = ip.nextLine();
				viewCurrentTime(timezoneId);
				break;
			case 2:
				printlastDayoftheMonth();
				break;
			case 3:
				getFirstAndLastDayOfCurrentWeek();
				break;
			case 4:
				getCurrentWeekNumberInYear();
				break;
			case 5:
				checkDateAfter20Days();
				break;
			case 6:
				System.out.println("Nhập ngày tháng năm sinh (dd/MM/yyyy):");
				String birthDate = ip.nextLine();
				checkDaysLivedSinceBirth(birthDate);
				break;
			case 7:
				System.out.println("Đã dừng chương trình !!!");
				ip.close();
				System.exit(0);
			default:
				System.out.println("Lựa chọn không hợp lệ.");
			}
		}

	}

	// 1. Xem thời gian hiện tại ở khu vực bất kỳ
	public static void viewCurrentTime(String timezoneId) {
		try {
			ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(timezoneId));
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			System.out.println("Thời gian hiện tại ở khu vực " + timezoneId + ": " + zonedDateTime.format(formatter));
		} catch (Exception e) {
			System.out.println("Timezone không hợp lệ. Vui lòng thử lại.");
		}
	}

	// 2. In ngày cuối cùng của tháng hiện tại
	public static void printlastDayoftheMonth() {
		LocalDate now = LocalDate.now();
		LocalDate lastDayOfMonth = now.withDayOfMonth(now.lengthOfMonth());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Ngày cuối cùng của tháng hiện tại: " + lastDayOfMonth.format(formatter));
	}

	// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại
	public static void getFirstAndLastDayOfCurrentWeek() {
		LocalDate now = LocalDate.now();
		Locale locale = Locale.getDefault();
		WeekFields weekFields = WeekFields.of(locale);
		LocalDate firstDayOfWeek = now.with(weekFields.dayOfWeek(), 1);
		LocalDate lastDayOfWeek = now.with(weekFields.dayOfWeek(), 7);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Ngày đầu tiên của tuần hiện tại: " + firstDayOfWeek.format(formatter));
		System.out.println("Ngày cuối cùng của tuần hiện tại: " + lastDayOfWeek.format(formatter));
	}

	// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm
	public static void getCurrentWeekNumberInYear() {
		LocalDate now = LocalDate.now();
		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		int weekNumber = now.get(weekFields.weekOfYear());
		System.out.println("Ngày hiện tại đang ở tuần thứ " + weekNumber + " trong năm.");
	}

	// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy
	public static void checkDateAfter20Days() {
		LocalDate now = LocalDate.now();
		LocalDate futureDate = now.plusDays(20);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE", new Locale("vi", "VN"));
		System.out.println("Sau 20 ngày nữa là ngày: " + futureDate.format(formatter));
	}

	// 6. Kiểm tra số ngày đã sống kể từ ngày sinh
	public static void checkDaysLivedSinceBirth(String birthDateInput) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate birthDate = LocalDate.parse(birthDateInput, formatter);
			LocalDate now = LocalDate.now();
			long daysLived = Duration.between(birthDate.atStartOfDay(), now.atStartOfDay()).toDays();
			System.out.println("Bạn đã sống được " + daysLived + " ngày.");
		} catch (Exception e) {
			System.out.println("Ngày tháng năm sinh không hợp lệ. Vui lòng nhập theo định dạng dd/MM/yyyy.");
		}
	}
}
