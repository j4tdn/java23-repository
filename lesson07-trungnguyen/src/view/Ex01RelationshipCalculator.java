package view;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex01RelationshipCalculator {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Calendar loveCalendar = DateUtils.cloneAndSet(c, Calendar.DATE, 1);
		Calendar breakUpCalendar = DateUtils.cloneAndSet(loveCalendar, Calendar.DATE, 1);

		System.out.println("Nhập vào thời gian bắt đầu hẹn hò (dd/MM/yyyy HH:mm:ss): ");
		String loveDate = ip.nextLine();
		
		System.out.print("Đã chia tay chưa? (y/n): ");
        String response = ip.nextLine();
        String breakUpDate = "";
        if (response.equals("y")) {
            System.out.print("Nhập ngày chia tay (dd/MM/yyyy HH:mm:ss): ");
            breakUpDate = ip.nextLine();
    		breakUpCalendar = DateUtils.toCalendar(breakUpDate, DateUtils.DEFAULT_DATE_TIME_PATTERN);

        } else {
        	breakUpCalendar = DateUtils.toCalendar(new Date());
        }
        
		 
		loveCalendar = DateUtils.toCalendar(loveDate, DateUtils.DEFAULT_DATE_TIME_PATTERN);
		int dayOfWeek = loveCalendar.get(Calendar.DAY_OF_WEEK);
        String[] daysOfWeek = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
        System.out.println("Ngày bắt đầu hẹn hò là: " + daysOfWeek[dayOfWeek - 1]);

        long diffInMillis = breakUpCalendar.getTimeInMillis() - loveCalendar.getTimeInMillis();
        
        long years = TimeUnit.MILLISECONDS.toDays(diffInMillis) / 365;
        long months = (TimeUnit.MILLISECONDS.toDays(diffInMillis) % 365) / 30;
        long day = (TimeUnit.MILLISECONDS.toDays(diffInMillis) % 365) % 30;
        long hours = TimeUnit.MILLISECONDS.toHours(diffInMillis) % 24;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(diffInMillis) % 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(diffInMillis) % 60;	
        System.out.println("Mối tình đã kéo dài: " + years + " năm, " + months + " tháng, " + day + " ngày, " +
                hours + " giờ, " + minutes + " phút, " + seconds + " giây.");
        
        System.out.println("--> "+ DateUtils.format(loveCalendar, "dd/MM/yyyy hh:mm:ss"));
		System.out.println("--> "+ DateUtils.format(breakUpCalendar, "dd/MM/yyyy hh:mm:ss"));


	}
}
