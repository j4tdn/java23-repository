package view;

import bean.Item;

public class EX01final {
	

	public static void main(String[] args) {
		// biến --kdl nguyên thủy cập nhật giá trịowr stack 
		// khi 1 biến có từ khóa final 
		// --> không thể gán lại cho nó ở stack
		// --> không thể dùng toán tử
		int a = 5;
		int b = 7;
		b = 10 ;
		a = b;
		
		// biến kdl đối tượng
		// để cập nhật giá trị
		// --> cách 1 : sử dụng toán tử = để cập nhật địa chỉ mà biến đang tro đến
		// --> cách 2 : cập nhật giá trị cuẩ thuộc tính của head mà bien tro den đang trỏ
		final Item item1 = new Item(1 , 'A' , 120);
		final Item item2 = new Item(2 , 'B' , 240);
		
		// item1 = item2 ; item1(h2) , item2(h2)
		item1.salesPrice = 222;
				
	}

}
