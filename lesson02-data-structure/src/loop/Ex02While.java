package loop;

import java.util.Random;

public class Ex02While {
	public static void main(String[] args) {
       //In ra các số là bội của 4 từ a [5, 10) đến b[20, 30)
		Random rd = new Random();
		final int a = rd.nextInt(5,10);
		final int b = rd.nextInt(20,31);
		System.out.println("Gía trị a = " + a);
		System.out.println("Giá trị b = " + b);
		
		//sử dụng for
		for (int i = a; i <=b; i++) {
			if(i % 4 == 0) {
				System.out.println("i -->" + i);
			}
		}
		
		System.out.println("=====");
		//sử dụng while 
		int i = a;
		while(i <= b) {
			if(i % 4 == 0) {
				System.out.println("i -->" + i);
			}
			i++;
		}
		
		System.out.println("=====");
		//sử dung while break
		 i = a;
		while(true) {
			if(i % 4 == 0) {
				System.out.println("i -->" + i);
			}
			i++;
			if(i>b) {
				//khi gặp break --> thoát khỏi vòng lặp
				break;
			}
		}
		
	}
}
