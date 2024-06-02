package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {

	public static void main(String[] args) {

//		primitive: int,double,char...
		int a = 5;
		double b = 7;

//		object: type
//		custom: Item, Employee,Store..
//		available: Integer, Double, Character, String, BigDecimal

//		Item item1 = 1,'A',11; -->error
		Item item1 = new Item(1, 'A', 11);
		System.out.println(item1);

//	có 1 thuộc tính là số nguyên
		Integer i1 = new Integer(22);
		Integer i2 = 44;
		// sự khác nhau:

//	có 1 thuộc tính là số thực 
		Double d1 = new Double(55d);

//	có 1 thuộc tính là chuỗi 
		String s1 = new String("Hello");
		String s2 = new String("xin chao");
		String s3 = new String("Hello");

		String x1 = "java";
		String x2 = "php";
		String x3 = "java";

		System.out.println("i1 -->" + i1);
		System.out.println("d1 -->" + d1);
		System.out.println("s1 -->" + s1);

		/*
		 * Với KDL đối tượng
		 * 
		 * 1: do mình tạo ra: -->để khởi tạo 1 đối tượng,luôn gọi hàm khởi tạo,sử dụng
		 * từ khóa new
		 * 
		 * 2.Có sẵn của Java:Integer,Double,Long,String,Character,Boolean,Byte... -->Lưu
		 * ý:các class này,class của nó chỉ có 1 thuộc tính duy nhất. --> Có 2 cách:
		 * +Gọi hàm khởi tạo,dùng từ khóa new -->Lưu trữ ở vùng nhớ HEAP -->Luôn tạo ra
		 * ô nhớ mới +Gán giá trị trực tiếp cho biến KDL đối tượng --> Lưu trữ ở vùng
		 * nhớ HEAP --> constant pool(nơi chứa immutable Object) --> Kiểm tra giá trị
		 * cần gán có ở constant pool hay chưa +Nếu có rồi --> lấy biến trỏ đến ô nhớ đã
		 * có + Nếu chưa --> tạo ô nhớ mới và lấy biến trỏ đến ô nhớ mới đó.
		 * 
		 * 
		 */

	}

}
