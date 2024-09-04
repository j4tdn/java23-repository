package common;

import java.text.Format;
import java.util.Calendar;
import java.util.TimeZone;
import static utils.DateUtils.*;

public class Ex01TimeZoneDemo {

	public static void main(String[] args) {
		
		// TimeZone: Múi giờ
		// Là thời gian được xác định ở khu vực, vị trí(zone)
		// Là khái niệm dùng để quy yicws, ước tính thời gian tại mỗi quốc gia, khu vực trên thế giới
		
		// GMT: Quy ước theo Kinh tuyến số 0 tại Đài Thiên Văn Greenwich - Anh
		// GMT: -11 0 +11 ==> 1 kinh tuyến theo thời gian cách nhau 1h
		// 	  : phụ thuộc vào yếu tố tự nhiên (trái đất quanh trục, trái đất quanh mặt trời)
		//	  : không được sử dụng trong coding
		
		// UTC: Coordinated Universal Time --> được sử dụng trong WWW
		// UTC: -11 0 +11
		// Kinh độ: Đồng hồ nguyên tử (không bị ảnh hưởng bởi tự nhiên)
		
		// Area/Zone
		// ICT(VN/L/CPC)--Giờ Đông Dương
		// Có nhiều quốc gia khu vực có diện tích không nằm trên 1 bên độ thời gian
		// -> Quy ước quốc gia khu vực đó được chọn TimZone --> Area/Zone
		
		// Locale(country, language) --> Ảnh hưởng đến Ngày Đầu Tuần
		
		printAvailableTimeZones();
		
		System.out.println("TimeZone default: " + TimeZone.getDefault()); 
		
		System.out.println("\n-------------------------\n");
		
		// Java01 -> Java07
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("CAT"));
		
		
		System.out.println("c1 VN --> " + format(c1, DEFAULT_DATE_TIME_PATTERN));
		System.out.println("c2 CAT --> " + format(c2, DEFAULT_DATE_TIME_PATTERN));
		// Java01 -> Java07
		
	}
	
	private static void printAvailableTimeZones() {
		String[] timeZones = TimeZone.getAvailableIDs();
		for(String timeZone : timeZones) {
			System.out.println(timeZone);
		}
	}
	
}
