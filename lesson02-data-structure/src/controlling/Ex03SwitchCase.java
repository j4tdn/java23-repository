package controlling;

import java.util.Random;

/*
 * Thông tin các lỗi để in ra mô tả của nó
 * 500 internal error
 * 400 bad request
 * 404 not found
 * 200 success
 * # : unknown
 */
public class Ex03SwitchCase {

	public static void main(String[] args) {
		
	
		Random rd= new Random();
//		int a = rd.nextInt(1,5);
		int a=2;
		switch(a) {
		case 1:
			System.out.println("Số một");
			break ;
		case 2:
			System.out.println("So hai");
			break ;
		case 3:
			System.out.println("So ba");
			break ;
		case 4:
			System.out.println("So bốn");
			break ;
		default:
			System.out.println("So khong trong pham vi [1,4]");
			
		}
		//random 1 số nguyên ngẫu nhiên từ [2,8]
		//in ra số đó là ngày tron tuần hay cuối tuần
		//nếu gia trị từ 2-6 ->week day
		int wdAsNumber = rd.nextInt(2, 9);
		System.out.println("wdAsNumber=" + wdAsNumber);
		String wdAsString = "";
		switch (wdAsNumber) {
		case 2, 3, 4, 5, 6:
			wdAsString = "week Day";
			break;
		case 7, 8:
			wdAsString = "weekend Day";
			break;

		}
		System.out.println("wdsString1-->" + wdAsString);

		System.out.println("\n=============\n");

		wdAsString = switch (wdAsNumber) {
		case 2, 3, 4, 5, 6 -> "week Day";
		case 7, 8 -> "week Day";
		default -> "Invalid Day";
		};
		System.out.println("wdasstrings-->" + wdAsString);
		;

	}
}