package bean;

import java.util.Scanner;

public class Cadre {

	private String name;
	private String date;
	private String gender;
	private String address;

	public Cadre() {

	}

	public Cadre(String name, String date, String gender, String address) {
		this.name = name;
		this.date = date;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setAge(String date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
// hàm nhập
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhập tên: "); name = sc.nextLine();
		System.out.println("Nhập ngày sinh(dd/mm/yyyy): "); date = sc.nextLine();
		System.out.println("Nhập giới tính: "); gender = sc.nextLine();
		System.out.println("Nhập địa chỉ: "); address = sc.nextLine();
	}
// hàm hiển thị
	public void hienThiThongTin() {
		System.out.println("Tên: " +name);
		System.out.println("Ngày sinh: " +date);
		System.out.println("giới tính: " +gender);
		System.out.println("Địa chỉ: " +address);
	}
	

}
