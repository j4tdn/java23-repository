package common;

import java.sql.Time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

import static utils.DateUtils.*;

public class Exx01TimeZoneDemo {

	public static void main(String[] args) {
		
		// TimeZone: Múi giờ
		// Là thời gian được xác định ở 1 khu vực, vị trí(zone)
		// Là khái niệm dùng để quy ước, ước tính thời gian tại mỗi quốc gia, khu vực trên thế giới
		
		// GMT: Quy ước theo Kinh tuyến số 0 tại Đài Thiên văn Greenwich - Anh
		// GMT: -11 0 +11 --> 1 kinh tuyển theo thời gian cách nhau 1h
		//    : Phụ thuộc vào yếu tố tự nhiên(trái đất quanh trục, trái đất quanh mặt trời)
		// ==> KHÔNG được sử dụng trong coding
		
		// UTC: Coordinated Universal Time --> Được sử dụng trong WWW
		// UTC: -11 0 +11
		// Kinh độ: Đồng hồ nguyên tử(không bị ảnh hưởng bởi yếu tố tự nhiên)
		
		// Area/Zone
		
		// ITC(VN/L/CPC) --> giờ đông dươnng
		
		// Có nhiều quốc gia khu vực có diện tích không nằm trên 1 biên độ thời gian
		// Quy ước quốc gia khu vực đó được chọn TimeZone --> Area/Zone
		
		// Local(country, language) --> Ảnh hưởng đến ngày đầu tuần
		
		System.out.println("TimeZone default --> " + TimeZone.getDefault());
		
		// JAVA01 -> JAVA07
		TimeZone catTz = TimeZone.getTimeZone("CAT");
		TimeZone zuluTz = TimeZone.getTimeZone("Zulu");
		
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance(catTz);
		Calendar c3 = Calendar.getInstance(zuluTz);
		
		
		System.out.println("c1 VN --> " + format(c, DEFAULT_DATE_TIME_PATTERN));
		System.out.println("c2 CAT --> " + format(c1, DEFAULT_DATE_TIME_PATTERN));
		
		// JAVA08 -> NOW(JAVA22)
		LocalDateTime now = LocalDateTime.now(ZoneId.of("Zulu"));
		System.out.println("\nZulu Time --> " + now);
	}
	
	private static void printAvailableTimeZone() {
		String[] timezones = TimeZone.getAvailableIDs();
		for (String timezone: timezones) {
			System.out.println(timezone);
		}
	}
	
}
