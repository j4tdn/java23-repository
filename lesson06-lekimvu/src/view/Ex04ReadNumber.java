package view;

import java.util.Scanner;

public class Ex04ReadNumber {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				caculate();
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input avalable number " + e.getMessage());
				System.out.println("Please input again");
			}
		} while (true);

	}

	private static void caculate() {
		System.out.println("Input number n: ");
		int n = Integer.parseInt(sc.nextLine());
		if (n < 0 || n > 999) {
			System.out.println("Please input again");
		} else if (n >= 1 && n <= 99) {
			switch (n / 10) {
			case 1:
				System.out.print("Mười");
				break;
			case 2:
				System.out.print("Hai mươi");
				break;
			case 3:
				System.out.print("Ba mươi");
				break;
			case 4:
				System.out.print("Bốn mươi");
				break;
			case 5:
				System.out.print("Năm mươi");
				break;
			case 6:
				System.out.print("Sáu mươi");
				break;
			case 7:
				System.out.print("Bảy mươi");
				break;
			case 8:
				System.out.print("Tám mươi");
				break;
			case 9:
				System.out.print("Chín mươi");
				break;
			}
			switch (n % 10) {
			case 1:
				System.out.print(" mốt");
				break;
			case 2:
				System.out.print(" hai");
				break;
			case 3:
				System.out.print(" ba");
				break;
			case 4:
				System.out.print(" bốn");
				break;
			case 5:
				System.out.print(" lăm");
				break;
			case 6:
				System.out.print(" sáu");
				break;
			case 7:
				System.out.print(" bảy ");
				break;
			case 8:
				System.out.print(" tám");
				break;
			case 9:
				System.out.print(" chín");
				break;  
			}
		}
				else
					if(n > 99 & n <=999 ) {
//			n = 345 chia 100 --> 3
 						switch(n / 100) {
						case 1:
						System.out.print("Một trăm");
						break;
						case 2:
						System.out.print("Hai trăm");
						break;
						case 3:
						System.out.print("Ba trăm");
						break;
						case 4:
						System.out.print("Bốn trăm");
						break;
						case 5:
						System.out.print("Năm trăm");
						break;
						case 6:
						System.out.print("Sáu trăm");
						break;
						case 7:
						System.out.print("Bảy trăm");
						break;
						case 8:
						System.out.print("Tám trăm");
						break;
						case 9:
						System.out.print("Chín trăm");
						break;
					}
//						 n = 345, y lấy dư --> 45
						int y = n % 100;
//						z lấy nguyên của y --> 4
						int z = y / 10;
				switch (z) {
				case 1:
					System.out.print(" mười");
					break;
				case 2:
					System.out.print(" hai mươi");
					break;
				case 3:
					System.out.print(" ba mươi");
					break;
				case 4:
					System.out.print(" bốn mươi");
					break;
				case 5:
					System.out.print(" năm mươi");
					break;
				case 6:
					System.out.print(" sáu mươi");
					break;
				case 7:
					System.out.print(" bảy mươi");
					break;
				case 8:
					System.out.print(" tám mươi");
					break;
				case 9:
					System.out.print(" chín mươi");
					break;
				}
//				y = 45
//				a lấy dư của y --> 5
				int a = y % 10;
				switch (a) {
				case 1:
					System.out.print(" một");
					break;
				case 2:
					System.out.print(" hai ");
					break;
				case 3:
					System.out.print(" ba ");
					break;
				case 4:
					System.out.print(" bốn ");
					break;
				case 5:
					System.out.print(" lăm ");
					break;
				case 6:
					System.out.print(" sáu ");
					break;
				case 7:
					System.out.print(" bảy ");
					break;
				case 8:
					System.out.print(" tám ");
					break;
				case 9:
					System.out.print(" chín ");
					break;
				}
					}
	}

}
