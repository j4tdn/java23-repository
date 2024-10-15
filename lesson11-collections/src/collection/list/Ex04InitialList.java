package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex04InitialList {
	
	public static void main (String[] args) {
		//Các cách tạp ra list<T>
		List<String> list1 = new ArrayList <>();
		list1.add("a1");
		list1.add("b1");
		System.out.println("list3(runtime) -->" + list1.getClass());
		//cách 1: new Arratlist
		//return về một danh sách với dynamic size 
		//hỗ trợ thêm xoá thoải mái 
		
		//Cách 2: Arays.asList
		//return về 1 fixed size list 
		//không hỗ trợ thêm sửa xoá 
		
		List<String> list2 = Arrays.asList("a2", "b2", "c2");
		System.out.println("list3(runtime) -->" + list2.getClass());

		//cách 3: List.of 
		//return về một imutable list, yêu cầu các phần tử phải khác null 
		//không hỗ trợ thêm, sửa, xoá
		List<String> list3 = List.of("a3", "b3", "c3");
		System.out.println("list3(runtime) -->" + list3.getClass());
		
		System.out.println("\n===================================\n");
		
		generateString("list1", list1);
		generateString("list2", list2);
		generateString("list3", list3);
		
	}
	
}