package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex03DateTimeApp {

	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 2. in ngày cuối cùng của tháng hiện tại
		printLastDayOfCurrentMonth();
		// 3. xem ngày đầu tiên và cuối cùng của tuần hiện tại
		printFirstAndLastDayOfCurrentWeek();
		// 4. tuần thứ ? trong năm
		printCurrentWeekOfYear();
		// 5. sau 20 ngày là tuần thứ bao nhiêu
		printDateAfterNDays(20);
		// 6. sống được bao nhiêu ngày
		System.out.print("Nhập ngày tháng năm sinh của bạn (dd/MM/yyyy): ");
        String birthDateStr = ip.nextLine();
		try {
			printDaysLived(birthDateStr);
		} catch (ParseException e) {
			System.out.println("Parse exception: " + e.getMessage());
		}
	}
	
    public static void printLastDayOfCurrentMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngày cuối cùng của tháng hiện tại: " + dateFormat.format(calendar.getTime()));
    }
    
    public static void printFirstAndLastDayOfCurrentWeek() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
        String firstDay = dateFormat.format(calendar.getTime());

        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek() + 6);
        String lastDay = dateFormat.format(calendar.getTime());

        System.out.println("Ngày đầu tiên của tuần: " + firstDay);
        System.out.println("Ngày cuối cùng của tuần: " + lastDay);
    }
    
    public static void printCurrentWeekOfYear() {
        Calendar calendar = Calendar.getInstance();
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Ngày hiện tại đang ở tuần thứ " + weekOfYear + " trong năm.");
    }
    
    public static void printDateAfterNDays(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, days);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println("Sau " + days + " ngày nữa là: " + dateFormat.format(calendar.getTime()) + 
                           ", thứ " + dayOfWeekFormat.format(calendar.getTime()));
    }
    
    public static void printDaysLived(String birthDateStr) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = dateFormat.parse(birthDateStr);

        Date currentDate = new Date();
        long diffInMillis = currentDate.getTime() - birthDate.getTime();
        long daysLived = diffInMillis / (1000 * 60 * 60 * 24);

        System.out.println("Bạn đã sống được " + daysLived + " ngày.");
    }

}
