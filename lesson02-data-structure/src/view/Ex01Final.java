package view;

import bean.Item;

public class Ex01Final {
	public static void main(String[] args) {
		// Toán tử  = hoạt động ở STACK 
		// Final --> Final ở Stack 
		// khi có biến final --> k thể gan lại giá trị
		
		// Biến --> KDL nguyên thủy 
		// Để cập nhật giá trị --> sử dụng toán tử = 
		int a = 5;
		int b = 7;
		a = 10;
		a = b;
		// Biến --> KDl đối tượng 
		// Để cập nhật giá trị 
		
		Item item1 = new Item(1, 'A', 120);
		Item item2 = new Item(2, 'B', 240);
		// cách 1 sử dụng toán tử = để cập nhật giá trị mà biến đang trỏ đến 
		item1 = item2;
		// cách 2 : cập nhật giá trị thuộc tính của đối tượng ở HEAP mà biến đang trỏ đến 
		item1.salesPrice = 222;
	}
}
