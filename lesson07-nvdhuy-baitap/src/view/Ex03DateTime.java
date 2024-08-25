package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Ex03DateTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. Xem ngày tháng hiện tại ở khu vực bất kỳ
		System.out.println("1. Xem thời gian hiện tại ở khu vực bất kỳ.");
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime id1 = LocalTime.now(zoneid1);  
	    LocalTime id2 = LocalTime.now(zoneid2);  
	    System.out.println(id1);  
	    System.out.println(id2);  
	    
	    //2. In ngày cuối cùng của tháng hiện tại 
	    System.out.println("2. In ngày cuối cùng của tháng hiện tại: ");
	    LocalDate currentDate = LocalDate.now();
        
        // Tìm ngày cuối cùng của tháng hiện tại
        LocalDate lastDayOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());
        
        // Định dạng ngày tháng năm
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // In ra ngày cuối cùng của tháng hiện tại
        System.out.println("Ngày cuối cùng của tháng hiện tại là: " + lastDayOfMonth.format(formatter));
        
        //3 . Xem ngày đầu tiên và cuối cùng của tuần hiện tại
     // Lấy ngày hiện tại
        LocalDate today = LocalDate.now();
        
        // Tìm ngày đầu tiên của tuần (Thứ Hai)
        LocalDate firstDayOfWeek = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        
        // Tìm ngày cuối cùng của tuần (Chủ Nhật)
        LocalDate lastDayOfWeek = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        
        // Định dạng ngày tháng năm
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // In ra ngày đầu tiên và cuối cùng của tuần hiện tại
        System.out.println("Ngày đầu tiên của tuần hiện tại: " + firstDayOfWeek.format(formatter1));
        System.out.println("Ngày cuối cùng của tuần hiện tại: " + lastDayOfWeek.format(formatter1));
    }
}


