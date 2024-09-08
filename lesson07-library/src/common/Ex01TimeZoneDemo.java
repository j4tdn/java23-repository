package common;

import java.util.Calendar;
import java.util.TimeZone;

import utils.DateUtils;

public class Ex01TimeZoneDemo {
	public static void main(String[] args) {
		// TimeZone: thời gian được xác định ở 1 vị trí.
		// Là khái niệm dùng để quy ước, ước tính tại 1 quốc gia trên world.

		// GMT: Greenwich Mean Time (phụ thuộc vào yếu tố tự nhiên) not rcm in coding

		// UTC: Coordinated Universal Time -> được sử dụng trong WWW
		// Kinh độ: Đồng hồ nguyên tử

		// Area/Zone:
		// ICT

		// Locale(ctry, lang) (default, en,EN) -> ảnh hưởng ngày đầu tuần
		// TimeZone: ảnh hưởng đến time

		Calendar c = Calendar.getInstance();
		System.out.println("timezone default: " + TimeZone.getDefault());

		//Java 07:
		TimeZone catTz = TimeZone.getTimeZone("CAT");

		Calendar c1 = Calendar.getInstance(catTz);

		System.out.println(DateUtils.format(c, "dd/MM/yyyy HH:mm:ss"));
		System.out.println(DateUtils.format(c1, "dd/MM/yyyy HH:mm:ss", catTz));
	}
}
