package localdatetime;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex04TimeZoneDeMo {
	
	//Timezone: múi giờ 
	
	//GMT: quy ước theo kinh tế số 0 tại DTV greenwich Anh. không được sử dụng trong coding.
	
	// vì có nhiều quốc gia có diện tích không nằm trong một khu vực múi giờ nhất định nên các quốc gia đó được chọn một timezone.
	
	//trong coding chỉ sử dụng UTC 
	public static void main (String args[]) {
		System.out.println("Timezone default: "+ TimeZone.getDefault());
		Calendar c1 = Calendar.getInstance();
	}
}
