package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// SOT : single type Object: Integer, String, Double, LocalDate, ... 
public class Ex02SingleTypeObjectDemo {
	
	public static void main(String[] args) {
		
		List<String> elements = new ArrayList<>();
		
		elements.add("a92"); // thêm vào vị trí cuối cùng của danh sách 
		elements.add("N34");
		elements.add("t54");
		elements.add("P87");
		
		elements.add(0, "k23"); // thêm vào vị trí bất kì index = 
		elements.add(3, "X23");
		
		elements.set(2, "J97");
		
		elements.remove("J97"); // kiểm tra trong list<> nếu có j97 thì xóa
		// Xoa những từ mà có kí tự cuối cùng là số và lớn hơn 5
		//vì element vừa sử dụng for tronng lúc for vừa remove
		
		System.out.println("size : " + elements.size()); 
		Iterator<String> inIterator = elements.iterator();
		while(inIterator.hasNext()) {
			String element = inIterator.next();
			char lastone = element.charAt(element.length() - 1);
			if(Character.isDigit(lastone)&& Integer.parseInt(String.valueOf(lastone)) > 5) {
				inIterator.remove();
			}
		}
		// in ra danh sách 
		// for index
//		for(int i = 0; i < elements.size(); i++) {
//			System.out.println(elements.get(i));
//		}
		
		elements.removeIf(element -> {
			char lastone = element.charAt(element.length() - 1);
			return (Character.isDigit(lastone)&& Integer.parseInt(String.valueOf(lastone)) > 5) ;
				//inIterator.remove();
		});
		// for Each:  có sẵn trong list 
		System.out.println("element: ") ;
		elements.forEach(seq -> System.out.println(seq + " "));
		
		List<String> words = new ArrayList<>(elements);
		
		System.out.println("words: ");
		words.forEach(see -> System.out.println(see + " "));
		
	}
	
}
