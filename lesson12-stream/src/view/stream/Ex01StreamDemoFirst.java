package view.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01StreamDemoFirst {

	public static void main(String[] args) {
	
		List<Dish> menu = DataModel.getDishes();
        
		// Tìm các đĩa thức ăn có lượng calo > 250;
		
		List<Dish> highCalorMenu = menu.stream(
				).filter(t -> t.getCalories() > 350)
				.collect(Collectors.toList());
		 
		CollectionUtils.generate("các đĩa thức ăn có lượng calo > 250", highCalorMenu);
		
		// Dùng toSet mặc định sẽ là HashSet 
		
		Set<String> nameOfDishes = menu.stream() // Stream<Dish>
		.map(t -> t.getName())
		.collect(Collectors.toSet());
	
		// Để biết la kiểu Set/List gì thì ta .getClas
		
		CollectionUtils.generate("Tên của các đĩa thức ăn ", nameOfDishes);

		
		// Ta dùng toCollection để đổi qua cái set List mà mình muốn 
		Set<String> nameOfDishess = menu.stream() // Stream<Dish>
				.map(t -> t.getName()) // Stream<Dish>
				.collect(Collectors.toCollection(LinkedHashSet::new)); //Set<String>
			
				CollectionUtils.generate("Tên của các đĩa thức ăn ", nameOfDishess);

		String[] nameOfVeggie = menu.stream()
				.filter( d -> d.getIsVeggie())	
				.map(d -> d.getName())
				.toArray(String[]::new);
			
		CollectionUtils.generate("Tên các người ăn chay" , nameOfVeggie);
		
		Map<String,Integer> models = DataModel.getModels();
		
		// Chuyển đổi models thành Map<Integer,String>
		
		Map<String, Integer> sortedMap = models.entrySet()
			.stream()
		.sorted(Comparator.comparing(Entry::getValue))
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));
			
				System.out.println("sortedMap runtime type --> " +sortedMap.getClass());
		
		
	}	
}
