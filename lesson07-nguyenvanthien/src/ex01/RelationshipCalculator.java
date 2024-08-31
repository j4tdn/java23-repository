package ex01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RelationshipCalculator {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		// start
		System.out.println("Nhập ngày bắt đầu (dd/MM/yyyy HH:mm:ss): ");
		String start = ip.nextLine();
		LocalDateTime startDate = LocalDateTime.parse(start, formatter);

		// thoi gian end or lay thoi gian hien tai
		System.out.println("Nhập ngày kết thúc (dd/MM/yyyy HH:mm:ss) hoặc nhấn Enter để sử dụng ngày hiện tại:");
		String end = ip.nextLine();
		LocalDateTime endDate;
		if (end.isEmpty()) {
			endDate = LocalDateTime.now();
		} else {
			endDate = LocalDateTime.parse(end, formatter);
		}

		long years = ChronoUnit.YEARS.between(startDate, endDate);
		long months = ChronoUnit.MONTHS.between(startDate, endDate) % 12;
		long days = ChronoUnit.DAYS.between(startDate, endDate) % 30; // moi thang 30 ngay
		long hours = ChronoUnit.HOURS.between(startDate, endDate) % 24;
		long minutes = ChronoUnit.MINUTES.between(startDate, endDate) % 60;
		long seconds = ChronoUnit.SECONDS.between(startDate, endDate) % 60;

		System.out.println("Mối tình đã bắt đầu được");
		System.out.println(years + " Năm, " + months + " Tháng, " + days + " Ngày, ");
		System.out.println(hours + " Giờ, " + minutes + " Phút, " + seconds + " Giây.");
	}
}