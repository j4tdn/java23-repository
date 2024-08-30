package common;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

import static utils.DateUtils.*;

public class Ex01TimeZoneDemo {

	public static void main(String[] args) {
		
		// TimeZone: Mui gio
		// La thoi gian xac dinh o khu vuc, vi tri(zone)
		// La khai niem dung de quy uoc, uoc tinh thoi gian tai moi quoc gia, khu vuc tren the gioi
		
		// GMT: Quy uoc theo Kinh tuyen so 0 tai Dai thien van Greenwich - Anh
		// GMT: -11 0 +11 --> 1 kinh tuyen theo thoi gian cach nhau 1h
		//	  : phu thuoc vao yeu to tu nhien(trai dat quanh truc, trai dat quanh mat troi)
		//	  : ko dc su dung trong coding
		
		// UTC: Coordinated Universal Time --> duoc sun dung trong WWW
		// UTC: -11 0 +11
		// Kinh do: Dong ho nguyen tu (ko bi anh huong boi tu nhien)
		
		// Arena/Zone
		// ICT(VN/L/CPC) --> gio dong duong
		// Co nhieu quoc gia khu vuc co dien tich ko nam tren 1 bien do thoi gian
		// Quy uoc quoc gia khu vuc do duoc chon TimeZone --> Arena/Zone
		
		// Locale(country, language) --> Anh huong den ngay dau tuan
		
		printAvailableTimeZones();
		
		System.out.println("TimeZone default --> " + TimeZone.getDefault());
		
		System.out.println("\n======================\n");
		
		// JAVA01 -> JAVA07
		TimeZone catTz = TimeZone.getTimeZone("CAT");
		TimeZone zuluTz = TimeZone.getTimeZone("Zulu");
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance(catTz);
		Calendar c3 = Calendar.getInstance(zuluTz);
		
		System.out.println("c1 VN --> " + format(c1, DEFAULT_DATE_TIME_PATTERN));
		System.out.println("c2 CAT --> " + format(c2, DEFAULT_DATE_TIME_PATTERN, catTz));
		System.out.println("c3 Zulu --> " + format(c3, DEFAULT_DATE_TIME_PATTERN, zuluTz));
		
		// JAVA08 -> NOW(JAVA22)
		LocalDateTime now = LocalDateTime.now(ZoneId.of("Zulu"));
		System.out.println("\nZulu Time --> " + now);
		
		// BigDecimal, DateFormat, Enum
		// Design Pattern
	}
	
	private static void printAvailableTimeZones() {
		String[] timezones = TimeZone.getAvailableIDs(); // 2010
		for(String timezone: timezones)
			System.out.println(timezone);
	}
}
