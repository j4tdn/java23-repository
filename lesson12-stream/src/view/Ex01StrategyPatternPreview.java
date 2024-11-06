package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01StrategyPatternPreview {

	
	public static void main(String[] args) {
		
		// inventory: kho hàng
		var inventory = DataModel.getApples();
//		1st : find all green apples in his inventory
		CollectionUtils.generate("Green Apple", filter(inventory, apple -> "green".equals(apple.getColor())));
		
//		2nd: find all red apples in his inventory
		CollectionUtils.generate("Red Apple", filter(inventory, apple -> "red".equals(apple.getColor())));

//		3rd: find all apples heavier than 50 g
		CollectionUtils.generate("Weight > 50g ? Apple",
				filter(inventory, apple -> apple.getWeight() > 50));

//		4th: find all apples that are green and heavier than 150 g
	
	}
	
	// Quan trọng phải biết bài toán có strategy như thế nào
	// Biết được behaviour parameterization có mấy tham số, KDL gì và trả về KDL gì
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
