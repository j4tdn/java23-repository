package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01ListRawType {
	
	// Java Compiler: Kiểm tra code tại compile: .java --> bytecode
	// Java Build Path: Chuyển đổi từ bytecode sang machine code(JRE, JVM)

	public static void main(String[] args) {
		// Lưu danh sách các phần tử là số nguyên
		
		// Từ version 1.0 đến 1.4
		// list1 có thể chứa bất kì kdl đối tượng nào
		List list1 = new ArrayList();
		list1.add(4);
		list1.add("five"); // could be runtime error
		list1.add(6);
		// hoạt động tốt ở compile
		// dễ bị lỗi tại runtime ClassCastException
		
		for(Object e1: list1) {
			System.out.println(Integer.parseInt(e1.toString()) * 2 + " ");
		}
		
		
		// Từ version 1.5 đến hiện tại
		// list2 chỉ chứa đc các phần tử là kiểu Integer
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		// list2.add("five"); compile error
		list2.add(6);
		for(Integer e2:list2) {
			System.out.println(e2 * 2 + " ");
		}
		
		System.out.println("\n\n");
		
		// Từ version 1.7
		List<Integer> list3 = new ArrayList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
	}
	
}
