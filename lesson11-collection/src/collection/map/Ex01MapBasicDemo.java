package collection.map;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01MapBasicDemo {

//		var vehicles = new HashMap<>(); // K Obj V Obj

		/*
		 * HashMap
		 * + Khong duy tri dung phan tu vao set
		 * + cho phep key = null
		 * 
		 * LinkedHashMap
		 * + đảm bảo duy trì thứ tự
		 * + cho phep key = null
		 * 
		 * TreeMap
		 * + Tự động sắp xếp các ptu(Entry) theo key tăng dần
		 * + K phải là con của Comparable<K>
		 */
		
		public static void main(String[] args) {
		Map<Integer, String> vehicles = new TreeMap<>((k1,k2) -> {
			//null first
			if (k1 == null) {
				return -1;
			}
			if (k2 == null) {
				return 1;
			}

			// key descending
			return k2.compareTo(k1);
		});
			

		vehicles.put(92, "Quảng Nam");
		vehicles.put(43, "Đà Nẵng");
		vehicles.put(75, "Huế");
		vehicles.put(74, "Quảng Trị");
		vehicles.put(73, "Quảng Bình");

		vehicles.put(75, "T - T - H"); // put -> override
		vehicles.putIfAbsent(92, "QN"); // put --> ko override

		printf("Vehicles: ", vehicles);

		System.out.println("Value K=88: " + vehicles.getOrDefault(88, "Not Found"));

		// Hỗ trợ tìm kiếm
		System.out.println("Country (92): " + vehicles.getOrDefault(92, "Not found"));
		
		// Arrays.sort
		// Collections.sort
		// list.sort(Comparator<T>)
		// --> void

		// Sắp xếp ptu trong map theo K, V bất kì
		// vd tăng dần theo value

		printf("sorted: ", sort(vehicles, (e1, e2) -> e1.getKey().compareTo(e2.getKey())));

	}

	private static <K, V> Map<K, V> sort(Map<K, V> source, Comparator<Entry<K, V>> comparator) {
		// chuyển map -> list -> sorted list
		var entryList = new ArrayList<>(source.entrySet());
		entryList.sort(comparator);

		// b2: đưa ptu từ sorted list vào linked
		Map<K, V> sortedMap = new LinkedHashMap<>();
		for (var entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

	// Map -> mỗi ptu là 1 entry khác nhau
	private static <K, V> void printf(String prefix, Map<K, V> map) {
		System.out.println(prefix + "{");
		Set<Entry<K, V>> entries = map.entrySet();
		entries.forEach(m -> System.out.println(m.getKey() + " --> " + m.getValue()));
	}
}
