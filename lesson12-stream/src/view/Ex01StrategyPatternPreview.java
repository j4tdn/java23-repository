package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;

import static utils.CollectionUtils.*;

public class Ex01StrategyPatternPreview {

	public static void main(String[] args) {

		// inventory: Kho hàng
		var inventory = DataModel.getApples();

		// 1st: find all green apples in his inventory
		generate(
			"1st: find all green apples in his inventory",
			filter(inventory, apple -> "green".equals(apple.getColor()))
		);

		// 2nd: find all red apples in his inventory
		generate(
			"2nd: find all red apples in his inventory",
			filter(inventory, apple -> "red".equals(apple.getColor()))
		);

		// 3rd: find all apples heavier than 150g
		generate(
			"3rd: find all apples heavier than 150g", 
			filter(inventory, apple -> apple.getWeight() > 50)
		);

		// 4th: find all apples lighter than 200g
		generate(
			"4th: find all apples lighter than 200g", 
			filter(inventory, apple -> apple.getWeight() < 200)
		);

		// 5th: find all apples that are green and heavier than 150g
		generate(
			"5th: find all apples that are green and heavier than 150g",
			filter(inventory, apple -> "green".equals(apple.getColor()) && apple.getWeight() > 150)
		);
	}

	// Quan trọng phải biết bài toán có strategy như thế nào
	// Cần biết được behavior parameterization (Tham số hành vi) có mấy tham số, KDL
	// gì và trả về KDL gì
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();

		for (var apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}
