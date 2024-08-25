package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex02WeekDayCalculator {
	
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate = null;
		boolean validDate =false;
		while(!validDate) {
			System.out.println("Nhập vào ngày, tháng, năm sinh (dd/MM/yyyy): ");
			String dateInput = ip.nextLine();
			try {
				birthDate = dateFormat.parse(dateInput);
				validDate = true;
			} catch (ParseException  e) {
                System.out.println("Dữ liệu nhập không hợp lệ. Vui lòng nhập đúng định dạng (dd/MM/yyyy)");
			}
		}
		
		Calendar birthDateCalendar = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1);
		birthDateCalendar = DateUtils.toCalendar(birthDate);
		int dayOfWeek = birthDateCalendar.get(Calendar.DAY_OF_WEEK);
        String[] daysOfWeek = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
        System.out.println("Ngày bạn sinh là: " + daysOfWeek[dayOfWeek - 1]);
        
        Calendar endOfYearCalendar = DateUtils.cloneAndSet(c, Calendar.DAY_OF_MONTH, 1);
        endOfYearCalendar.set(birthDateCalendar.get(Calendar.YEAR), Calendar.DECEMBER, 31);       
        long diffInMillis = endOfYearCalendar.getTimeInMillis() - birthDateCalendar.getTimeInMillis();

		System.out.println("Ngày bạn sinh là ngày thứ " + birthDateCalendar.get(Calendar.DAY_OF_YEAR) + " của năm. Còn lại số ngày : "+ TimeUnit.MILLISECONDS.toDays(diffInMillis));
		
	}
	
}
