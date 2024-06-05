package loop;

import java.util.List;
import java.util.Scanner;

public class Ex03DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		do {
			exportMenu();
			System.out.println("Chọn (1-4): ");
			String opt = sc.nextLine();
			if(isValidSection(opt)) {
				switch (opt) {
				case "1": {
					System.out.println("Thực hiện chức năng 1");
					break;
				}
				case "2": {
					System.out.println("Thực hiện chức năng 2");
					break;
				}
				case "3": {
					System.out.println("Thực hiện chức năng 3");
					break;
				}
				case "4": {
					System.out.println("Thoát");
					return;
				}
				default:{
					System.out.println("Chọn sai, vui lòng chọn lại");
				}
			}
		}} 	while(true);
	}
	
	private static boolean isValidSection(String opt) {
		return List.of("1","2","3","4").contains(opt);
	}
	
	private static void exportMenu() {
		System.out.println("Mời chọn chức năng \n1. Chức năng A\n2.Chức năng B\n3.Chức năng C\n4.Thoát");
	}
}
