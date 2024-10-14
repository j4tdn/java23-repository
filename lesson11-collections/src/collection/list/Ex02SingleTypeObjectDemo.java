package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// SOT: Single Type Object: Integer, String, Double, LocalDate,...
public class Ex02SingleTypeObjectDemo {

	public static void main(String[] args) {
		
		// khởi tạo, thêm, sửa, xóa, lấy ra, sắp xếp...
		
		List<String> elements = new ArrayList<>();
		
		elements.add("A92");
		elements.add("B42");
		elements.add("Z15");
		elements.add("T86");
		
		elements.add(0, "K7");
		elements.add(3, "X3");
		
		// sửa
		elements.set(2, "N2");
		
		// xóa phần tử có giá trị là T86
		// kiểm tả trong List<T> nếu có phần tử T86 thì nó sẽ xóa, ko thôi
		elements.remove("T87");
		
		// Xóa những từ mà có kí tự cuối cùng là số và lớn hơn 5
		// ConcurrentModificationException
		// Vì elements vừa sử dụng để for trong lúc for vừa remove
		// --> có thể chưa duyệt đến thì phần tử thứ i đã bị xóa
		// Sửa lỗi này:
		// --> đảm bảo là duyệt đến phần tử thứ i mới dc phéo xóa phần tử
		// thứ i hoặc < i
		// duyệt đồng bộ: synchronous		: duyệt đến i mới sử đụng dc i	: Iterable#iterate
		// duyệt bất đồng bộ: asynchronous	: duyệt i dùng i+ i- đều đc		: for each, for-index
		
//		for(String s: elements) {
//			char lastLetter = s.charAt(s.length() - 1 );
//			if(Character.isDigit(lastLetter) && Integer.parseInt(String.valueOf(lastLetter)) > 5) {
//				System.out.println("test: " + s);
//			}
//		}
		
		// Duyệt đồng bộ
		// hasNext: có phần tử tiếp theo mới nhảy qua
//		Iterator<String> iterator = elements.iterator();
//		while(iterator.hasNext()) {
//			String element = iterator.next();
//			char lastLetter = element.charAt(element.length() - 1 );
//			if(Character.isDigit(lastLetter) && Integer.parseInt(String.valueOf(lastLetter)) > 5) {
//				iterator.remove();
//			}
//		}
		
		elements.removeIf(element -> {
			char lastLetter = element.charAt(element.length() - 1 );
			return Character.isDigit(lastLetter) && Integer.parseInt(String.valueOf(lastLetter)) > 5;
		});
		
		System.out.println("X3 contains --> " + elements.contains("X3"));
		System.out.println("size: " + elements.size()); // phân biệt size và length
		
		// in ra danh sách
		// for-each, for-index
//		for (int i = 0; i < elements.size(); i++) {
//			System.out.println(elements.get(i));
//		}
		
		// for each có sẵn trong list --> strategy pattern
		System.out.println("elements: ");
		elements.forEach(seq -> System.out.println(seq + " "));
		
		System.out.println("\n");
		
		// copy danh sách từ elements sang words
		List<String> words = new ArrayList<>(elements);
		// List<String> words = elements;
		System.out.println("words: ");
		words.forEach(word -> System.out.println(word + " "));
	}
	
}
