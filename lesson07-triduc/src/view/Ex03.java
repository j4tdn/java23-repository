package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import utils.DateUtils;

public class Ex03 {
	/*
	 * 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
	 */
	
	public static void main(String[] args) {
		Locale locale = new Locale("vi", "VN");

		Calendar c = Calendar.getInstance(locale);
		
		System.out.println("1. Current datetime (VN): " + DateUtils.format(c, "dd/MM/yyyy HH:mm:ss"));
	
		System.out.println("2. Last day of month: " + getLastDateOfMonth(c));

		System.out.println("3. First day of week: " + getFirstDayOfWeek(c));

		System.out.println("3B. Last day of week: " + getLastDayOfWeek(c));

		System.out.println("4. Current week of year: " + c.get(Calendar.WEEK_OF_YEAR));

		System.out.println("5. Day after 20 days: " + getDateAfter20Days(c));

		System.out.println("Enter your birthday (dd/MM/yyyy): ");

		Scanner sc = new Scanner(System.in);

		String dob = sc.nextLine();
		try {
			printDaysInLife(dob);
		} catch (ParseException e) {
			System.out.println("Parse exception: " + e.getMessage());
		}
	}

	private static String getLastDateOfMonth(Calendar c) {
		Calendar clone = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return (DateUtils.format(clone, "dd/MM/yyyy"));
	}

	private static String getFirstDayOfWeek(Calendar c) {
		Calendar clone = DateUtils.cloneAndSet(c, Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
		return (DateUtils.format(clone, "dd/MM/yyyy"));
	}

	private static String getLastDayOfWeek(Calendar c) {
		Calendar clone = DateUtils.toCalendar(getFirstDayOfWeek(c), "dd/MM/yyyy");
		clone.add(Calendar.DAY_OF_WEEK, 7);
		return (DateUtils.format(clone, "dd/MM/yyyy"));
	}

	private static String getDateAfter20Days(Calendar c) {
		Calendar clone = DateUtils.clone(c);
		clone.add(Calendar.DATE, 20);
		return DateUtils.format(clone, "dd/MM/yyyy");
	}

	private static void printDaysInLife(String doB) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate = df.parse(doB);

		Date currentDate = new Date();

		long daysInLife = (currentDate.getTime() - birthDate.getTime()) / 1000 / 60 / 60 / 24;

		System.out.println("You have lived in " + daysInLife + " days");
	}
}
