package view;

import java.util.Scanner;

import bean.Cadre;
import bean.QLCB;

public class ManagerCarde {

	public static void main(String[] args) {
//		 Cadre cd = new Cadre("Vu",20,"Men","Da Nang");
//		System.out.println(cd);
		Scanner sc = new Scanner(System.in);
		QLCB qlcb = new QLCB();

		qlcb.nhapDanhSach(sc);
		
		System.out.println("Nhap tên cần tìm:");
		String name = sc.nextLine();
	       qlcb.findName(name);
		
		
			
		sc.close();
	}
}
