package ex04;

public class main {
	public static void main(String[] args) {
		
		Director d1 = new Director("Nguyen Van A", "26/01/1990", 4.0, 2.5);
		Manager m1 = new Manager("Nguyen Van B", "25/03/1993", 2.5, 1.5, "HanhChinh");
		Manager m2 = new Manager("Nguyen Van C", "01/10/1993", 2.5, 1.5, "NhanSu");
		Staff s1 = new Staff("Le Thi T", "02/02/2000", 1.5, "GiaoDichVien", "Nguyen Van B");
		Staff s2 = new Staff("Nguyen Ngoc V", "27/04/2001", 1.5, "GiaoDichVien", "Nguyen Van B");
		Staff s3 = new Staff("Duong Van Q", "19/02/1997", 1.5, "CanBoTinDung", "Nguyen Van C");
		Staff s4 = new Staff("Vo Thi Q", "10/03/2001", 1.5, "CanBoTinDung", "Nguyen Van C");
		Staff s5 = new Staff("Le Thi P", "03/05/1996", 1.5, "ThuKho", "Nguyen Van C");
		Staff s6 = new Staff("Le Ngoc Tu A", "29/07/1992", 1.5, "KeToan", "Nguyen Van B");
		
		System.out.println("GiamDoc --> " + d1);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		Staff [] nv = {s1,s2,s3,s4,s5,s6};
		
		System.out.println("\n Muc Luong tung Nhan Su: ");
		System.out.println("GD --> " + d1.tinhLuong());
		System.out.println("QL1 --> " + m1.tinhLuong());
		System.out.println("QL2 --> " + m2.tinhLuong());
		System.out.println("NV1 --> " + s1.tinhLuong());
		System.out.println("NV2 --> " + s2.tinhLuong());
		System.out.println("NV3 --> " + s3.tinhLuong());
		System.out.println("NV4 --> " + s4.tinhLuong());
		System.out.println("NV5 --> " + s5.tinhLuong());
		System.out.println("NV6 --> " + s6.tinhLuong());
	}
	
}
