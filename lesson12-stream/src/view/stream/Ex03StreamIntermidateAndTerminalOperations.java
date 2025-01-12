package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamIntermidateAndTerminalOperations {
	public static void main(String[] args) {

		// Hàm nào chấm xong trả về Stream -> Internal

		// Hàm nào chấm xong trả về KDL khác -> Terminal operations.

		List<Dish> menu = DataModel.mockDishes();
		
		// B1 (filter) -> duyệt 12 ptu -> lọc ra calory > 12
		// B2 (map) -> lấy name của Dish từ B1
		// B3 (limit) -> lấy 3 ptu từ B2
		// B4 (collect) -> chuyển về list

		List<String> names = menu.stream()
			.filter(d -> d.getCalories() > 300) 
			.map(d -> d.getName())
			.limit(3)
			.collect(Collectors.toList());

	}
}
