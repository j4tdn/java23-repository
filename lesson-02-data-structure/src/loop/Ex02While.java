package loop;

import java.util.Random;

public class Ex02While {

	
	public static void main(String[] args) {
		// In ra các số là bội của 4 từ a[5,10) đến b [20, 30)
		Random rd = new Random();
		
		int a = rd.nextInt(5,11);
		int b = rd.nextInt(20,31);
		
		System.out.println("Giá trị a = "+ a);	
		System.out.println("Giá trị b = " + b);
		
		for (int i = a; i <= b; i++) {
			if (i % 4 == 0) {
				System.out.println("Bội của 4 trong khoảng từ a đến b là : " + i + "\n");
			}
		}
		System.out.println("Sử dụng while");
		int i = a;
		do {
			if ( i % 4 == 0) {
				System.out.println("i = " + i );
			}
			i++;
		}
		while ( i <= b);
//		while (a <= b) {
//			if ( a % 4 == 0) {
//				System.out.println(" i -> "+ a);
//			}
//			a++;
//		}
		while (true) {
			if ( i % 4 == 0) {
				System.out.println("i --> "+ i);
				
			}
			i++;
			if ( i > b) {
				break;
			}
		}
	}
}
