package datetime;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày bắt đầu hẹn hò (định dạng yyyy-MM-dd): ");
        String startDateInput = scanner.nextLine();
        String[] startDateParts = startDateInput.split("-");
        int startYear = Integer.parseInt(startDateParts[0]);
        int startMonth = Integer.parseInt(startDateParts[1]) - 1; 
        int startDay = Integer.parseInt(startDateParts[2]);

        Calendar startDate = Calendar.getInstance();
        startDate.set(startYear, startMonth, startDay);

        System.out.println("Nhập ngày chia tay (định dạng yyyy-MM-dd) hoặc bỏ trống để lấy thời gian hiện tại: ");
        String endDateInput = scanner.nextLine();
        Calendar endDate = Calendar.getInstance();

        if (!endDateInput.isEmpty()) {
            String[] endDateParts = endDateInput.split("-");
            int endYear = Integer.parseInt(endDateParts[0]);
            int endMonth = Integer.parseInt(endDateParts[1]) - 1;
            int endDay = Integer.parseInt(endDateParts[2]);
            endDate.set(endYear, endMonth, endDay);
        }

        int startDayOfWeek = startDate.get(Calendar.DAY_OF_WEEK);
        String[] daysOfWeek = { "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy" };
        System.out.println("Ngày bắt đầu hẹn hò là: " + daysOfWeek[startDayOfWeek - 1]);

        long diffInMillis = endDate.getTimeInMillis() - startDate.getTimeInMillis();
        long days = TimeUnit.MILLISECONDS.toDays(diffInMillis);
        long hours = TimeUnit.MILLISECONDS.toHours(diffInMillis) % 24;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(diffInMillis) % 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(diffInMillis) % 60;

        int years = endDate.get(Calendar.YEAR) - startDate.get(Calendar.YEAR);
        int months = endDate.get(Calendar.MONTH) - startDate.get(Calendar.MONTH);
        if (months < 0) {
            years--;
            months += 12;
        }

        System.out.printf("Mối tình đã bắt đầu được: %d năm, %d tháng, %d ngày, %d giờ, %d phút, %d giây.%n",
                years, months, days, hours, minutes, seconds);
    }
}

