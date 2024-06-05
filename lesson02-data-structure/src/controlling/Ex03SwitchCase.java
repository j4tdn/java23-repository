package controlling;

import java.util.Random;
import java.util.Scanner;

public class Ex03SwitchCase {
		/*
		 Câu 5: 
		 Bài toán ngày trong tuần. cuối tuần
		 Số ngày mỗi tháng trong năm
 
		*/
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(1, 10);
		System.out.println(a);
		//Giá trị trong các case phải khác nhau
		//khi switch case đúng giá trị --> thì nó ko kiểm tra các case bên dưới nữa 
		//thoát ra khi gặp từ khóa break gần nhất hoặc hết switch/case/default
		switch (a) {
		case 1:
			System.out.println("Số 1");
			break;
		case 2:
			System.out.println("Số 2");
			break;
		case 3:
			System.out.println("Số 3");
			break;
		case 4:
			System.out.println("Số 4");
			break;
		default:
			System.out.println("Số ko nằm trong phạm vi [1,4]");
		}
		
		//Random 1 số nguyên ngẫu nhiên từ [1-8]
		/*
		 In ra số đó là ngày trong tuần hay cn
		 nếu giá trị từ 2-6 week day
		 nếu giá trị từ 7-8 weekend day
		 
		 */
		
		int wdAsNumber = rd.nextInt(2, 9);
		System.out.println("WdAsNumber =" + wdAsNumber);
		String wdAsstring = "";
		switch (wdAsNumber) {
		/* Cách 1
		case 2:
			System.out.println("Week day");
		case 3:
			System.out.println("Week day");
		case 4:
			System.out.println("Week day");
		case 5:
			System.out.println("Week day");
		case 6:
			System.out.println("Week day");
		case 7:
			System.out.println("Weekend day");
		case 8:
			System.out.println("Weekend day");
		*/
		
		//Cách 2:
		case 2, 3, 4, 5, 6:
			wdAsstring = "Week day";
			break;
		case 7, 8:
			wdAsstring = "Weekend day";
			break;
		}
		System.out.println("wdAsstring: "+wdAsstring);
		
		System.out.println("===========================");
		
		//Cách 3 (*)
		//switch - case - default return data
		wdAsstring = switch (wdAsNumber) {
		case 2, 3, 4, 5, 6 -> "Week day";
		case 7, 8 -> "Weekend day";
		default -> "Invaild Day";
		};
		System.out.println("wdAsstring: " + wdAsstring);
		
				
	}
}
