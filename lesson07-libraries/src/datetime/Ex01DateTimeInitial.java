package datetime;

import java.util.Date;

public class Ex01DateTimeInitial {

	// java.util.Date
	// Calender
	// DateFormat, SimpleDateFormat
	// epoch time: 1.1.1970 --> mốc thời gian sử dụng cho tính toán ngày giờ
	public static void main(String[] args) {
		
		// new Date: trả về thông tin thời gian hiện tại
		// tùy thuộc vào hệ thống đang thực thi chương trình JVM
		// toString: Wed Aug 14 20:23:49 ICT(Indochina Time - Giờ đông dương) 2024
		Date date1 = new Date();
		System.out.println("date1 --> " + date1);
		
		
		Date date2 = new Date(3607562);
		System.out.println("date1 --> " + date2);	
		
		// date2.getMoth()
		// ==> Date chỉ dùng để tạo biến, lưu trữ, các hàm xử lý thì bị @deprecated hết rồi
		// ==> Calendar: xử lý
	}
		
}
