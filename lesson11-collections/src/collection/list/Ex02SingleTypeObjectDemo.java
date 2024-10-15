package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02SingleTypeObjectDemo {

	public static void main(String[] args) {
		// khởi tạo, thêm, sửa, xóa, lấy ra, sắp xếp, in ra,...
		
		// khởi tạo 1 danh sách rỗng
		List<String> elements = new ArrayList<>(); // Object[] elementData
		
		elements.add("A92"); // thêm vào vị trí cuối cùng của danh sách
		elements.add("B42");
		elements.add("Z15");
		elements.add("T86");
		
		elements.add(0, "K7");
		elements.add(3, "X3");
		
		elements.set(2, "N2");
		
		// xóa phần tử có giá trị là "T86"
		// kiểm tra trong List<T> nếu có thì xóa ko thì thôi
		elements.remove("T86");
		
		// xóa những từ mà có kí tự cuối cùng là số và lớn hơn 5
		// for (String element: elements) {
		//	char lastOne = element.charAt(element.length() - 1);
		//	if  (Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5) {
		//		elements.remove(element);
		//	}
		//}
		
		elements.removeIf(element -> {
	            char lastOne = element.charAt(element.length() - 1);
	            return Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > '5';
	        });
						
		System.out.println("size: " + elements.size()); // phân biệt size và length
		
		// in ra danh sách
		// for-each, for-index
		// for (int i = 0; i < elements.size(); i++) {
		// System.out.println(elements.get(i));
		// }
		
		// forEach có sẵn trong List --> strategy pattern
		System.out.println("\n\nelements: ");
		elements.forEach(seq -> System.out.println(seq + " "));
		
		System.out.println("\n\n");
		
		// copy danh sách từ elements sang words
		List<String> words = new ArrayList<>(elements);
		// List<String> words = elements;
		System.out.println("words: ");
		words.forEach(word -> System.out.println(word + " "));
	}
	
}
