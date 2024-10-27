package common;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

import static utils.DateUtils.*;
public class Ex01TimeZoneDemo {
	public static void main(String[] args) {
		// TimeZone: Mui gio
		// la gi thoi gian duoc xac dinh o khu vuc, vi tri (zone)
		// Dung de lam j ? la khai niem dung de quy uoc, thoi gian tai moi quoc gia, khu vuc tren tg
		
		// GMT: Quy uoc theo kinh tuyen so 0 tai dai thien van GreenWich - ANh
		// GMT: -11 0 + 11 --> 1 kinh tuyen theo tg cach nhau 1 h
		//		: phu thuoc vao yeu to tu nhien (trai dat quanh truc, trai dat quanh mat troi)
		//		: k duoc su dung trong coding
		// UTC: Cordinated Universal Time --> dc su dung trong WWW
		// UTC: -11 0 + 11
		// Kinh do: Dong ho nguyen tu (k bi anh huong boi tu nhien) 
		
		// Area/Zone
		// ICT (VN/L/CPC) --> gio dong duong
		// Co nhieu quoc gia khu vuc, co dien tich k nam tren 1 bien do tg
		// Quy uoc quoc gia khu vuc do duoc chon TimeZOne --> Area/Zone
		
		// Locale(country, language) --> anh huong den ngay dau tuan
		
		System.out.println("TimeZone default --> " + TimeZone.getDefault());
		
		System.out.println("\n=====================\n");
		// JAVA 01 -> JAVA 07
		
		TimeZone catTz = TimeZone.getTimeZone("CAT");
		TimeZone zuluTz = TimeZone.getTimeZone("Zulu");
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance(catTz);
		Calendar c3 = Calendar.getInstance(zuluTz);
	
		
		System.out.println("c1 VN --> " + format(c1, DEFAULT_DATE_TIME_PATTERN));
		System.out.println("c2 CAT --> " + format(c2, DEFAULT_DATE_TIME_PATTERN, catTz));
		System.out.println("c2 CAT --> " + format(c2, DEFAULT_DATE_TIME_PATTERN, zuluTz));
		
		// JAVA08
		LocalDateTime now = LocalDateTime.now(ZoneId.of("Zulu"));
		System.out.println("Zulu Time --> " + now);
	}
	private static void printAvailableTimeZones() {
		String [] timezones = TimeZone.getAvailableIDs();
		for (String timezone: timezones) {
			System.out.println(timezone);
		}
	}
}
