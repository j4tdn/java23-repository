package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex04InitialList {

	public static void main(String[] args) {
		// Các cách để tạo ra List<T>

		// Cách 1:
		// return về 1 danh sách với dynamic size(số lượng vô hạn)
		// hỗ trợ thêm sửa xóa thoải mái
		List<String> list1 = new ArrayList<>();
		System.out.println("list1(runtime) --> " + list1.getClass());

		list1.add("a1");
		list1.add("b1");

		// Cách 2: Arrays.asList
		// return về 1 danh sách với fixed size, có thể null
		// số lượng cố định,k hỗ trợ thêm và xóa
		List<String> list2 = Arrays.asList("a2", "b2", "c2", null);
		System.out.println("list2(runtime) -->" + list2.getClass());
		// list2.add("d2"); // bị lỗi error UnsupportedOperationException

		// Cách 3: List.of
		// return về 1 immutable list(bất biến ở HEAP), yêu cầu các phần tử phải khác
		// null
		// K hỗ trợ thêm/sửa/xóa
		// hỗ trợ get
		List<String> list3 = List.of("a3", "b3", "c3", "d3" /* null */ );
		System.out.println("list3(runtime) --> " + list3.getClass());
//		list3.set(1, "b33");  errors -> UnsupportedOperationException

		System.out.println("\n===========================\n");
		generateStrings("list1", list1);
		generateStrings("list2", list2);
		generateStrings("list3", list3);
	}
}
