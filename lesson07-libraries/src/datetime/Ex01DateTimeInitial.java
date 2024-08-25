package datetime;

import java.util.Date;

public class Ex01DateTimeInitial {
	
	
	public static void main(String[] args) {
		
		//tra ve thoi gian hien tai
		//tuy thuoc vao he thong dang thuc thi chuong trinh jvm
		//toString : Sat Aug 24 10:03:46 ICT(Indochina time-gio dong duong) 2024
		Date date1 = new Date();
		System.out.println("date-->"+date1);
		
		
		//=1.1.1970 +5246363654l(ms)
		Date date2 = new Date(52463);
		System.out.println("date2 -->"+date2);
		
		//date2.getMonth();
		//==> Date chi dung de tao bien , lkuu tru du lieu , cac ham xu ly thi bi @deprecated het roi
		//==> Calendar: xu ly
		
	}
}
