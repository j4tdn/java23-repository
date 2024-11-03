package view.stream;

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
import static ultisl.CollectionUtils.*;
public class Ex01StreamDemoFirts {
	// stream()  là hàm default . Để interface có body ta dùng  hàm default
	
	/*
	 Các bước làm với stream
	 B1: Chuyển đổi KDL từ source sang Stream<T>
	    --> source :List<T>, Set<T>, Map<K,V>
	 	
	 B2: Sử dụng các hàm có sẵn trong Stream
	 	--> hàm : fillter
	 				map
	 				sotred
	 
	 B3: Chuyển đổi 
	 */
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		List<Dish> highCaloDishes = menu.stream() // Stream <Dish>
		    .filter(d -> d.getCalories() > 250) // Stream<Dish>
		    .collect(Collectors.toList()); // List<Dish>
		generate("1. tìm các đĩa thức ăn có lượng calo > 250", highCaloDishes);
		
		Set<String> nameOfDishes = menu.stream() // Stream<Dish>
			.map(Dish :: getName) // Stream<String>
			.collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println("nod runtime " + nameOfDishes.getClass());
		generate("2. Lấy ra tên của các thức ăn ", nameOfDishes);
		
		String [] nameOfveggieDishes = menu.stream()
			.filter(Dish::getIsVeggie)
			.map(Dish :: getName )
			.toArray(String [] :: new);
		//generate("3. Lấy ra tên của các thức ăn ", nameOfveggieDishes);
		
		Map<String,Integer> models = DataModel.getModels();
		Map<String,Integer> sotrMap = models.entrySet()
											.stream()
											.sorted(Comparator.comparing(Entry :: getValue))
											.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1,v2) -> v1, LinkedHashMap :: new));
											
		generate("4. Sắp xếp models tăng dần theo value ", sotrMap);
		Map<Integer,String> Swap = models.entrySet()
										.stream()
										.collect(Collectors.toMap(Entry :: getValue, Entry::getKey, (v1,v2) -> v1));
		generate("5. Hoán đổi key value ", Swap);
	}
}
