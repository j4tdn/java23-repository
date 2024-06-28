package bean;

import java.util.Scanner;

public class Person {
	
	private String name;
	private int age;
	private String address;
	private String phone;
	
	public Person() {}

	public Person(String name, int age, String address, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public void input() {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập tên: ");
		name = ip.nextLine();
		System.out.print("Nhập tuổi: ");
		age = ip.nextInt();
		ip.nextLine();	// Tiếp tục đọc string
		System.out.print("Nhập địa chỉ: ");
		address = ip.nextLine();
		System.out.print("Nhập số điện thoại: ");
		phone = ip.nextLine();
		
	}
}
