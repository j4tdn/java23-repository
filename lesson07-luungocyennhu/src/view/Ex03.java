package view;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import utils.DateUtils;

public class Ex03 {
	
	private static final String[] WEEKDAYS = 
				{ "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư",
				"Thứ Năm", "Thứ Sáu", "Thứ Bảy" };
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

        // 1. Xem thời gian hiện tại(dd/MM/yyyy HH:mm:ss) ở khu vực bất kỳ
        System.out.println("Thời gian hiện tại: " + getCurrentDateTime());

        // 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy)
        System.out.println("Ngày cuối cùng của tháng hiện tại: " + getLastDayOfMonth());

        // 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại
        System.out.println("Ngày đầu tiên và cuối cùng của tuần hiện tại:");
        printFirstAndLastDayOfWeek();

        // 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm
        System.out.println("Ngày hiện tại đang ở tuần thứ: " + getCurrentWeekOfYear());

        // 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy
        System.out.println("Sau 20 ngày nữa sẽ là ngày: " + getDateAfterDays(20));
	}
	
	public static String getCurrentDateTime() {
		Calendar C = Calendar.getInstance();
        return DateUtils.format(C, "dd/MM/yyyy HH:mm:ss");
    }
	
	public static String getLastDayOfMonth() {
		Calendar C = Calendar.getInstance();
        C.set(Calendar.DAY_OF_MONTH, C.getActualMaximum(Calendar.DAY_OF_MONTH));
        return DateUtils.format(C, "dd.MM.yyyy");
    }
	
	public static void printFirstAndLastDayOfWeek() {
		Calendar C = Calendar.getInstance();

        Calendar startOfWeek = DateUtils.clone(C);
        startOfWeek.set(Calendar.DAY_OF_WEEK, C.getFirstDayOfWeek());

        Calendar endOfWeek = DateUtils.clone(C);
        endOfWeek.add(Calendar.DAY_OF_WEEK, 6 - (C.get(Calendar.DAY_OF_WEEK) - C.getFirstDayOfWeek()));

        System.out.println("  -> Ngày đầu tiên: " + DateUtils.format(startOfWeek, "dd.MM.yyyy"));
        System.out.println("  -> Ngày cuối cùng: " + DateUtils.format(endOfWeek, "dd.MM.yyyy"));
    }
	
	public static int getCurrentWeekOfYear() {
		Calendar C = Calendar.getInstance();
        return C.get(Calendar.WEEK_OF_YEAR);
    }
	
	public static String getDateAfterDays(int days) {
		Calendar C = Calendar.getInstance();
        C.add(Calendar.DAY_OF_YEAR, days);
        return DateUtils.format(C, "dd.MM.yyyy") + ", " + WEEKDAYS[C.get(Calendar.DAY_OF_WEEK) - 1];
    }
}
