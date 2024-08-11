package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {

//	try là thử, catch là quăng lỗi vào
	
//	  trong khối try bị exception gì thì catch block nên bắt đúng exception đó hoặc bắt exception cha 
	
//	khi chưa có try catch --> gặp exception --> dừng luôn chương trình

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter year of birth:  ");
		int yob = 0;
		do {
			try {
				yob = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("nef -->" + nfe.getMessage());
				System.out.println("Please Enter a valid number");
			}
		} while (true);
		int age = Year.now().getValue() - yob + 1;
		System.out.println("====> your age: " + age);

	}
}
