package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02AList_SingleType {
	public static void main(String[] args) {
//		List<String> elements = new ArrayList<String>();

		List<String> elements = new ArrayList<String>(); // JDK 10 ->

		elements.add("A63");
		elements.add("B44");
		elements.add("Z76");
		elements.add("A30Z");
		elements.add(1, "T86");
		elements.add(0, "K8");
		elements.set(2, "N2");
		// xoá ptu giá trị "T86"
		elements.remove("T86");

		System.out.println("Origin -->");
		elements.forEach(s -> System.out.print(s + " "));

		// xoá những từ có kí tự cuối là số và lớn hơn 5
		// ConcurrentModificationException
		// -> vì remove object có thể xoá ptu ở sau
		// -> fix: đảm bảo duyệt đến ptu nào thì ptu đó xoá
		// duyệt đồng bộ: synchronous: duyệt đến i sử dụng i: Iterable#Iterate
		// duyệt bất đồng bộ: asynchronic: duyệt đến i sử dụng i++ i--:for-each,
		// for-index
		
//		elements.forEach(element -> {
//			char lastOne = element.charAt(element.length() - 1);
//			if (Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5) {
//				elements.remove(element);
//			}
//		});

		System.out.println("\n1. After remove (>5): ");

//		Iterator<String> iterator = elements.iterator();
//		while (iterator.hasNext()) {
//			String element = iterator.next();
//			char lastOne = element.charAt(element.length() - 1);
//			if (Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5) {
//				iterator.remove();
//			}
//		}

		elements.removeIf(element -> {
			char lastOne = element.charAt(element.length() - 1);
			return Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5;
		});
		
		elements.forEach(s -> System.out.print(s + " "));
		System.out.println("\n2. sequence size: " + elements.size());


		// copy dsach từ elements -> words

		List<String> words = new ArrayList<>(elements);
//		List<String> words = elements;

	}


}
