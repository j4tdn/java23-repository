package common;

import java.text.Format;
import java.util.Calendar;
import java.util.TimeZone;
import static utils.DateUtils.*;
public class Ex01TimeZoneDemo {
	
	public static void main(String[] args) {
		// TimeZone là gì ??
		// -> Là múi giờ dc xác định ở khu vực, vị trí(zone)
		// Dùng để làm gì ??
		// -> là khái niệm dùng để quy ước, ước tính thgian tại mỗi quốc gia, khu vực trên thế giới
		
		
		// GMT
		// -> Quy ước theo Kinh tuyến số - tại đài thiên văn Greenwich - Anh
		// 		GMT: -11 0 +11 --> 1 kinh tuyến cách nhau 1h
		// 		   : phụ thuộc vào yếu tố tự nhiên(trái đất quanh trục, mặt trời)
		//		   : ko dc sử dụng trong coding
		
		// UTC: Coordinated Universal Time --> dc sử dụng trong các WWW
		// UTC: -11 0 +11
		// Kinh độ: đồng hồ nguyên tử ko bị ảnh hưởng bởi yếu tố tụ nhiên
		//		  
		
		// Are/ Zone
		// ICT(VN/L/CPC) -->gio đông dươnng
		// Có nhiều quốc gia khu vực có diện tích ko nằm trên 1 biên độ thời gian
		// quy ước quốc gia khu vực đố dc chọn Timezone --> Are/ Zone
		
		// Local(country, languege) --> ảnh hưởng đên ngày đầu tuần
		System.out.println("TimeZone default --> " + TimeZone.getDefault());
		
		// JAVA 01-> JAVA 07
		TimeZone catTz = TimeZone.getTimeZone("CAT");
		TimeZone zuluTz = TimeZone.getTimeZone("Zulu");

		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance(catTz);
		Calendar c3 = Calendar.getInstance(zuluTz);
		
		// JAVA 08 -> NOW(2022)
		System.out.println("c1 VN --> " +format(c1, DEFAULT_DATE_TIME_PATTERN);
		System.out.println("c2 VN --> " +format(c2, DEFAULT_DATE_TIME_PATTERN, catTz);
		System.out.println("c3 VN --> " +format(c3, DEFAULT_DATE_TIME_PATTERN, zuluTz);

		
	}
	
		private static void printAvailableTimeZones(long value, String unit) {
		String[] timezones = TimeZone.getAvailableIDs();
		for(String timezone:timezones) {
			System.out.println(timezone);
		}
	}
}
