package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// SOT: Single Type Object: Integer, String, Double, LocalDate
public class Ex02SingleTypeObjectDemo {
	public static void main(String[] args) {
		
		// Khởi tạo, thêm, sửa, xoá, lấy ra, sắp xếp, in ra ...
		
		
		// Khởi tạo một danh sách rỗng
		List<String> elements = new ArrayList<>(); // Object[] elemetData
		
		elements.add("A92"); // thêm vào vị trí cuối cùng của danh sách
		elements.add("B42");
		elements.add("Z15");
		elements.add("T86");
		
		elements.add(0, "K7");
		elements.add(3, "X3");
		
		
		elements.set(2, "N2");
		
		// xoá phần tử có giá trị là "T86"
		elements.remove("T87"); // Kiểm tra trong List<T> nếu có phần tử T87 nó sẽ xoá, còn khong thì thoi
		
		// Xoá những từ mà kí tự cuối cùng là số và lớn hơn 5
		/*
		 * for (String element: elements) { char lastOne =
		 * element.charAt(element.length() - 1); if () }
		 */	
		
		
		System.out.println("X3 contains --> " + elements.contains("X3z"));
		
		
		System.out.println("size: " + elements.size()); // phân biệt size và length
		
		// in ra danh sách
		// for-each, for-index
		//for (int i = 0; i < elements.size();i++) {
		//	System.out.println(elements.get(i));
		//}
		
		System.out.println("\n\n");
		// forEach có sẵn trong List --> strategy pattern
		System.out.println("elements: ");
		elements.forEach(seq-> System.out.print(seq + " "));
		
		System.out.println("\n\n");
		
		// copy danh sách từ elements sang words
		List<String> words = new ArrayList<>(elements); //
		// List<String> words = elements; 
		System.out.println("words: ");
		words.forEach(word -> System.out.println(word + " "));
		
	}

}
