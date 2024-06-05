package controlling;

import java.util.Random;

public class EX03SwitchCase {
	public static void main(String[] args) {
		Random rd = new Random();
		/*
		 * int a = rd.nextInt(1,5); System.out.println("a ="+a); switch (a) { case 1:
		 * System.out.println("so 1"); break; case 2: System.out.println("so 1"); break;
		 * case 3: System.out.println("so 1"); break; case 4:
		 * System.out.println("so 1"); break;
		 * 
		 * default: System.out.println("so ko nam trong pham vi (1,4]");
		 * 
		 * }
		 */

		int wdNumber = rd.nextInt(2, 9);
		System.out.println("wd= " + wdNumber);
		switch (wdNumber) {
		case 2, 3, 4, 5, 6:
			System.out.println("weekday");
			break;
		case 7, 8:
			System.out.println("weekend day");
			break;

		}
		System.out.println("----------------- \n");

		String wdAsString = switch (wdNumber) {
		case 2, 3, 4, 5, 6 -> "week day";
		case 7, 8 -> "weekend day";
		default -> "Invalid day";
		};
		System.out.println("wdAsString -->" + wdAsString);
	}
}
