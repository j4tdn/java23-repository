package collection.list;

import java.util.ArrayList;
import java.util.List;

//SOT: Single Type Object: Integer, String, Double, LocalDate...
public class Ex02SingleTypeObjectDemo {

	public static void main(String[] args) {
		
		// khởi tạo, thêm, sửa, xoá, lấy ra sử dụng, sắp xếp, in ra ...
		
		//khởi tạo 1 danh sách rỗng
		List<String> elements = new ArrayList<>(); // Object[] elementData
		
		elements.add("A92"); // thêm vào vị trí cuối cùng của danh sách
		elements.add("B42");
		elements.add("Z15");
		elements.add("T86");
		
		elements.add(0, "K7");
		elements.add(3, "X3");
		
		elements.set(2, "N2");
		
		// xoá phần tử có giá trị = T86
		 // kiểm tra trong List<T> nếu có phần tử T87 thì xoá, k thì thôi
		elements.remove("T87");
		
		// xoá những từ có kí tự cuối cùng là số và lớn hơn 5
		// ConCurrent ModificationException
		// vì elements vừa sử dụng để for trong lúc for vừa remove
		// --> có thể chưa duyệt đến phần tử thứ i đã bị xoá
		// Sửa lỗi : dảm bảo là duyệt đến phần tử thứ i mới được phép xoá pt thứ i hoặc < i
		// duyệt đồng bộ : synchronous : duyệt đến i mới sử dụng được i: Iterable#iterator
		// duyệt bất đồng bộ: asynchronous : duyệt i dùng i+ i- đều được : for-each, for-index

//		for (String element : elements) {
//			char lastOne = element.charAt(element.length() -1);
//			if (Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5) {
//				elements.remove(element);
//			}
//		}
		
		elements.removeIf(element -> {
			char lastOne = element.charAt(element.length() -1);
			return Character.isDigit(lastOne)
					&& Integer.parseInt(String.valueOf(lastOne)) > 5;
		});
		
//		for (int i = 0; i < elements.size(); i++) {
//			String s = elements.get(i);
//			if (Character.isDigit(s.charAt(s.length()-1)) && Integer.parseInt(String.valueOf(s.charAt(s.length()-1))) > 5) {
//				elements.remove(i);
//			}
//		}
		
		System.out.println("X3 contains --> " + elements.contains("X3"));
		
		System.out.println("size : " + elements.size());
		
		// in ra danh sách
		// for - each, for - index
//		for (int i = 0; i < elements.size(); i++) {
//			System.out.println(elements.get(i));
//		}
		
		// forEach có sẵn trong List --> strategy pattern
		elements.forEach((String seq) -> {
			System.out.println(seq);
		});

		elements.forEach((seq) -> System.out.print(seq + " "));
		
		System.out.println("\n\n");
		List<String> words = new ArrayList<>(elements); // copy danh sách từ elements sang words
		words.forEach((seq) -> System.out.print(seq + " "));


	}
}
