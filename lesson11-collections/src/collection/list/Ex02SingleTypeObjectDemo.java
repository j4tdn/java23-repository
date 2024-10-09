package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

// SOT: Single Type Object: Integer, String, Double, LocalDate
public class Ex02SingleTypeObjectDemo {

	public static void main(String[] args) {
		
		// khởi tạo, thêm, sửa, xóa, lấy ra, sử dụng, sắp xếp, in ra ...
		
		// Khởi tạo một danh sách rỗng
		List<String> elements = new ArrayList<>(); // Object[] elementData
		
		elements.add("A92"); // thêm vào vị trí cuối cùng của danh sách
		elements.add("B42");
		elements.add("Z15");
		elements.add("T86");
		
		elements.add(0, "K7");
		elements.add(3, "X3");
		
		elements.set(2, "N2");
		
		// xóa phần tử có giá trị là T87
		// Kiểm tra trong List<T> nếu có phần tử T87 thì xóa, không thì thôi
		elements.remove("T87");
		
		// xóa những từ có ký tự cuỗi cùng là số và lớn hơn 5
		// ConcurrentModificationException
		// Vì elements vừa sửa dụng để for, trong lúc for vừa remove
		// --> có thể chưa duyệt đến thì phần tử thứ i đã bị xóa
		// Sửa lỗi này: đảm bảo là duyện đến phần tử thứ i mới được phép xóa pt thứ i hoặc < i
		// duyệt đồng bộ: synchronous	  : duyệ đến i mới sử dụng được i: Iterable#iterate
		// duyệt bất đồng bộ: asynchronous: duyệt i dùng i+ i- đều được  : for-each, for-index

		//	for(String element : elements) {
		//	char lastLetter = element.charAt(element.length() - 1) ;
		//	if(Character.isDigit(lastLetter) && Integer.parseInt(String.valueOf(lastLetter)) > 5) {
		//		elements.remove(element);
		//		}
		//	}
		
//		Iterator<String> iterator = elements.iterator();
//		while(iterator.hasNext()) {
//			String element = iterator.next();
//			char lastLetter = element.charAt(element.length() - 1) ;
//			if(Character.isDigit(lastLetter) && Integer.parseInt(String.valueOf(lastLetter)) > 5) {
//				iterator.remove();
//			}
//			
//		}
		
		elements.removeIf(element -> { 
			char lastLetter = element.charAt(element.length() - 1) ;
			return Character.isDigit(lastLetter) 
						&& Integer.parseInt(String.valueOf(lastLetter)) > 4;
		});
		
		System.out.println("Size: " + elements.size()); // phân biệt size và length
		
		// in ra danh sách
		// for-index
//		for(int i = 0; i < elements.size(); i++) {
//			System.out.println(elements.get(i));
//		}
		
		// forEach có sẵn trong List --> strategy pattern
		System.out.print("elements: ");
		elements.forEach(seq -> System.out.print(seq + " "));
		
		System.out.println("\n\n");
		
		// copy danh sách từ elements sang words
		List<String> words = new ArrayList<>(elements);
		// List<String> words = elements;
		System.out.print("words: ");
		words.forEach(word -> System.out.print(word + " "));
		
	}
	
}
