package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02SingleTypeObjectDemo {

	public static void main(String[] args) {
		// khoi tao, them, sua, xoa, lay ra su dung, sap xep, in ra...
		
		List<String> elements = new ArrayList<String>(); // Object[] elementData
		
		elements.add("A92"); // them vao vi tri cuoi cung cua danh sach
		elements.add("B42"); 
		elements.add("Z15"); 
		elements.add("T86"); 
		
		elements.add(0, "K7");
		elements.add(3, "X3");
		
		elements.set(2, "N2");
		
		// xoa phan tu co gia tri la T86
		elements.remove("T86"); // Kiem tra trong List<T> neu co phan tu T87 thi no se xoa, khong thi thoi
		
 //	     xoa nhung tu ma co ki tu cuoi cung la so va lon hon 5
 //		 ConcurrentModificationException
 //		 Vi elements vua su dung de for trong luc for vua remove
 //		 --> co the chua duyet den thi phan tu thu i da bi xoa
 //		 Sua loi nay: dam bao la duyet den phan tu thu i moi dc phep xoa phan tu thu i hoac <i
 //		 duyet dong bo: synchronous     : Duyet den i moi su dung duoc i
 //		 duyet bat dong bo: asynchronous: Duyet i dung i+ i- deu duoc   : for each, for-index
//		for(String element: elements) {
//			char lastOne = element.charAt(element.length() - 1);
//			if(Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5)
//				elements.remove(element);
//		}
		
//		Iterator<String> iterator = elements.iterator();
//		while(iterator.hasNext()) {
//			String element = iterator.next();
//			char lastOne = element.charAt(element.length() - 1);
//			if(Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5)
//				iterator.remove();
//		}
		
		elements.removeIf(element -> {
			char lastOne = element.charAt(element.length() - 1);
			return Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5;
		});
		
		System.out.println("X3 contains --> " + elements.contains("X3z"));
		
		System.out.println("size: " + elements.size()); // phan biet size va length
		
		// in ra danh sach
		// for-each, for index
		
		for(int i = 0; i < elements.size(); i++)
			System.out.println(elements.get(i));
		
		System.out.println("\n\n");
		
		// forEach co san trong List --> strategy pattern
		System.out.println("elements: ");
		elements.forEach(seq -> System.out.println(seq + " "));
		
		System.out.println("\n\n");
		
		// copy danh sach tu elements sang words
		List<String> words = new ArrayList<String>(elements);
		System.out.println("words: ");
		elements.forEach(word -> System.out.println(word + " "));
	}
}
