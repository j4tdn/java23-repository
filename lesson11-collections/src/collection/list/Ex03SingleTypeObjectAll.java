package collection.list;

import java.util.ArrayList;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex03SingleTypeObjectAll {
	
	public static void main (String [] args) {
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		
		generate("list1", list1);
		generate("list2", list2);
		
		List<Integer> list3 = new ArrayList<>();		
		list3.addAll(list2);
		generate("list3", list3);
		
		List<Integer> list4 = new ArrayList<>();
		list4.retainAll(list1);
		generate("list4", list4);
		
		List<Integer> list5 = new ArrayList<>();
		list5.removeAll(list2);
		generate("list5", list5);
	}
	
}
