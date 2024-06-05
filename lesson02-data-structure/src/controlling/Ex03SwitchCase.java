package controlling;

import java.util.Random;

public class Ex03SwitchCase {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int a = rd.nextInt(1, 10);
		System.out.println("Gia tri  a = " + a);
		
		//Khi switch case gap dung gia tri -> ko kiem tra cac case ben duoi nua
		//thoat ra khi gap tu khoa break gan nhat hoac het switch/case/default
		
		//Cau 1: In ra tu tuong ung voi so
		switch(a) {
		case 1: 
			System.out.println("Mot");
			break;
		case 2: 
			System.out.println("Hai");
			break;
		case 3: 
			System.out.println("Ba");
			break;
		case 4: 
			System.out.println("Bon");
			break;
		default:
			System.out.println("So khong nam trong pham vi [1, 4)");
		}
		
		//Random 1 so nguyen ngau nhien tu [2,8]
		//In ra so do la ngay trong tuan hay cuoi tuan
		//Neu gia tri tu 2-6 -> weekday
		//               7-8 -> weekend day
		System.out.println("\n=======================\n");
		int wdAsNumber = rd.nextInt(2, 9);
		System.out.println("WdAsNumber = " + wdAsNumber);
		switch(wdAsNumber) {
		case 2: 
			System.out.println("Week day");
			break;
		case 3: 
			System.out.println("Week day");
			break;
		case 4: 
			System.out.println("Week day");
			break;
		case 5: 
			System.out.println("Week day");
			break;
		case 6: 
			System.out.println("Week day");
			break;
		case 7: 
			System.out.println("Weekend day");
			break;
		case 8: 
			System.out.println("Weekend day");
			break;
		}
		
		//C2
		String wdAsString = "";
		switch(wdAsNumber) {
		case 2,3,4,5,6: 
			wdAsString = "Week day";
		    break;
		case 7,8:
			wdAsString = "Weekend day";
		    break;
		}
		System.out.println("WdAsString1 --> "+ wdAsString);
		
		System.out.println("\n===================\n");
		
		//C3: switch/case/default return
		wdAsString = switch(wdAsNumber) {
		    case 2,3,4,5,6 -> "Weekday";
		    case 7,8 -> "Weekend day"; 
		    default -> "Invalid day";
		};
		System.out.println("WdAsStrings --> " + wdAsString);
	}
}
