package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex05Duration {
//Bài toán tìm hiệu giữa 2 mốc thời gian 
//	Vd1: Kiểm tra xem hàm chạy trong bao lâu
//	Vd2: Cho mốc A và B tìm hiệu giữa 2 mốc thời gian đó
	
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";

//	dA: 7230mm;
//	dB: 8652mm
//	distance: m,dm,cm,mm
//	dmm: dB-dA= 1422mm
	
//	dM = 1422 / 1000: 1m

//	dmm: 1422 - 1*1000 = 422
//	dDM: 422 / 100: 4
	
//	dmm: 422 - 4*100: 22mm
//	dCM: 22/10 = 2cm
	public static void main(String[] args) {
	          
		Calendar start = DateUtils.toCalendar("20/08/2024 10:50:00 ", PATTERN);
		Calendar end = Calendar.getInstance();
		
		if( start.after(end)) {
			throw new IllegalArgumentException("StartTime should not greater than EndTime ");
		}
		
		System.out.println("Start: " +DateUtils.format(start, PATTERN));
		System.out.println("End: " +DateUtils.format(end, PATTERN));
		
//		epoch là khái niệm mốc thời gian từ 01.01.1975
		long startMins = start.getTimeInMillis();// số ms từ start đến epoch
		long endInMins = end.getTimeInMillis();// số ms từ end đến epoch
		
		long duration = endInMins - startMins; //ms
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);// số Ngày
		
		long remaining = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remaining);// Số giờ
				
		  remaining = duration - TimeUnit.DAYS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remaining);// Số phút
		
		  remaining = duration - TimeUnit.DAYS.toMillis(hours);
			long seconds = TimeUnit.MILLISECONDS.toSeconds(remaining);// Số giờ
			
			System.out.println(+days +"day(s)"
			+ hours +"hour(s)" 
			+minutes + "minute(s)"
			+seconds + "second(s)");
				
				
	}
}
