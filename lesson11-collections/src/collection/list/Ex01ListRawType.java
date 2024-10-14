package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Ex01ListRawType {
  
	// Java Compiler: Kiểm tra code tại compile: .java --> bytecode
	// Java Build Path: Chuyển đổi từ 
	
	public static void main(String[] args) {
		// Lưu danh sách các phần tử là các số nguyên
		
		// Từ version 1.0 đến 1.4
        // list1 có thể chứa bất kỳ KDL đối tượng nào
		List list1 = new ArrayList();
		list1.add(4);
		list1.add("five");
		list1.add(6);
            // Hoạt động tốt ở compile 
		   // dễ bị lỗi tại runtime ClassCastException
		
//		for(Object o1:list1) {
//			System.out.println(Integer.parseInt(o1.toString()) * 2 + " "); // bị lỗi về KDL 
//		}
		
// ===============================================================//
		
		// Từ version 1.5 đến hiện tại 
        // list2 chỉ chứa được các phần tử là Integer
		List<Integer> list2 = new ArrayList<Integer>();
             list2.add(5);
//           list2.add("five");  compile error
             list2.add(6);
             for(Integer e1:list2) {
     			System.out.print(e1 * 2 + " ");
             }
//===================================================================//
		System.out.println("\n");

		// Từ version 1.7
		List<Integer> list3 = new ArrayList<>();
		     list3.add(2);
		     list3.add(7);
		     for(Integer e2:list3) {
	     			System.out.print(e2 * 2 + " ");
	}
	}	
	}
