package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex04InitialList {

	public static void main(String[] args) {
		// Cac cach de tao ra List<T>
		
		// Cach 1: new ArrayList
		// return ve 1 danh sach voi dynamic size
		// ho tro them sua xoa thoai mai
		List<String> list1 = new ArrayList<>();
		list1.add("a1");
		list1.add("b1");
		
		// Cach 2: Array.asList
		// return ve 1 danh sach voi fixed size
		// khong ho tro them/xoa
		// ho tro get/set
		List<String> list2 = Arrays.asList("a2", "b2", null, "c2");
		System.out.println("list2(runtime) --> " + list2.getClass());
		// list2.add("d2"); // UnsupportedOperationException
		list2.set(0, "a20");
		
		// Cach 3: List.of
		// return ve 1 immuatable list, yeu cau cac phan tu !null
		// khog ho tro them/sua/xoa
		// ho tro get
		List<String> list3 = List.of("a3", "b3", "c3", "d3");
		System.out.println("list3(runtime) --> " + list3.getClass());
		// list3.set(1, "b33"); UnsupportedOperationException
		
		System.out.println("========================");
		
		generateString("list1(new ArrayList", list1);
		generateString("list2(Arrays.asList)", list2);
		generateString("list3(Arrays.asList)", list3);
	}
}
