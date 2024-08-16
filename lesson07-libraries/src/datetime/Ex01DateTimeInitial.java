package datetime;

import java.util.Date;

public class Ex01DateTimeInitial {
	// java.util.Date
	// Calender
	// DateFormat, SimpleDateFormat
	public static void main(String[] args) {
		
		// new Date: trả về thông tin thời gian hiện tại
		// tuỳ thuộc vào hệ thống đang thực thi chương trình JVM
		// toString :Wed Aug 14 20:22:50 ICT(Indochina time - giờ đông dương) 2024 
		Date date1 = new Date();
		System.out.println("date -->" + date1);
		
		Date date2 = new Date(0);
		System.out.println("date 2 --> " + date2);
		
		//date2.getMonth()
		// ==> Date chỉ dùng để tạo biến, lưu trữ, các hàm xử lý thì bị @deprecated
		// ==> Calendar: xử ý 
		
	}
}
