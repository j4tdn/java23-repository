package datetime;

import java.util.Date;

public class Ex01DateTimeInitial {

	public static void main(String[] args) {
		// new date : trả về thông tin thời gian hiện tại
		// tùy thuộc vào thệ thống đang thực thi chương trình JVM
		// toString : date1 --> Wed Aug 14 20:21:47 ICT (Indochina time - giờ đông dương) 2024
		// epoch timne: 1.1.1970 --> mốc thời gian sử dụng cho tính toán ngày giờ
		Date date1 = new Date();
		System.out.println("date1 --> " + date1);
		
		Date date2 = new Date(0);
		System.out.println("date2 --> " + date2);
	}
	// date2.getMonth()
	// ==> date chỉ dùng để tạo biến, lưu trữ
}
