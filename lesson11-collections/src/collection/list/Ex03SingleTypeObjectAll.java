package collection.list;

import java.util.ArrayList;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex03SingleTypeObjectAll {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1, 2, 3, 4, 5);
		
		List<Integer> list2 = List.of(4, 5, 6, 7, 8);
		
		generateIn("list1", list1);
		generateIn("list2", list2);
		
		List<Integer> list3 = new ArrayList<Integer>(list1);
		list3.addAll(list2);
		generateIn("Ket qua HOP 2 danh sach", list3);
		
		List<Integer> list4 = new ArrayList<Integer>(list1);
		list4.retainAll(list2);
		generateIn("Ket qua GIAO 2 danh sach", list4);
		
		List<Integer> list5 = new ArrayList<Integer>(list1);
		list5.removeAll(list2);
		generateIn("Ket qua HIEU 2 danh sach", list5);
	}
}
