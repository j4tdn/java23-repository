package collection.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class Ex06ArrayListPrinciple {
	public static void main(String[] args) {
		/*
		 * Cơ chế của class ArrayList
		 * 
		 * + Arraylist là 1 class ở Java
		 * + Sử dụng cơ chế Array và các ahfm xử lý
		 * + Có 1 thuộc tính Object[] elementData
		 */

		Item item1 = new Item(1, "A1", 35d);
		Item item2 = new Item(2, "A2", 22d);
		// B1: khởi tạo arrayList qua constructor rỗng.
		// Tạo ra 1 ô nhớ ở HEAP
		// Ô nhớ có tt elementData={}

		List<Item> items = new ArrayList<>();
		
		// B2: thêm mới 1 ptu

		// Trong lần đầu
		// Tạo elementData mảng 10 ptu
		// Đưa ptu đầu tiên vào
		// tăng size
		items.add(item1);

		// Khi add tiếp
		// Kiểm tra size đã vượt qua length
		// nếu vượt -> grow
		items.add(item2);

		// nếu hơn 10
		// size: số lượng phần tử của ArrayList
		// length (capacity): sức chứa của ArrayList (default 10)
		// cứ 1 lần add mới nếu size = capa -> grow

		// new ArrayList -> tạo 1 mảng rỗng -> default 10;
		List<String> x = new ArrayList<String>();

		// new ArrayList<>(8) -> tạo 1 mảng gồm 8 pt
		// khi biết được tối đa = bao nhiêu
		// -> tạo duy nhất 1, khỏi cần grow, copy
		List<String> elements = new ArrayList<String>(8);
	}
}
