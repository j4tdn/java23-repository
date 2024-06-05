package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	//2 cách sw case:
	//default: 
	//case -> : 
	public static void main(String[] args) {
		int weekday = new Random().nextInt(2,10);
		
		System.out.println("weekday -- " + weekday);
		
		//Giá trị trong case phải khác nhau
		//khi sw case đúng giá trị -> ko kiểm tra nữa nhưng vẫn chạy tiếp xuống 
		//chỉ thoát sw case khi gặp break hoặc default hoặc chạy hết sw.
		
		String s = switch(weekday) {   //Từ java 13 -> thì mới xài ->, java 12 cho dấu ',', java dưới không được
		case 2,3,4,5,6 -> "Ngày trong tuần";
		case 7,8 ->"Ngày cuối tuần";
		default -> ""; //nếu dùng dạng này bắt buộc default
		};
		
		System.out.println(weekday + " là " + s);
	}
}
