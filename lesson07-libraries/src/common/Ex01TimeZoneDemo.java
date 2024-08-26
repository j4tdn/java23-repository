package common;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex01TimeZoneDemo {

	public static void main(String[] args) {
		
		//Timezone: Múi giờ
		//Là thời gian được xác định ở khu vực, vị trí
		//Là khái niệm dùng để quy ước , ước tính thời gian của quoccs gia, khu vực trên thế giới
		
		//GMT:Quy ước theo kinh tuyến số 0 tại đài thiên văn Grewich -Anh
		///GMT :-11 0 +11 --> 1 kinh tuyến theo thời gian cách nhau 1h
		//	:phụ thuộc vào yếu tố tự nhiên(trái đát quanh trục, trái đất quanh mặt trời)
		//	:Ko đc sử dụng trong coding
		
		//UTC :Coorrdinated Universal Time --> được sử dụng trong WWW
		//UTC :-11 0 +11
		//Kinh độ:Đồng hồ nguyên tử(ko bị ảnh hưởng bởi tự nhiên)
		
		
		//Area/Zone
		//ict(VN/L/CPC)--> giờ đông dương
		//Có nhiều quốc gia có diện tích lớn kh nằm trên 1 biên đọ thời gian
		
		//Java01 -> java07
		
		System.out.println("TimeZone default -->"+TimeZone.getDefault());
		Calendar c = Calendar.getInstance();
	}
	private static void printAvailableTimeZones() {
//		String [] timezones = TimeZone.get
	}
	
}
