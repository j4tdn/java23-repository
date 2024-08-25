package datetime;

import java.util.Date;

public class Ex01Initial {

	// java.util.Date
	// Calendar
	// DateFormat, SimpleDateFormat
	// epoch time : 1.1.1970 : mốc thời gian sử dụng cho tính toán ngày giờ
	
	public static void main(String[] args) {
		
		//new Date = trả về thông tin thời gian hiện tại
		// tuỳ thuộc vào hệ thống đang thực thi chương trình JVM
		// toString: Sun Aug 25 16:12:09 ICT 2024 (Indochina Time - Giờ đông dương) 2024
		Date date1 = new Date();
		System.out.println("date1 --> " + date1);
		
		// = 1.1.1970 + 787984154(ms)
		Date date2 = new Date(1709984144444l);
		System.out.println("date 2 --> " + date2);
		
//		date2.getMonth();
		// Date --> chỉ dùng để tạo biến, lưu trữ, các hàm xử lý bị @deprecated hết rồi
		// => Calendar: xử lý
	}
}
