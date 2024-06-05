package controlling;

public class Ex07BreakContinue {
	public static void main(String[] args) {
		// continue
		// sử dụng trong vòng lặp --> kết thúc sớm cái vòng lặp hiện tại, nhảy qua lần lặp tiếp theo
		
		
		// break
		// sử dụng switch case
		// -> thoát khỏi biểu thức switch case khi gặp lệnh break
		// sử dụng vòng lặp
		// -> Thoát khỏi toàn bộ vòng lặp hiện tại
		
		for(int i = 0; i < 20; i++) {
			System.out.println("i1 --> " + i);
			if(i == 7) {
				continue;
			}
			if( i == 2) {
				break;
			}
			System.out.println("i2 --> " + i);
		}
	}
}
