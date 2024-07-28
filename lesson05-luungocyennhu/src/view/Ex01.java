package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		double n = 0.0;
		boolean isValid = false;
		int count = 0;
		
		while (!isValid && count < 3) {
			System.out.println("Enter number: ");
			try {
				n = Double.parseDouble(ip.nextLine());
				if(n % 1 != 0) {
					isValid =  true;
				} else {
					System.out.println("n ko phải số có thập phân khác 0");
				}
			} catch (Exception e) {
				System.out.println("Nhập ko đúng kiểu dữ liệu");
			}
			count++;
		}
		if(isValid) {
			System.out.println("Phân số tối giản của số thập phân đó: " + getMinFract());
		} else {
			return;
		}
	}
	 ///
	private static String getMinFract() {
		return "";
	}
}
