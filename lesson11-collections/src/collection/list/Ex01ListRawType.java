package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01ListRawType {
	
	// Java Compiler: Kiem tra code tai compile: .java --> bytecode
	// Java Build Path: Chuyen doi tu bytecode sang machine code(JRE, JVM)

	public static void main(String[] args) {
		// Luu danh sach cac phan tu la so nguyen
		
		// Tu version 1.0 -> 1.4
		// list 1 co the chua bat ky KDL doi tuong nao
		List list1 = new ArrayList();
		list1.add(4);
		//list1.add("five");
		list1.add(6);
		// hoat dong tot o compile
		// de bi loi tai runtime ClassCastException
		
		for(Object e1: list1)
			System.out.print(Integer.parseInt(e1.toString()) * 2 + " ");
		
		// Tu version 1.5 den hien tai
		// list2 chi chua cac phan tu la kieu Integer
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
	//	list2.add("five"); compile error 
		list2.add(6);
		
		for(Integer e2: list2)
			System.out.print(e2 * 2 + " ");
		
		// Tu version 1.7
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(4);
		list3.add(5);
		list3.add(6);
		
		for(Integer e3: list3)
			System.out.print(e3 * 2 + " ");
	}
}
