package common;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;
import static utils.DateUtils.*;
public class Ex01TimeZoneDemo {

	public static void main(String[] args) {
		
		
		// timeZone : múi giờ 
		// là thời gian được xác định ở khu vực , vị trí (zone)
		// Là khái niệm dùng để quy ước , ước tính thời gian tại mỗi quốc gia khu vực trên thế giới 
		
		//GMT: quy ước theo kinh tuyến số 0 tại đài thiên văn Greenwich - Anh 
		// GMT: -11 0 + 11 --> kinh tuyến theo 
		// 
		TimeZone cat = TimeZone.getTimeZone("CAT");
		TimeZone zulu = TimeZone.getTimeZone("Zulu");
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance(cat);
		Calendar c3 = Calendar.getInstance(zulu);
		
		System.out.println("c1 VN --> " + format(c1, DEFAULT_DATE_PATTERN));
		System.out.println("c2 CAT --> " + format(c2, DEFAULT_DATE_PATTERN, cat));
		System.out.println("c3 Zulu --> " + format(c3, DEFAULT_DATE_PATTERN, zulu));
		
		LocalDateTime now = LocalDateTime.now(ZoneId.of("Zulu"));
	}
	private static void printAvailableTimeZones() {
		String [] timezones = TimeZone.getAvailableIDs();
		//for(String timezones: timezone) {
			
		}
	}


