package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Item;

public class Ex04VarKeyWord {

	public static void main(String[] args) {
		
		
		// từ java 10 trở đi -> hỗ trợ từ khóa var giúp khai báo KDL gọn hơn
		// lúc compile và runtime
		// -> biến a1 dựa vào phần bên phải để xác định kiểu dl
		
		Item i1 = new Item();
		var i2 = new Item();
		
		List<Integer> list1 = new ArrayList<>();
		var list2 = new ArrayList<>(); // default object
		var list3 = new ArrayList<Integer>();
		
		Integer x1 = null;
		// var x2 = null; // null ko thẻ xđ KDL
		
		Comparator<String> comp1 = (s1, s2) -> s1.compareTo(s2);
		// var comp2 = (s1, s2) -> s1.compareTo(s2);
		
		// Sử dụng var khi biết KDL, giá trị của biến lúc compile là gì rồi
		
	}
	
}
