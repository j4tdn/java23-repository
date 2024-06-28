package view;

import java.util.Scanner;
import java.util.jar.Attributes.Name;
	
public class ChuXE {

		private String id;
		private String name;
		private String phone;
		private String address;

		public ChuXE() {}
		public ChuXE(String id, String name, String phone, String address) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.address = address;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		 public void input() {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Nhập ID : ");
		        id = sc.nextLine();
		        System.out.print("Nhập tên chủ xe : ");
		        name = sc.nextLine();
		        System.out.print("Nhập số điện thoại : ");
		        phone = sc.nextLine();
		        System.out.print("Nhập địa chỉ : ");
		        address = sc.nextLine();
		 }
		 
		@Override
		public String toString() {
			return "Customer [id = " + id + ", name = " + name + ", phone = " + phone + ", address = " + address + "]";
		}
	}
