package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.CollectionUtils.*;

public class Ex04InitialList {
	public static void main(String[] args) {
		// Các cách để tạo ra List<T>
		
		// Cách 1 new ArrayList
		// return về 1 danh sách với dynamic size 
		// hỗ trợ thêm sửa xoá thoải mái
		List<String> list1 = new ArrayList<>();
		System.out.println("list1(runtime) --> " + list1.getClass());
		list1.add("a1");
		list1.add("b1");
		
		
		
		// Cách 2: Arrays.asList
		// return về 1 danh sách với fixed size
		// không hỗ trợ thêm xoá
		// hỗ trợ: get/set
		
		List<String> list2 = Arrays.asList("a2", "b2", "c2");
		System.out.println("list2(runtime) --> " + list2.getClass());
		list2.add("d2");
		// list2.set(0, "a20"); UnsupportedOperationException
		// List<String> list2 = List.of(4, 5, 6, 7, 8);
		
		// Cách 3: List.of
		// return về 1 immutable list
		// không hỗ trợ thêm/ sửa/ xoá
		// hỗ trợ get
		List<String> list3 = List.of("a3", "b3");
		System.out.println("list3(runtime) --> " + list3.getClass());
		list3.set(1, "b33"); // UnsupportedOperationException
		
		System.out.println("\n==================\n");
		generateStrings("list1(newArrayList)", list1);
		generateStrings("list2(newArrayList)", list2);
		generateStrings("list3(newArrayList)", list3);
		
	}

}
