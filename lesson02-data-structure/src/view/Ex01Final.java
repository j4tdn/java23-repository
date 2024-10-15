package view;

import bean.Item;

public class Ex01Final {
	public static void main(String[] args) {
		//toán tử = hoạt động ở  -->stack
		//final -->final stack
		//--> ko thẻ gán lại giá trị  cho nó ở stack
		//biến -->KDL nguyên thủy
		//Để cập nhật giá trị -->sử dụng toán tử =
		int a=5;
		final int b=7;
		//b=10;
		a=b;
		//biến  --> KDL đối tượng
		//để cập nhật giá trị
		// cánh 1 sử dụng toán tử = để cập nhật địa chỉ mà biến đang trỏ đến
		//cách 2 cập nhật giá trị của thuộc tính đối tượng ở heap mà biến ddanng trỏ đến
		Item item1 = new Item(1,'A',120);
		final Item item2 = new Item(2,'B',240);
		
		item1 = item2;
		item1.salesPrice= 222;
	}
}
