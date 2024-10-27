package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex04InitialList {

	public static void main(String[] args) {
		// Các cách tạo ra List
		
		// Cách 1:
		// new ArrayList<>()
		// -> return về 1 danh sách với dynamic size
		// -> hỗ trợ thêm, sửa, xóa thỏa mái
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		
		System.out.println("list1 (runtime) --> " + list1.getClass());
		
		// Cách 2: Arrays.asList
		// -> return về 1 danh sách với fixed size
		// -> Không hỗ trợ thêm, xóa
		// -> Vẫn hỗ trợ get, set
		List<String> list2 = Arrays.asList("a2", "b2", null, "c2");
		System.out.println("list2 (runtime) --> " + list2.getClass());
		// list2.add("d2"); // ko hỗ trợ
		list2.set(0, "a20");
		
		// Cách 3: List.of
		// -> return về 1 immutable list, yêu cầu các phần tử khác null
		// -> không hỗ trợ thêm, sửa, xóa
		// -> hỗ trợ get
		List<String> list3 = List.of("a3", "b3", "c3", "d3");
		System.out.println("list3 (runtime) --> " + list3.getClass());
		// list3.set(1, "b33");   // ko hỗ trợ
		
		System.out.println("\n==========================\n");
		
		generate("list1 (new ArrayList)", list1);
		generate("list2 (Arrays.asList)", list2);
		generate("list3 (Arrays.asList)", list3);
	}
}
