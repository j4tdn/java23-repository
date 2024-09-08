package datetime;
import java.util.Date;

public class Ex01DateTimeInital {
  
	//java.util.Date
	//Calendar
	//DateFormat, SimleDateFormat
	public static void main(String[] args) {
		
		// new Date: tra ve thong tin thoi gian hien tai
		// tùy thuộc vào hệ thống đang thực thi JVM
		// toString: Wed Aug 14 20:23:19 ICT(Indochina Time - Giờ đông dương) 2024
		Date date1 = new Date();
		System.out.println("date1 --> " + date1);
		
		// = 1.1.1970 + 524363541(ms)
		Date date2 = new Date(3607562);
		System.out.println("date2 --> " + date2);
		
		//date2.getMoth()
		// ==> Date chỉ dùng để tạo biến, lưu trữ, các hàm xử lý thì bị @deprecated hết rồi
		// ==> Calendar: xử lý
		
	}
}
