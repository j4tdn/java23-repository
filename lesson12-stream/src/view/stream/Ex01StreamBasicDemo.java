package view.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

import bean.Dish;
import common.Category;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01StreamBasicDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.mockDishes();
		
		// .collect(Collectors.toList());

		//1. Get dishes > 400 calories
		List<Dish> dishes = menu.stream()
				.filter(dish -> dish.getCalories() > 400).collect(Collectors.toList());

		CollectionUtils.generate("Dish > 400 calories", dishes);
		// Stream chỉ duyệt được 1 lần.

		// 2. Get name of dishes -> chuyển list string.
		Set<String> dishNameList = menu.stream()
			.map(d -> d.getName())
				.collect(Collectors.toSet()); // String
		
		CollectionUtils.generate("name", dishNameList);

		// 3. Get name of veggie
		String[] veggieDishes = menu.stream()
			.filter(d -> d.getCategory() == Category.VEGGIE)
				.map(Dish::getName)
				/*
				 * .toArray(new IntFunction<String[]>() { public String[] apply(int length) {
				 * System.out.println("length -> " + length); return new String[length]; } });
				 */
				// .toArray(length -> new String[length]);
				.toArray(String[]::new);

		for (String dish : veggieDishes) {
			System.out.println("veggie ->" + dish);
		}

		//Map -> Set -> Stream -> sort -> LinkedHash
		
		//Stream<T> -> ToList -> List<T> 
		//Stream<T> -> ToMap -> Map<K,V> 
		
		// Entry.comparingByKey = comparing(Entry::getKey)

		// Collectors.toMap(Entry::getKey, Entry::getValue)
		// -> key trùng -> lỗi
		// mặc định trả về hashmap

		// Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2);
		// -> key chuyển sang có thể trùng nhau, chọn value trước/sau

		// Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2,
		// LinkedHashMap::new)
		// --> có thể trùng nhau -> xác định kiểu Map lúc runtime

		// 4. Sort a budget map by key [null first, desc]
		final Map<Integer, String> vehicles = DataModel.mockVehicles();
		
		Map<Integer, String> sortedMap = vehicles.entrySet().stream()
		.sorted(Comparator.comparing(Entry::getKey, Comparator.reverseOrder()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));
		
	}
}
