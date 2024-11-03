package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static utils.CollectionUtils.*;

import bean.Apple;
import model.DataModel;

public class Ex01StrategyPartternPreview {

	public static void main(String[] args) {
		
		var inventory = DataModel.getApples();
		
		generate(
				"1st: find all green apple in his inventory",
				filter(inventory, apple -> "green".equals(apple.getColor()))
				);
		
		generate(
				"2nd: find all red apple in his inventory",
				filter(inventory, apple -> "red".equals(apple.getColor()))
				);
		
		generate(
				"3rd: find all apple heavier than 50g",
				filter(inventory, apple -> apple.getWeight() > 50)
				);
		
	}
	
	// Quan trọng phải biết bài toán có strategy như thế nào
	// Biết được behavior parameterization có mấy tham số, KDL gì và trả về KDL gì
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		for(var apple : inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
}
