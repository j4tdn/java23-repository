package loop;

import java.util.Random;

public class Ex02While {

	public static void main(String[] args) {
		// In ra các số là bội của 4 từ a[5,10) đến b[20,30)
		Random rd = new Random();

		//đặt final để không bị cập nhật giá trị mới
		final int a = rd.nextInt(5, 11);
		final int b = rd.nextInt(20, 31);
		
		//for
		System.out.println("Sử dụng for");
		for (int i = a; i <= b; i++) {
			if (i % 4 == 0) {
				System.out.println("i -> " + i);
			}
		}
		//while
		System.out.println("Sử dụng while");
		int i = a;
		while(i <= b) {
			if (i % 4 == 0) {
				System.out.println("i -> " + i);
			}
			i++;
		}
		
		//while/break
		System.out.println("Sử dụng while/break");
		i=a;
		while(true) {
			if (i % 4 == 0) {
				System.out.println("i -> " + i);
			}
			i++;
			if(i>b) {
				// khi gặp break -> thoát khỏi vòng lặp
				break;
			}
		}
	}

}
