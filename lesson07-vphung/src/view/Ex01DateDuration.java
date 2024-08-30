package view;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01DateDuration {

	private static Scanner scanner = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.print("Nhập thời gian bắt đầu hẹn hò (yyyy-MM-dd HH:mm:ss): ");
        String startDateInput = scanner.nextLine();
        LocalDateTime startDate = LocalDateTime.parse(startDateInput, df);

        System.out.println("--> Ngày bắt đầu hẹn hò là ngày thứ: " + startDate.getDayOfWeek());

        System.out.print("Nếu đã chia tay, nhập thời gian chia tay (yyyy-MM-dd HH:mm:ss)\n"
        		+ "(hoặc nhấn Enter để lấy thời gian hiện tại): ");
        String endDateInput = scanner.nextLine();
        
        if (startDate.isAfter(LocalDateTime.parse(endDateInput, df))) {
			throw new IllegalArgumentException("StartTime should not greater than EndTime !!!");
		}
        
        LocalDateTime endDate;
        
		if (endDateInput.isEmpty()) {
			endDate = LocalDateTime.now();
		} else {
			endDate = LocalDateTime.parse(endDateInput, df);
		}

        dateDuration(startDate, endDate);
    }

    private static void dateDuration(LocalDateTime startDate, LocalDateTime endDate) {
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
