package datetime;

import java.util.Date;

public class Ex01DateTimeInitial {
	// java.util.Date
	//Calendar
	// DateFormat, SimpleDateFormat
	// epoch time: 1.1.1970 --> moc tg su dung cho tinh toan
	public static void main(String[] args) {
		
		// new Date: tra ve thong tin thoi gian hien tai
		// tuy thuoc  vaao he thong dang thuc thi ctr JVM
		Date date1 = new Date();
		System.out.println("date1 --> " + date1);
		
		// = 1.1.1970 + 5342323232(ms)
		Date date2 = new Date();
		System.out.println("date2 --> " + date2);
		
		//date2.getMonth()
		// ==> Date chi dung de tao bien, luu tru, cac ham xu ly thi bi deprecated 
		// ==> Calendar: xu ly
		
	}
}
