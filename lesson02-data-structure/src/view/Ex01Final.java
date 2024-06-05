package view;

import bean.Item;

public class Ex01Final {

	public static void main(String[] args) {
		// Toán tử = hoạt động ở -->STACK
		//Final -->Final ở STACK
		//		--> Khi 1 biến có từ khóa Final --> không thể gán lại giá trị cho nó ở STACK
		//										--> không thể dùng toán từ =
		
		// Biến --> KDL nguyên thủy
		// Để cập nhập giá trị --> sừ dụng toán tử =
		int a = 5;
		final int b = 7;
		//b = 10;
		a = b;
		
		
		//Biến --> KDL đối tượng
		//Để cập nhập giá trị
		//-->Cách 1 : sử dụng toán tử = để cập nhập địa chỉ mà biến đang trỏ đến
		//-->Cách 2 : cập nhập giá trị thuộc tính của đối tượng ở HEAP mà biến đang trỏ đến
		final Item item1 = new Item(1, 'A', 120);
		final Item item2 = new Item(2, 'A', 240);

		//item1 =item2; // item1(H2), item2(H2)
		item1.salesPrice = 222;
	}
}
