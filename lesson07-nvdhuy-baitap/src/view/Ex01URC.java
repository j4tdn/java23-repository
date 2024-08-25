package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01URC {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Định dạng ngày tháng
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        // Nhập ngày bắt đầu hẹn hò
	        System.out.print("Nhập ngày bắt đầu hẹn hò : ");
	        String startDateInput = scanner.nextLine();
	        LocalDate startDate = LocalDate.parse(startDateInput, dateFormatter);

	        // Nhập ngày chia tay hoặc sử dụng ngày hiện tại
	        System.out.print("Nhập ngày chia tay : ");
	        String endDateInput = scanner.nextLine();
	        LocalDate endDate;

	        if (endDateInput.isEmpty()) {
	            endDate = LocalDate.now(); // Sử dụng ngày hiện tại nếu chưa chia tay
	        } else {
	            endDate = LocalDate.parse(endDateInput, dateFormatter); // Sử dụng ngày chia tay nếu đã nhập
	        }

	        // Tính toán ngày bắt đầu là thứ mấy
	        DayOfWeek dayOfWeek = startDate.getDayOfWeek();
	        System.out.println("Ngày bắt đầu hẹn hò là: " + dayOfWeek);

	        // Tính toán khoảng thời gian giữa hai ngày
	        long years = ChronoUnit.YEARS.between(startDate, endDate);
	        long months = ChronoUnit.MONTHS.between(startDate.plusYears(years), endDate);
	        long days = ChronoUnit.DAYS.between(startDate.plusYears(years).plusMonths(months), endDate);
	        long hours = ChronoUnit.HOURS.between(startDate.atStartOfDay().plusYears(years).plusMonths(months).plusDays(days), endDate.atStartOfDay());
	        long minutes = ChronoUnit.MINUTES.between(startDate.atStartOfDay().plusYears(years).plusMonths(months).plusDays(days).plusHours(hours), endDate.atStartOfDay());
	        long seconds = ChronoUnit.SECONDS.between(startDate.atStartOfDay().plusYears(years).plusMonths(months).plusDays(days).plusHours(hours).plusMinutes(minutes), endDate.atStartOfDay());

	        // In ra kết quả
	        System.out.println("Mối tình đã bắt đầu được: " 
	                + years + " năm, " 
	                + months + " tháng, " 
	                + days + " ngày, " 
	                + hours + " giờ, " 
	                + minutes + " phút, " 
	                + seconds + " giây.");
	        
	        scanner.close();
	    }
	
	}
