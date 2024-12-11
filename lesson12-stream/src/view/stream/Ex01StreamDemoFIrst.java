package view.stream;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex01StreamDemoFIrst {
	
	/* Các bước làm với stream 
	 * B1: chuyển đổi kiểu dữ liệu 
	 * B2: Sử dụng các hàm trong stream 
	 * B3: chuyển đổi từ stream<T> -> T 
	 
	 */
	

	public static void main (String[] args) {
		
		
		List<Dish> menu = DataModel.getDishes();
		
		//1. tìm những đĩa thức ăn có lượng kcal >250
		
		List<Dish> highCaloDishes =menu.stream()	//->stream<Dish>
				.filter(d->d.getCalories()>250).collect(Collectors.toList()); 
			
		
		generate("1. Tìm các đĩa thức ăn có lượng calo > 250", highCaloDishes);
		
		Set<String> nameOfDishes = menu.stream()
				.map(Dish::getName)
				.collect(Collectors.toCollection(LinkedHashSet::new));
		
		System.out.println("nod runtime: " + nameOfDishes.getClass());
		generate("2. Lấy ra tên của các đĩa thức ăn", nameOfDishes);
		
		String[] nameOfVeggieDishes = menu.stream()
				.filter(Dish::getIsVeggie)
				.map(Dish::getName)
				.toArray(String[]::new);
					
		
		Map<String, Integer> models = DataModel.getModels();
		
		models.entrySet()
			.stream()
			.sorted(Comparator.comparing(Entry::getValue));
		
		

	}
	
	
	
}
