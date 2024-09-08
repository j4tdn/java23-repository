package string.immutable;

import bean.Iteam;

public class Ex02Comparing {

	/* 
	 	So sánh
	 	+ KDL nguyên thủy: sử dụng toán tử  > < >= <= !=
	 	                 : so sánh giá trị ở stack 
	 	+ KDL đối tượng: sử dụng == , != so sánh giá trị của biến ở stack (địa chỉ)
	 				   : 100 % thừa kế từ Class Object (có hàm #equals)
	 				   ==> sử dụng hàm equals mặc định -- so sánh ở stack 
	 				   : nếu muốn so sánh giá trị của đối tượng ở heap -- > override hàm equals
	 				   
	 */
	
	public static void main(String[] args) {
		Iteam i1 = new Iteam();
		Iteam i2 = new Iteam();
		
		Iteam i3 = new Iteam(88,"Iteam 88");
		Iteam i4 = new Iteam(66,"Iteam 66");
		Iteam i5 = new Iteam(88,"Iteam 88");
		
		System.out.println(" ============= Toán tử '=='===== ");
		
		System.out.println("i1 == i2 --> " + (i1==i2) ); // F
		System.out.println("i3 == i4 --> " + (i3==i4) ); // F
		System.out.println("i3 == i5 --> " + (i3==i5) ); // F
		// Object #equals --> == 
		// Expect: 2 đối tượng Item 
		System.out.println(" ============= Hàm 'equals'===== ");
		
		System.out.println("i1 eq i2 --> " + (i1.equals(i2)) ); //F
		System.out.println("i3 eq i4 --> " + (i3.equals(i4)) ); //F
		System.out.println("i3 eq i5 --> " + (i3.equals(i5)) ); //F
		// Thông thường sử dụng equals để so sánh 2 đối 
		System.out.println("/n");
		
		String s1 = "hello";
		String s2 = "bye";
		String s3 = "glass";
		String s4 = "hello";
		System.out.println("s1 == s2 --> " + (s1==s2) ); //f
		System.out.println("s1 == s3 --> " + (s1==s3) ); //f
		System.out.println("s1 == s4 --> " + (s1==s4) ); //t
		
		System.out.println("s1 eq s2 --> " + (s1.equals(s2)) ); //F
		System.out.println("s1 eq s3 --> " + (s1.equals(s3)) ); //F
		System.out.println("s1 eq s4 --> " + (s1.equals(s4)) ); //F
		System.out.println("\n");
		System.out.println("=====Comparable=====");
		System.out.println("s1 > s2 ? " + s1.compareTo(s2));
		System.out.println("s1 > s3 ? " + s1.compareTo(s3));
		System.out.println("s1 > s4 ? " + s1.compareTo(s4));
	}

}
