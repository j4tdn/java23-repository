package bean;

import java.util.Scanner;

public class Staff extends Cadre {
	
	private String job;
	
	public Staff() {

	}

	public Staff(String name, String date, String gender, String address, String job) {
		super(name, date, gender, address);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
       System.out.print("Nhập  công việc: "); job = sc.nextLine();		
	}
// hàm hiển thị
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Công việc: " +job); 
	}
}
