package datetime;

import java.util.Date;

public class DateTimeInitial {

//	java.util.time
//	Calendar
//	DateFormat, SimpleDateFormat
	
	public static void main(String[] args) {

		//	new Date : trả về thông tin thời gian hiện tại
//		tùy thuộc vào hệ thống đang thực thi chương trình JVM
//		toString: Wed Aug 14 20:23:19 ICT(Indochina Time - Giờ Đông Dương)2024
		Date date1 = new Date();
		System.out.println("Date time -->" +date1);
		
//		
		Date date2 = new Date(36000);
		System.out.println("Date time --> " +date2);
		
		
//		date2.getMonth()
//		==> date chỉ dùng dđể tạo biến,
//		==> Calendar dùng để xử lý biến 
	}
}
