package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Item;

public class Ex04VarKeyWord {
           
	public static void main(String[] args) {
		Item item1 = new Item();
		var item2 = new Item();
		
		List<Integer> list1 = new ArrayList<>();
		var list2 = new ArrayList<>(); // default Object
		var list3 = new ArrayList<Integer>();
		
		Integer x1 = null;
//		var x2 = null; // null chưa thể xác định được KDL nên k dùng var
		
		Comparator<String> comp1 = (s1,s2) -> s1.compareTo(s2);
//	 var comp2 = (s1,s2) -> s1.compareTo(s2);  k dùng được var vì vế bên phải chưa xác định được KDL
		
		
		
	}
	
}
