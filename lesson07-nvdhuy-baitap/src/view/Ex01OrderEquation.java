package view;

import java.util.Scanner;

public class Ex01OrderEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a = 0;
		
		do {
			System.out.println("Nhap vao so a: ");
			try {
				a = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Error a: \n");
			}
		} while (true);
		
		
		System.out.println("Nhap vao so b: ");
		int b = 0;
		try {
			b = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Phuong trinh bac nhat co dang: " + a + "x"+ " + " + b + " = 0 ");
		
		
		
		if(a != 0 || b !=0) {
			System.out.println("Phuong trinh co nghiem: " + -b/a);
		} else if (a == 0 || b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} 
		
	}

}
