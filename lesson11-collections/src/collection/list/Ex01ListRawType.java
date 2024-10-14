package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01ListRawType {
	// Java Compiler : kiểm tra code tại compile 
	public static void main(String[] args) {
		// tu  version 1.0 -> 1.4
		
		List list1 = new ArrayList();
		list1.add(4);
		//list1.add("five");
		list1.add(6);
		for(Object e1 : list1) {
			System.out.println(Integer.parseInt(e1.toString()) * 2 + " ");
		}
		System.out.println("\n\n");
		// hoạt động tốt ở compile
		// dễ bị báo lỗi ở runtime ClassCastException
		
		// version 1.5 -> now
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		// list2.add("five"); compile error
		list2.add(6);
		
		for(Object e1 : list1) {
			System.out.println(Integer.parseInt(e1.toString()) * 2 + " ");
		}
		System.out.println("\n\n");
		
		// version 1.7
		List<Integer> list3 = new ArrayList();
		list3.add(4);
		list3.add(5);
		list3.add(6);
		
		for(Object e1 : list1) {
			System.out.println(Integer.parseInt(e1.toString()) * 2 + " ");
		}
		System.out.println("\n\n");
	}
}
