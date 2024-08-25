package datetime;
import java.util.Date;

public class Ex01DateTimeInitial {

	// java.util.Date
	// Calendar
	// DateFormat, SimpleDateFormat
	public static void main(String[] args) {
		// new Date: trả về thông tin thời gian hiện tại

		// ToString: ICT (Indochina Time);
		Date date1 = new Date();
		System.out.println("date1 --> " + date1);

		// = 1.1.1970 + 646425232ms
		Date date2 = new Date(646425232);

		// date2.getMonth()
		// ==> Date chỉ dùng để tạo biến, lưu trữ, các hàm xử lý thì bị @Deprecated
		// ==> Calendar: xử lý
	}
}
