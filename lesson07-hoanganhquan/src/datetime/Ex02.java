package datetime;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int day, month, year;

	        while (true) {
	            System.out.println("Nhập ngày (1-31): ");
	            day = scanner.nextInt();

	            System.out.println("Nhập tháng (1-12): ");
	            month = scanner.nextInt();

	            System.out.println("Nhập năm: ");
	            year = scanner.nextInt();

	            if (isValidDate(day, month, year)) {
	                break;
	            } else {
	                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập lại.");
	            }
	        }

	        Calendar calendar = Calendar.getInstance();
	        calendar.set(year, month - 1, day); 

	        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	        String[] daysOfWeek = { "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy" };
	        String weekday = daysOfWeek[dayOfWeek - 1];

	        System.out.println(day + "/" + month + "/" + year + " là " + weekday);

	        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
	        int daysInYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
	        int daysLeftInYear = daysInYear - dayOfYear;

	        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
	        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

	        System.out.println("Thông tin thêm:");
	        System.out.println("Đây là ngày thứ " + dayOfYear + " của năm, còn lại " + daysLeftInYear + " ngày.");
	        System.out.println("Đây là " + weekday + " thứ " + weekOfYear + " trong năm.");
	        System.out.println("Đây là " + weekday + " thứ " + weekOfMonth + " trong tháng.");
	        System.out.println("Năm " + year + " có " + daysInYear + " ngày.");
	    }

	    public static boolean isValidDate(int day, int month, int year) {
	        if (month < 1 || month > 12) {
	            return false;
	        }
	        if (day < 1 || day > 31) {
	            return false;
	        }
	        if (month == 2) {
	            if (isLeapYear(year)) {
	                return day <= 29;
	            } else {
	                return day <= 28;
	            }
	        }
	        if (month == 4 || month == 6 || month == 9 || month == 11) {
	            return day <= 30;
	        }
	        return true;
	    }

	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }
}
