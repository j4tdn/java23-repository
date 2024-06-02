package view;

import bean.Item;

public class Ex01Final {
	public static void main(String[] args) {
		// Biến --> kdl nguyên thủy --> để cập nhật giá trị sử dụng toán tử =(luôn hoạt động ở stack)
		//final --> final ở stack 
		//		--> khi 1 biến có từ khóa final --> không thể gián lại giá trị cho nó ở stack
		//										-->không thể dùng toán tử =
		int a =5;
		int b = 7;
		b=10;
		a=b;
		// 			kdl đối tượng
		// để cập nhật giá trị
		//--> cách 1: sử dụng toán tử = để cập nhật đia chỉ mà biến đang trỏ đến
		//--> cách 2: cập nhật giấ trị thuộc tính của đối tượng ở HEAP mà biến đang trỏ đến
		Item item1 =new Item (1,'A',120);
		Item item2 =new Item(2,'B',240);
		
		item1 =item2;//item1(h2),item2(h2)
		item1.salePrice =222;
	}
}
