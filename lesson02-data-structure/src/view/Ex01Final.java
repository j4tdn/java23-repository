package view;

import bean.Item;

public class Ex01Final {
	public static void main(String[] args) {
	// Final --> Final ở Stack
	//		--> Khi 1 biến có từ khóa final --> ko thể gán lại giá trị cho nó ở STACK
	//										--> ko thể dùng toán từ =
	// Biến --> KDL nguyên thủy
	// Để cập nhập giá trị --> sử dụng toán tử =
	int a = 5;
	final int b = 7;
	//b = 10;
	a = b;
	
	// Biến --> KDL đối tượng
	// Để cập nhập giá trị 
	// -->cách 1: sử dụng toán tử = để cập nhập địa chỉ mà biến đang trỏ đến
	// --? cách 2: cập nhập giá trị của thuộc tính của đối tượng ở HEAP mà biến đang trỏ đến
	final Item item1 = new Item(1, 'A', 120); //H1
	final Item item2 = new Item(2, 'B', 240); //H2
	
	//item1 = item2;// item1(H2), item2(H2)
	item1.salesPrice = 222;
	}
}
