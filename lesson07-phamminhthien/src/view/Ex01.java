package view;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01 {
	
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Nhập ngày bắt đầu (dd.MM.yyyy): ");
        String startDateInput = ip.nextLine();

        LocalDate startDate;
        LocalDate endDate;
        while (true) {
            try {
                startDate = LocalDate.parse(startDateInput, formatter);
                break; // Thoát khỏi vòng lặp khi ngày bắt đầu hợp lệ
            } catch (Exception e) {
                System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại (dd.MM.yyyy).");
                System.out.print("Nhập ngày bắt đầu (dd.MM.yyyy): ");
                startDateInput = ip.nextLine();
            }
        }

        System.out.print("Bạn đã chia tay chưa? (y/n): ");
        String breakupResponse = ip.nextLine();

        if (breakupResponse.equalsIgnoreCase("y")) {
            System.out.print("Nhập ngày chia tay (dd.MM.yyyy): ");
            String endDateInput = ip.nextLine();
            while (true) {
                try {
                    endDate = LocalDate.parse(endDateInput, formatter);
                    if (endDate.isBefore(startDate)) {
                        System.out.println("Ngày chia tay không thể nhỏ hơn ngày bắt đầu!");
                        System.out.print("Nhập ngày chia tay (dd.MM.yyyy): ");
                        endDateInput = ip.nextLine();
                    } else {
                        break; // Thoát khỏi vòng lặp khi ngày chia tay hợp lệ
                    }
                } catch (Exception e) {
                    System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại (dd.MM.yyyy).");
                    System.out.print("Nhập ngày chia tay (dd.MM.yyyy): ");
                    endDateInput = ip.nextLine();
                }
            }
        } else {
            endDate = LocalDate.now();
        }

        String result = calculateRelationshipDuration(startDate, endDate);
        System.out.println("====================================================");
        System.out.println(result);
        System.out.println("====================================================");

    }

    /**
     * Hàm tính toán thời gian đã trôi qua giữa hai ngày.
     * 
     * @param startDate Ngày bắt đầu
     * @param endDate   Ngày kết thúc
     * @return Chuỗi kết quả mô tả khoảng thời gian
     */
    public static String calculateRelationshipDuration(LocalDate startDate, LocalDate endDate) {
        // Tính ngày trong tuần của ngày bắt đầu
        DayOfWeek startDayOfWeek = startDate.getDayOfWeek();
        String dayName = startDayOfWeek.toString();

        // Tính thời gian đã trôi qua
        Period period = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long hours = daysBetween * 24;
        long minutes = hours * 60;
        long seconds = minutes * 60;

        // chuỗi kết quả
        String result = "Ngày bắt đầu hẹn hò là " + dayName + ".\n" +
                "Mối tình đã kéo dài: " + period.getYears() + " năm, "
                + period.getMonths() + " tháng, "
                + period.getDays() + " ngày.\n" +
                "Tổng cộng: " + hours + " giờ, " + minutes + " phút, " + seconds + " giây.";
        return result;
    }
}
