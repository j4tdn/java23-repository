package validate_trycatch_thowthows;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {

	private static Scanner ip = new Scanner(System.in);
	/* 
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter year of birth: ");
		// khi chưa có try/catch  --> gặp exception --> dừng luôn chương trình 
		//int yob = Integer.parseInt(ip.nextLine());
		int yob = 0;
		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("error >> " + nfe.getMessage());
				System.out.println("please enter a valid number: ");
			}
		} while (true);
		int age = Year.now().getValue() - yob + 1 ;
		System.out.println("===> Your age =  " + age);
		
	}

}
