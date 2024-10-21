package collection.list;

import java.util.ArrayList;
import java.util.List;

import static utils.CollectionUtils.*;

public class Ex03SingleTypeObjectAll {

	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(1, 2, 3, 4, 5);
		
		List<Integer> list2 = List.of(4, 5, 6, 7, 8);
		
		generate("List 1", list1);
		generate("List 2", list2);
		
		List<Integer> list3 = new ArrayList<>(list1);
		list3.addAll(list2);
		generate("Kết quả HỢP 2 danh sách ", list3);
		
		List<Integer> list4 = new ArrayList<>(list1);
		list4.retainAll(list2);
		generate("Kết quả GIAO 2 danh sách ", list4);
		
		List<Integer> list5 = new ArrayList<>(list1);
		list5.removeAll(list2);
		generate("Kết quả HIỆU 2 danh sách ", list5);
		
	}
	
}
