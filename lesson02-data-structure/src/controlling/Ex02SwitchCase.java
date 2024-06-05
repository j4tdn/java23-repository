package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		// ngay trong tuan 
		// Thu 2 --> Chu Nhat 
		// Thu hai(2) , Thu ba(3), ... chu nhat(8)
 		int weekday = new Random().nextInt(2,10);
 		switch(weekday) {
 		case 2 :
 			System.out.println("Thu 2");
 			break;
 		case 3 :
 			System.out.println("Thu 3");
 			break;
 		case 4 :
 			System.out.println("Thu 4");
 			break;
 		case 5 :
 			System.out.println("Thu 5");
 			break;
 		case 6 :
 			System.out.println("Thu 6");
 			break;
 		case 7 :
 			System.out.println("Thu 7");
 			break;
 		case 8 :
 			System.out.println("CN");
 			break;
 			default: System.out.println("Khong hop le");
 		}
	}
}
