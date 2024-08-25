package view;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            // Nhập ngày bắt đầu hẹn hò
            System.out.print("Nhập ngày bắt đầu hẹn hò (yyyy-MM-dd HH:mm:ss): ");
            String startDateInput = scanner.nextLine();
            Date startDate = sdf.parse(startDateInput);

            // Nhập ngày chia tay hoặc lấy thời gian hiện tại
            System.out.print("Nhập ngày chia tay (hoặc nhấn Enter để lấy thời gian hiện tại): ");
            String endDateInput = scanner.nextLine();
            Date endDate;

            if (endDateInput.isEmpty()) {
                endDate = new Date();
            } else {
                endDate = sdf.parse(endDateInput);
            }

            // Sử dụng Calendar để tính toán
            Calendar startCal = Calendar.getInstance();
            startCal.setTime(startDate);

            Calendar endCal = Calendar.getInstance();
            endCal.setTime(endDate);

            // Xác định ngày bắt đầu hẹn hò là thứ mấy
            String[] daysOfWeek = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
            int dayOfWeek = startCal.get(Calendar.DAY_OF_WEEK);
            System.out.println("Ngày bắt đầu hẹn hò là: " + daysOfWeek[dayOfWeek - 1]);

            // Tính khoảng thời gian giữa ngày bắt đầu và ngày chia tay hoặc hiện tại
            int years = endCal.get(Calendar.YEAR) - startCal.get(Calendar.YEAR);
            int months = endCal.get(Calendar.MONTH) - startCal.get(Calendar.MONTH);
            int days = endCal.get(Calendar.DAY_OF_MONTH) - startCal.get(Calendar.DAY_OF_MONTH);
            int hours = endCal.get(Calendar.HOUR_OF_DAY) - startCal.get(Calendar.HOUR_OF_DAY);
            int minutes = endCal.get(Calendar.MINUTE) - startCal.get(Calendar.MINUTE);
            int seconds = endCal.get(Calendar.SECOND) - startCal.get(Calendar.SECOND);

            // Điều chỉnh nếu cần thiết
            if (seconds < 0) {
                seconds += 60;
                minutes -= 1;
            }
            if (minutes < 0) {
                minutes += 60;
                hours -= 1;
            }
            if (hours < 0) {
                hours += 24;
                days -= 1;
            }
            if (days < 0) {
                days += startCal.getActualMaximum(Calendar.DAY_OF_MONTH);
                months -= 1;
            }
            if (months < 0) {
                months += 12;
                years -= 1;
            }

            // Định dạng số
            DecimalFormat df = new DecimalFormat("00");

            System.out.println("Mối tình đã kéo dài: " + years + " năm, " +
                    months + " tháng, " + days + " ngày, " +
                    df.format(hours) + " giờ, " + df.format(minutes) + " phút, " +
                    df.format(seconds) + " giây.");

        } catch (Exception e) {
            System.out.println("Định dạng ngày tháng không đúng!");
        } finally {
            scanner.close();
        }
    }
}
