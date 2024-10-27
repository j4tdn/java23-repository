package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.CollectionUtils.*;

public class Ex04InitialList {
	public static void main(String[] args) {
		// Các cách tạo ra List<T>

		// C1:
		// return 1 danh sách có dynamic size
		// hỗ trợ thêm sửa xoá
		List<String> list1 = new ArrayList<>();
		list1.add("a1");
		list1.add("a2");

		// C2: Arrays.asList
		// return 1 danh sách fixed size
		// 0 hỗ trợ thêm xoá
		// get-set
		List<String> list2 = Arrays.asList("a2", "b2", "c3");
//		list2.add("ad"); -> ko được hỗ trợ

		// C3: List.of
		// return về 1 immutable list, yêu cầu các ptu !null
		// không hỗ trợ thêm/sửa/xoá
		// hỗ trợ get
		List<String> list3 = List.of("a3", "b3", "c3");
		
		generate("list1", list1);

		generate("list2", list2);

		generate("list3", list3);
	}
}
