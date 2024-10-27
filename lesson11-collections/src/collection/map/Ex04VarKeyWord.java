package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Item;

public class Ex04VarKeyWord {
	
	public static void main(String[] args) {
		// A a1 = new B();
		// Biến a1
		// Lúc compile --> KDL A
		// Lúc runtime --> KDL B
		
		// Từ Java10 --> Hỗ trợ từ khoá var giúp KDL khai báo ngắn gọn hơn
		// BIến a1
		// Lúc compile và runtime
		// Biến a1 phải dựa vào phần BP, giá trị để xác định KDL của nó
		// var a1 = new B();
		
		Item item1 = new Item();
		var item2 = new Item();
		
		List<Integer> list1 = new ArrayList<>();
		var list2 = new ArrayList<>();
		var list3 = new ArrayList<Integer>();
		
		Integer x1 = null;
//		var x2 = null; // cnull chưa thể xác định được kdl
		Comparator<String> comp1 = (s1, s2) -> s1.compareTo(s2);
		// var comp2 = (s1, s2) -> s1.compareTo(s2);
		// Sử dụng var khi biết KDL giá trị của biến lúc compile là gì rồi
	}
	
}
