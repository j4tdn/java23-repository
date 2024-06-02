package view;

import bean.Item;

public class Ex01Final {

	public static void main(String[] args) {
//		Biến -->KDL nguyên thủy
//		Để cập nhật giá trị --> sử dụng toán tử =
//		Toán từ = hoạt động ở stack
//		Final --> Final ở stack
//		          khi 1 biến có từ khóa final vào --> ko thể gán lại giá trị cho nó ở stack
//		          ko thể dùng toán từ =

		int a = 5;
		final int b = 7;
//		b = 10;
		a = b;

//		Biến --> KDL đối tượng, lưu ở HEAP, có thể thay đổi giá trị kể cả khi thêm final
//		final ở kdl đối tượng ko thể thay đổi giá trị khi toán từ =,mà có thể thay đổi giá trị ở HEAP
//		Để cập nhật giá trị 
//		--> Cách 1: sử dụng toán tử = để cập nhật địa chỉ mà biến đang trỏ đến
//		--> Cách 2: cập nhật giá trị thuộc tính của đối tượng ở HEAP mà biến đang trỏ đến
		final Item item1 = new Item(1, 'A', 120); // Ô nhớ H1
		final Item item2 = new Item(2, 'B', 240); // Ô nhớ H1

//	    item1 = item2;  //item1(H2)  item2(H2)
		item1.SalesPrice = 222;
		System.out.println("i1 ------>" + item1);
	}
}
