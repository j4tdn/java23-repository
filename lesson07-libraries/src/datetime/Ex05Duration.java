package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05Duration {

	// Bài toán tìm hiệu giữa 2 mốc thời gian
	// VD1: Ktra xem hàm chạy bao nhiêu lâu
	// VD2: Cho mốc A,B, tìm hiểu giẵ 2 mốc thời gian đó

	// Hiệu :Nam,tháng,gày,giờ,phút,giây

	// dA:7230mm
	// db:8652mm
	// distance: m,dm,cm,mm
	// dmm: 1422mm
	// dM =1422/1000 =1m
	// dM = 1422 -1*1000=422mm
	// đm = 422/100 = dm

	// dmm = 422 -4*100 = 22mm
	// dCM = 22/10 = 2cm

	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static void main(String[] args) {

		Calendar start = DateUtils.toCalendar("20/08/2024 20:10:00", PATTERN);
		Calendar end = Calendar.getInstance();

		if (start.after(end)) {
			throw new IllegalArgumentException("StartTime shoild not greater than End Time!!!");
		}

		System.out.println("start = " + DateUtils.format(start, PATTERN));
		System.out.println("end" + DateUtils.format(end, PATTERN));

		long startInMs = start.getTimeInMillis();// Số mn từ start đến epoch(1/1/1970)
		long endInMs = end.getTimeInMillis();

		long duration = endInMs - startInMs; // ms

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		long remaining = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remaining); // so gio

		remaining = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remaining);

		remaining = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remaining);
		
		System.out.println(""
				+days + "day"
				+hours+"hours"
				+minutes+"minutes"
				+seconds+"seconds");
		
	}
	
	
}
