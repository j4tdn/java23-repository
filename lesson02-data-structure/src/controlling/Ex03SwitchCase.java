package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	/*
	 * câu 5  : bài toán trong tuần ,  cuối tuần số ngày mỗi tháng 
	 */

	public static void main(String[] args) {
		
	//giá trị trong mệnh đề case bắc buộc phải khác nhau 
		
		Random rd = new Random();
		int a = rd.nextInt(5);
		System.out.println("giá trị của a là "+a);
		
		switch (a) {
		case 1: {
			System.out.println("số một");
			break;
		}
		case 2: {
			System.out.println("số hai");
			break;
		}
		case 3: {
			System.out.println("số ba");
			break;
		}
		case 4: {
			System.out.println("số bốn");
			break;
		}
		default:
			System.out.println("số khong nằm trong phạm vi ");
		}
		
		/*
		 * random 1 số nguyên ngẩu nhiên 2-8
		 * in ra số đó là ngày trong tuần hay cuối tuần
		 * nếu in ra 2-6 thì là week day
		 *           7-8 thì là weekend day
		 */
		System.out.println("===========ngày=trong=tuần===========");
		int wdAsNumber = rd.nextInt(2 , 9);
		System.out.println("wdAsNumber "+wdAsNumber+" : ");
		String wdAsstring = "";
		switch (wdAsNumber) {
		case 1: 
		case 2: 
		case 3:
		case 4: 
		case 5: 
		case 6: {
			wdAsstring = "week day";
			break;
		}
		case 7: 
		case 8: {
			wdAsstring = "weekend day";
			break;
		}
		default:
			System.out.println("số không nằm trong phạm vi ");
		}
		
		
		
		
		System.out.println("==========cấu trúc khác============");
		 
		System.out.println("wdAsNumber1 = "+wdAsNumber);
		
		wdAsstring = switch (wdAsNumber) {
		case 2,3,4,5,6 -> "weed day";
		case 7,8 -> "weekend day";
		default -> "invalid day";
		};

	}

}
