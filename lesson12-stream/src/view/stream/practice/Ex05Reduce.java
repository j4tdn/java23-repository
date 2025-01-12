package view.stream.practice;

import java.util.List;

import bean.Dish;
import common.Category;
import model.DataModel;

public class Ex05Reduce {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 3, 5, 7, 9, 8, 6, 4, 2);
		
		//Max
		Integer max = numbers.stream().reduce(0, Integer::max);

		// Min
		Integer min = numbers.stream().reduce(0, Integer::min);

		// Sum
		Integer sum = numbers.stream().reduce(0, Integer::sum);

		// Tìm tổng calories của cate FISH
		// reduce (BinaryOperator<T,T,T> -> giá trị đầu, a,b -> a + b

		var menu = DataModel.mockDishes();
		Integer sumCalories = menu.stream()
			.filter(d -> d.getCategory() == Category.FISH)
//			.mapToInt(Dish::getCalories)
//			.sum();
				.map(Dish::getCalories).reduce(0, Integer::sum);

		System.out.println("Sum calories: " + sumCalories);

	}
}
