package loop;
 
import java.util.Random;

public class Ex02While {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		final int a  = rd.nextInt(5, 11);
		final int b = rd.nextInt(20, 31);
		
		System.out.println("giá trị a = " + a);
		System.out.println("giá trị b = " + b);
		System.out.println("sử dụng for");
		for (int i = a; i <= b; i++) {
			if (i % 4 == 0) {
			System.out.println("i -> " + i);	
			}
		}
		
		System.out.println("sử dụng while");
		int i = a;
		while(i <= b) {
			if (i % 4 == 0) {
				System.out.println("i -> " + i);
			}
			i++;
		}
		

		System.out.println("sử dụng while/break");
		int i1 = a;
		while(true) {
			if (i1 % 4 == 0) {
				System.out.println("i -> " + i1);
			}
			i++;
			if (i > b) {
				//khi gặp break -> thoát khỏi vòng lặp
				break;
			}
	    }
     }
}
