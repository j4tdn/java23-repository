package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static ultisl.CollectionUtils.*;
public class Ex04InittialList {
	public static void main(String[] args) {
		// các cách để tạo ra List<T>
		// Cách 1: new ArrayList
		// return về 1 danh sách với dynamic zize
		// hỗ trợ thêm sửa xóa thoải mái
		List<String> list1 = new ArrayList<>();
	    // Cách 2: Array.asList
		// return về 1 danh sách với fixedsize(cố định)
		// không hỗ trợ thêm xóa
		// hỗ trợ get set
		List<String> list2 = Arrays.asList("a" , "b" , "c");
		list2.add("a");
		
		// Cách 3 List.of
		// return về 1 immutable list, yêu cầu các ptu phaỉ Khác null
		// không hỗ trợ thêm xóa
		// hỗ trợ get
		List<String> list3 = List.of("a", "b", "c" , "s");
		System.out.println("list3(rumtime) --> " );
		
	}
}
