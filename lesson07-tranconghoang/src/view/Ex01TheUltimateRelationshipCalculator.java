package view;

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
		String datingTime = ip.nextLine();
		
		System.out.println("Nhập thời gian chia tay (nếu chưa chia tay nhập thời gian hiện tại): ");
		String breakUpTime = ip.nextLine();
		
		int dowAsVN = toCalendar(datingTime, DEFAULT_DATE_TIME_PATTERN).get(Calendar.DAY_OF_WEEK);
		
		System.out.println("--> Ngày bắt đầu hẹn hò là: " + weekdays[dowAsVN - 1]);
		
		// tinh khoang thoi gian hen ho bang mili giay
		long distanceInMillis = toCalendar(breakUpTime, DEFAULT_DATE_TIME_PATTERN).getTimeInMillis() 
				- toCalendar(datingTime, DEFAULT_DATE_TIME_PATTERN).getTimeInMillis();
		
//		long second = distanceInMillis / 1000;
//		long minute = second / 60;
//		long hour = minute / 60;
//		long day = hour / 24;
		
	}
}