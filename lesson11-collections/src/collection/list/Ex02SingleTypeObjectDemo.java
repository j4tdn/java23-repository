package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

// SOT: Single Type Object: Integer, String, Double, LocalDate ...
public class Ex02SingleTypeObjectDemo {
	
	public static void main(String[] args) {
		// khởi tạo, thêm, sửa, xóa, lấy ra sử dụng, sắp xếp, in ra ...
		
		// Khởi tạo một danh sách rỗng
		List<String> elements = new ArrayList<>(); // Object[] elementData
		
		elements.add("A92"); // thêm vào vị trí cuối cùng của danh sách
		elements.add("B42");
		elements.add("Z15");
		elements.add("T86");
		
		elements.add(0, "K7");
		elements.add(3, "X3");
		
		elements.set(2, "N2a");
		
		// xóa phần tử có giá trị là "T87"
		// Kiểm tra trong List<T> nếu có phần tử T87 thì nó sẽ xóa, ko thôi
		elements.remove("T87"); 
		
		// xóa những từ mà có kí từ cuối cùng là số và lớn hơn 5
		// ConcurrentModificationException
		// Vì elements vừa sử dụng để for trong lúc for vừa remove
		// --> có thể chưa duyệt đến thì phần tử thứ i đã bị xóa
		// Sửa lỗi này: đảm bảo là duyệt đến phần tử thứ i mới được phép xóa pt thứ i hoặc < i
		// duyệt đồng bộ: synchronous     : duyệt đến i mới sử dụng được i: Iterable#iterator
		// duyệt bất đồng bộ: asynchronous: duyệt i dùng i+ i- đều được   : for-each, for-index 
		// for (String element: elements) {
		//   	char lastOne = element.charAt(element.length() - 1);
		//	    if (Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5) {
		//		   elements.remove(element);
		//	    }
		// }
//		Iterator<String> iterator = elements.iterator();
//		while(iterator.hasNext()) {
//			String element = iterator.next();
//			char lastOne = element.charAt(element.length() - 1);
//			if (Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5) {
//				iterator.remove();
//			}
//		}
		
		elements.removeIf(element -> {
			char lastOne = element.charAt(element.length() - 1);
			return Character.isDigit(lastOne) 
						&& Integer.parseInt(String.valueOf(lastOne)) > 5;
		});
		
		System.out.println("X3 contains --> " + elements.contains("X3z"));
		
		System.out.println("size: " + elements.size()); // phân biệt size và length
		
		// in ra danh sách
		// for-each, for-index
		
		// for (int i = 0; i < elements.size(); i++) {
		//	System.out.println(elements.get(i));
		// }
		
		System.out.println("\n\n");
		
		// forEach có sẵn trong List --> strategy pattern
		System.out.print("elements: ");
		elements.forEach(seq -> System.out.print(seq + " "));
		
		System.out.println("\n\n");
		
		// copy danh sách tử elements sang words
		List<String> words = new ArrayList<>(elements);
		// List<String> words = elements;
		System.out.print("words: ");
		words.forEach(word -> System.out.print(word + " "));
	}
	
}
