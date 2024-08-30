package datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        // Nhập thời gian bắt đầu hẹn hò
        System.out.print("Nhập thời gian bắt đầu hẹn hò (yyyy-MM-dd HH:mm): ");
        String startDateInput = scanner.nextLine();
        LocalDateTime startDate = LocalDateTime.parse(startDateInput, formatter);

        // Tính ngày bắt đầu hẹn hò là ngày thứ mấy
        System.out.println("Ngày bắt đầu hẹn hò là ngày thứ: " + startDate.getDayOfWeek());

        // Nhập thời gian chia tay (hoặc lấy thời gian hiện tại)
        System.out.print("Nếu đã chia tay, nhập thời gian chia tay (yyyy-MM-dd HH:mm) hoặc nhấn Enter để lấy thời gian hiện tại: ");
        String endDateInput = scanner.nextLine();
        LocalDateTime endDate;
        if (endDateInput.isEmpty()) {
            endDate = LocalDateTime.now();
        } else {
            endDate = LocalDateTime.parse(endDateInput, formatter);
        }

        // Tính toán thời gian mối tình đã bắt đầu
        calculateDuration(startDate, endDate);
    }

    public static void calculateDuration(LocalDateTime startDate, LocalDateTime endDate) {
        // Tính toán khoảng thời gian giữa 2 ngày
        Duration duration = Duration.between(startDate, endDate);

        long years = duration.toDays() / 365;
        long months = (duration.toDays() % 365) / 30;
        long days = (duration.toDays() % 365) % 30;
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.println("Mối tình đã bắt đầu được: " + years + " năm, " 
            + months + " tháng, " + days + " ngày, "
            + hours + " giờ, " + minutes + " phút, " + seconds + " giây.");
    }
}
