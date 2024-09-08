package datetime;

import java.sql.Time;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05Duration {
	
	// Bài toán tìm hiệu giữa 2 mốc thời gian
	// VD1: kiểm tra xem hàm chạy trong bao lâu
	// Vd2: cho mốc A, B tìm hiệu giữa 2 mốc thời gian đó
	
	// Hiệu : Năm, tháng, giờ, phút, giây
	
	// dA: 7230mm
	// dB: 8652mm
	// distance : m/ dm/ cm/ mm
	// dm : 1422mm
	// dM = 1422/1000 = 1m
	
	// dmm = 1422 - 1*1000 = 422mm
	// dDM = 422/100 = 4dm
	
	// dmm = 422 - 4*100 = 22mm
	// dCM = 22/10 = 2cm
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	public static void main(String[] args) {
		Calendar start  = DateUtils.toCalendar("20/08/2025 10:00:00", PATTERN);
		Calendar end = Calendar.getInstance();
		
		if(start.after(end)) {
			throw new IllegalArgumentException("Start time should not be greater than endtime.");
		}
		System.out.println("Start: " + DateUtils.format(start, PATTERN));
		System.out.println("End: " + DateUtils.format(end, PATTERN));

		
		long startInMs = start.getTimeInMillis(); // số ms từ start đến epoch
		long endInMs = end.getTimeInMillis(); // số ms từ end đến epoch
	
		long duration = endInMs - startInMs;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		long remaining = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remaining); // so gio
		
		remaining = remaining - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remaining); // so phut
	
		remaining = remaining - TimeUnit.HOURS.toMillis(hours);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remaining); // so giay
	}
	
}
