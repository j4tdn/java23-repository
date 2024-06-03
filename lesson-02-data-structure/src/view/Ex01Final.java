package view;

import bean.Item;

public class Ex01Final {
	public static void main(String[] args) {
		// final k cho phép cập nhật giá trị ở vùng nhớ STACK
		// Toán tử = hoạt động ở STACK
		// Final --> Final ở STACK
				// --> khi 1 biến có từ khoá final --> ko thể gán lại giá trị cho nó ở STACK
												  //--> k thể dùng toán tử =
		// Biến -> KDL nguyên thuỷ 
		// Để cập nhật giá trị --> sử dụng toán tử =
		int a = 5;
		final int b = 7;
		//b = 10;
		a = b;
		
		// Biến --> KDL đối tượng
		// Để cập nhật giá trị
		// --> cách 1: sử dụng toán tử = để cập nhật địa chỉ mà biến đang trỏ đến
		final Item item1 = new Item(1, 'A', 120); // H1
		final Item item2 = new Item(2, 'B', 240);
//		item1 = item2; 
		item1.salesPrice = 222;
	}
}
