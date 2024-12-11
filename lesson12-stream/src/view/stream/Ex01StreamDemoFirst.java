package view.stream;

import static utils.CollectionUtils.generate;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex01StreamDemoFirst {

	/*
	 Các bước làm với stream
	 B1. Chuyển đổi KDL source sang Stream<T>
	  	 --> source: List<T>, Set<T>, Map<K, V>
	  	 
	 B2. Sử dụng các hàm bên trong Stream<T>
	     --> hàm: filter
	              map
	              sorted
	     --> gọi xong vẫn trả về Stream<T>
	 
	 B3. Chuyển đổi từ Stream<T> sang KDL target
	     --> hàm: collect(toList, toSet, toCollection, toMap), toArray
	     --> target: List<T>, Set<T>, Array
	     --> gọi xong trả về KDL khác
	     
	 Lưu trữ và sử dụng các hàm bên trong KDL Stream
	 
	 Vì sao sau khi xử lý xong ko lưu trong Stream<T>
	 --> Vẫn lưu đc
	 --> Khi lưu trong stream, chỉ đc phép sử dụng 1 lần
	 */
	
	public static void main(String[] args) {
		
		List<Dish> menu = DataModel.getDishes();
		
		List<Dish> highCaloDishes = menu.stream() // Stream<Dish>
			.filter(d -> d.getCalories() > 250) // Stream<Dish>
			.collect(Collectors.toList()); // List<Dish>
		
		generate("1. Tim cac dia thuc an co luong calo > 250", highCaloDishes);
		
		Set<String> nameOfDishes = menu.stream() // Stream<Dish>
			.map(Dish::getName) // Stream<String>
			.collect(Collectors.toCollection(LinkedHashSet::new)); // Set<String>
		
		System.out.println("nod runtime: " + nameOfDishes.getClass());
		generate("2. Lay ra ten cua cac dia thuc an", nameOfDishes);
	
		String[] nameOfVeggieDishes = menu.stream() // Stream<Dish> 8
				.filter(Dish::getIsVeggie) // Stream<Dish> 3
				.map(Dish::getName) // Stream<String> 3
				.toArray(String[]::new);
		
		generate("3. Lay ra ten cua cac dia thuc an chay", nameOfVeggieDishes);
		
		// Stream<T>
		// List<T>, Set<T> extends Collection<T>
		// Map<K, V> -> Set<Entry<K, V>>
		
		// Stream<T> --> collection(Collectors.toList()) --> List<T>
		// Stream<T> --> ... --> Map<K, V>
		
		Map<String, Integer> models = DataModel.getModels();
		
		Map<String, Integer> sortedMap = models.entrySet() // Set<Entry<String, Integer>>
				.stream() // Stream<Entry<String, Integer>>
				.sorted(Comparator.comparing(Entry::getValue)) // Stream<Entry<String, Integer>>
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));
		

		System.out.println("sortedMap runtime type --> " + sortedMap.getClass());
		generate("4. Sap xep models tang dan theo value(ma bien so xe)", sortedMap);
		
		// Set<Entry<String, Integer>>
		
		// Chuyen doi models thanh Map<Integer, String>
		Map<Integer, String> swapKVs = models.entrySet()
					  .stream()
					  .collect(Collectors.toMap(Entry::getValue, Entry::getKey, (v1, v2) -> v2));
		generate("5. Hoan doi Key va Value", swapKVs);
		
	}
}
