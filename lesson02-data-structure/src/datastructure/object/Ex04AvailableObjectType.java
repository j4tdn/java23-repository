package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {

	public static void main(String[] args) {
		
		//primitive: int, double, char...
		int a = 5;
		double b = 7;
		
		//object type
		//custom: Item, Employee, Store...
		//avaiable: Integer, Double, Character, String, BigDecimal
		
		Item item1 = new Item(1,'A',11);
		
		//class Integer co 1 thuoc tinh(so nguyen)
		// @deprecated
		Integer i1 = new Integer(22);
		Integer i2 = 44;
		
		//class Double co 1 thuoc tinh(so thuc)
		Double d1 = new Double(44);
		Double d2 = 88d;
		
		//class String co 1 thuoc tinh(chuoi)
		String s1 = new String("hello");  //H1
		String s2 = new String("xin chao");//H2
		String s3 = new String("hello");   //H3
		
		String x1 = "java";  //H5
		String x2 = "php";   //H6
		String x3 = "java";  //H5
		x3 = "spring";
		
		String x4 = null;
		
		/*
		 Integer, Double, String --> Immutable class
		 --> 1 thuoc tinh
		 HEAP(constant pool)
		 Immutable class: la class o do khi tao ra 1 doi tuong, o nho HEAP ben trong o nho do chua gia tri cua cac thuoc tinh ma
		 ko the cap nhat gia tri thuoc tinh trong o nho do duoc
		 
		 Item --> Mutable class
		 --> 1 hoac n thuoc tinh
		 HEAP
		 Muon 1 class tu Mutable -> Immutable
		 1 --> Cho cac thuoc tinh co access modifier: private
		 2 --> Them tu khoa final de ko the cap nhat gia tri
		  
		 */
		
		System.out.println("i1 --> "+ i1);
		System.out.println("d1 --> "+ d1);
		System.out.println("s1 --> "+ s1);
	}
	
	/* 
	  Voi KDL doi tuong
	  1. Do minh tu tao ra
	  --> De  khoi tao 1 doi tuong, luon goi ham khoi tao, su dung tu khoa new
	  2. Co san cua Java: Integer, Double, Long, String, Charater, Boolean, Bye...
	  --> Luu y: Cac class nay, class cua no chi co duy nhat 1 thuoc tinh
	  --> Co 2 cach
	    + Goi ham khoi tao, su dung tu khoa new
	      --> Luon tao ra o nho moi
	      --> Luu tru o vung nho HEAP
	    + Gan gia tri truc tiep cho bien KDL doi tuong	
	      --> Luu tru o vung nho HEAP --> constant pool(noi chua nhung immutable objects)
	      --> Kiem tra xem gia tri can gan da chua trong constant pool chua
	         + Neu co roi --> Lay bien tro den o nho da co
	         + Neu chua co --> Tao o nho moi va lay bien tro den o nho do
	 
	 */
}
