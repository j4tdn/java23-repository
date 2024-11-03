package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import static ultisl.CollectionUtils.*;
import bean.Apple;
import model.DataModel;

public class Ex01StrategyPatterPreview {
	public static void main(String[] args) {
		// inventory : kho hang
		 var inventory = DataModel.getApples();
		 
		 generate("1.", fitler(inventory, apple -> "green".equals(apple.getColor())));
		 generate("2",fitler(inventory,apple -> "red".equals(apple.getColor())));
		 generate("3.", fitler(inventory, apple -> apple.getWeight() > 50));
		 
		 
	}
	// Quan trọng biết được bài toán có strate
	private static List<Apple> fitler(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<>();
		for(var apple : inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		
		
		return result;
	}
}
