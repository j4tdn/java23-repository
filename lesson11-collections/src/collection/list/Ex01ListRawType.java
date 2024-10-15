package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01ListRawType {
	
	public static void main (String[] args) {
		
		//từ v1.0 đến 1.4
		//list 1 có thể chứa bất kỳ kiểu dữ liệu nào 
		List list1 = new ArrayList();
		list1.add(4);
		list1.add("five");
		list1.add(6);
		for (Object e1 : list1) {
			System.out.println(Integer.parseInt(e1.toString())*2 + " ");
		}
		//từ v1.5 đến hiện tại 
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		for (Integer e2 : list2) {
			System.out.println(e2*2 + " ");
		}
		//từ v1.7
		List<Integer> list3 = new ArrayList<>();
		list3.add(4);
		list3.add(5);
		list3.add(6);
		for (Integer e3 : list3) {
			System.out.println(e3*2 + " ");
		}
		// list 2 và 3 chỉ có thể chứa các phần tử kiểu Integer 
		
		
	}
	
}
