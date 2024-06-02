package view;

import bean.Item;

public class Ex01Final {
	//Biến --> KDL Nguyên thuỷ
	//Để cập nhập giá trị -> toán tử '='
	//int a = 5; 
	//int b = 7;
	//a = b
	//final int b = 5; -> không thể thay đổi KDL nguyên thuỷ
	
	//Biến --> KDL đối tượng
	//Để cập nhập giá trị: 
	//1. Sử dụng toán tử '=' để cập nhập địa chỉ mà biến đang trỏ đến
	//item1 = item2
	//2. Cập nhập giá trị của đối tượng ở HEAP mà biến đang trỏ đến.
	public static void main(String[] args) {
		//Biến --> KDL đối tượng
		//Để cập nhập giá trị: 
		final Item item1 = new Item(1,"ABC", 3d);
		final Item item2 = new Item(2,"BCD",4d);
		//1. Sử dụng toán tử '=' để cập nhập địa chỉ mà biến đang trỏ đến (final ko được)
		//item1 = item2 (item1 -> H2) 
		//2. Cập nhập giá trị của đối tượng ở HEAP mà biến đang trỏ đến. (final vẫn được)
		item1.salesPrice = 333;
		//item
	}
	
}
