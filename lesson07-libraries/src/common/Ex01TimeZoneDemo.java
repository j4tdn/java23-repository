package common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;
import static utils.DateUtils.*;

public class Ex01TimeZoneDemo {
	
	public static void main(String[] args) {
		
		// TimeZone: Múi giờ
		// Là thời gian đc xác định ở khu vực, vị trí(zone)
		// Là khái niệm dùng để quy ước, ước tính thời gian tại mỗi quốc gia, khu vực trên thế giới
		
		// GMT: Quy ước theo Kinh tuyến số 0 tại Đài Thiên Văn Greenwich - Anh
		// GMT: -11 0 +11 --> 1 kinh tuyến theo thời gian cách nhau 1h
		// 	  : phụ thuộc yếu tố tự nhiên (trái đất quanh trục, trái đất quanh mặt trời)
		//	  : ko đc sử dụng trong coding
		
		// UTC: Coordinated Universal Time --> đc sử dụng trong WWW
		// UTC: -11 0 +11
		// Kinh độ: Đồng hồ nguyên tử (ko bị ảnh hưởng bởi tự nhiên)
		
		// Area/Zone
		// ICT (VN, Lào, Campuchia) --> giờ đông dương
		// Có nhiều quốc gia khu vực có diện tích ko nằm trên 1 biên độ thời gian duy nhất
		// Quy ước quốc gia khu vực đó được chọn TimeZone --> Area/Zone
		
		// Locale(country, language) --> Ảnh hưởng đến ngày đầu tuần
		
		printAvailableTimeZones();
		
		System.out.println("TimeZone default --> " + TimeZone.getDefault());
		System.out.println("\n======================\n");
		
		//-------------- JAVA02 -> JAVA07
		TimeZone catTz = TimeZone.getTimeZone("CAT");
		TimeZone zuluTz = TimeZone.getTimeZone("Zulu");
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance(catTz);
		Calendar c3 = Calendar.getInstance(zuluTz);
		
		System.out.println("c1 VN --> " + format(c1, DEFAULT_DATE_TIME_PATTERN));
		System.out.println("c2 CAT --> " + format(c2, DEFAULT_DATE_TIME_PATTERN, catTz));
		System.out.println("c3 Zulu --> " + format(c2, DEFAULT_DATE_TIME_PATTERN, zuluTz));
		
		//-------------- JAVA08 -> NOW(JAVA22)
		LocalDateTime now = LocalDateTime.now(ZoneId.of("Zulu"));
		System.out.println("\nZulu now --> " + now);
		
		// BigDecimal, DateFormat, Enumeration
		// Design Pattern
	}
	
	private static void printAvailableTimeZones() {
		String[] timezones = TimeZone.getAvailableIDs();
		for (String timezone: timezones) {
			System.out.println(timezone);
		}
	}
}
