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
	 * Các bước làm với stream
	 * B1. Chuyển đổi từ KDL source sang Stream<T>
	 * 	   --> source: List<T>, Set<T>, Map<K, V>
	 * 
	 * B2. Sử dụng các hàm bên trong Stream<T>
	 *     --> hàm: filter
	 *     			map
	 *     			sorted
	 *     --> gọi xong vẫn trả về Stream<T>
	 *     			
	 * B3. Chuyển đổi từ Stream<T> sang KDL target
	 * 	   --> hàm: collect, toArray
	 * 	   --> target: List<T>, Set<T>, Array
	 * 	   --> gọi xong trả về KDL khác
	 * 
	 * Lưu trữ và sử dụng các hàm bên trong KDL Stream
	 * 1. Vì sao khởi tạo dữ liệu không lưu trong Stream<T>?
	 * 2. Vì sao sau khi xử lý xong không lưu trong Stream<T>?
	 * 
	 * --> Vẫn lưu được
	 * --> Khi lưu trong stream, chỉ được phép sử dụng một lần
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<Dish> menu = DataModel.getDishes();
		
		List<Dish> hightCaloDishes = menu.stream() //Stream<Dish>
			.filter(d -> d.getCalories() > 350) // Stream<Dish>
			.collect(Collectors.toList()); // List<Dish>
		
		generate("1. Tìm các dĩa thức an có lượng calo > 350", hightCaloDishes);
		
		Set<String> nameOfDishes = menu.stream() // Stream<Dish>
			.map(Dish::getName) // Stream<String>
			.collect(Collectors.toCollection(LinkedHashSet::new)); // Set<String>
		
		System.out.println("nod runtime" + nameOfDishes.getClass());
		generate("2. Lấy ra tên của các đĩa thức ăn", nameOfDishes);
		
		String[] nameOfeveggieDishes = menu.stream()
			.filter(Dish::getIsVeggie) // Stream<Dish>
			.map(Dish::getName) // Stream<String>
			.toArray(String[]::new);
		
		generate("3. Lấy ra tên của các đĩa thức ăn chay", nameOfeveggieDishes);
		
		// Stream<T>
		// List<T>, Set<T> extends Collection<T>
		// Map<K, V> -> Set<Entry<K. v>
		
		// Stream<T> --> collect(Collectors.toList()) --> List<T>
		// Stream<T> --> ... --> Map<K, V>
		
		// sắp xếp models tăng dần theo value (mã biển số xe)
		Map<String, Integer> models = DataModel.getModels();
		
		// Chuyển đổi models thành Map<Integer, String>
		
		Map<String, Integer> sortedMap = models.entrySet() // Set<Entry<String, Integer>
			  .stream() // Stream<Entry<String, Integer>
			  .sorted(Comparator.comparing(Entry::getValue)) // Stream<Entry, Integer>
			  .collect(Collectors.toMap(Entry::getKey, Entry::getValue, 
					  				   (v1, v2) -> v2, LinkedHashMap::new));
		
		generate("4 Sắp xếp models tăng dần them value (mã biển số xe)", sortedMap);
		
		Map<Integer, String> swapKVs = models.entrySet().stream()
				  .collect(Collectors.toMap(Entry::getValue, Entry::getKey, (v1, v2) -> v1));
		generate("5. Hoán đổi Key và Value", swapKVs);
		
	}
	
}
