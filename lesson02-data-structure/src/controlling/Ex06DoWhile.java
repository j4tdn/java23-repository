package controlling;

import java.util.Scanner;

public class Ex06DoWhile {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		do {
			exportmenu();
			System.out.println("Chọn 1-4: ");
			String option = ip.nextLine();
			if(isValidSelection(option)) {
				switch (option) {
				case "1":
					System.out.println("Thực hiện A");
					break;
				case "2":
					System.out.println("Thực hiện B");
					break;
				case "3":
					System.out.println("Thực hiện C");
					break;
				case "4":
					System.out.println("Thoát");
					return;
				}
			}
		} while(true);
	}
	
	private static boolean isValidSelection(String option) {
		return option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4");
	}
	 
	private static void exportmenu() {
		System.out.println("-------- Mời chọn chức năng ---------\n"
				+ " 1. Chức năng A\n"
				+ " 2. Chức năng B\n"
				+ " 3. Chức năng C\n"
				+ " 4. Thoát.\n");
	}
}
