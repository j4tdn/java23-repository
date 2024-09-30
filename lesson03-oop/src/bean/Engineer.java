package bean;

import java.util.Scanner;

public class Engineer extends Cadre {

	private String major;
	
	public Engineer() {

	}

	public Engineer(String name, String date, String gender, String address, String major) {
		super(name, date, gender, address);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

 // hàm nhập 
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhập ngành: "); major = sc.nextLine();
	}
	// hàm hiện thị
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Ngành:" +major); 
		
	}
	

	
}
