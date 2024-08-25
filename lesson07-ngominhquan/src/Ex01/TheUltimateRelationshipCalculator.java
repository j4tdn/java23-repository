package Ex01;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheUltimateRelationshipCalculator {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.print("Nhap thoi gian bat dau hen ho (dd-MM-yyyy HH:mm:ss): ");
        String startDateTimeStr = scanner.nextLine();
        LocalDateTime startDateTime = LocalDateTime.parse(startDateTimeStr, formatter);

        System.out.print("Neu da chia tay, nhap ngay chia tay (dd-MM-yyyy HH:mm:ss), neu khong thi Enter: ");
        String endDateTimeStr = scanner.nextLine();
        LocalDateTime endDateTime = endDateTimeStr.isEmpty() ? LocalDateTime.now() : LocalDateTime.parse(endDateTimeStr, formatter);

        String dayOfWeek = startDateTime.getDayOfWeek().toString();

        Duration duration = Duration.between(startDateTime, endDateTime);

        long totalSeconds = duration.getSeconds();
        long years = totalSeconds / (365 * 24 * 60 * 60);
        long remainingSeconds = totalSeconds % (365 * 24 * 60 * 60);
        long months = remainingSeconds / (30 * 24 * 60 * 60);
        remainingSeconds %= (30 * 24 * 60 * 60);
        long days = remainingSeconds / (24 * 60 * 60);
        remainingSeconds %= (24 * 60 * 60);
        long hours = remainingSeconds / 3600;
        long minutes = (remainingSeconds % 3600) / 60;
        long seconds = remainingSeconds % 60;

        System.out.println("Ngay bat dau hen ho la ngay: " + dayOfWeek);
        System.out.printf("Moi tinh da bat dau duoc: %d nam, %d thang, %d ngay, %d gio, %d phut, %d giay%n",
                years, months, days, hours, minutes, seconds);

        scanner.close();
    }

}
