package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex01StrategyPatternPreview {

	public static void main(String[] args) {
		
		var inventory = DataModel.getApples();
		
		generate("Find all green apples in his inventory", filter(inventory, apple -> "green".equals(apple.getColor())));
		
		generate("Find all red apples in his inventory", filter(inventory, apple -> "red".equals(apple.getColor())));
		
		generate("Find all apples heavier than 50 in his inventory", filter(inventory, apple -> apple.getWeight() > 50));
		
		generate("Find all apples lighter than 200 in his inventory", filter(inventory, apple -> apple.getWeight() < 200));

	}
	
	// Quan trọng phải biết bài toán có strategy như thế nào
	// Biết đc behavior parameterization có mấy tham số, KDL gì và trả về KDL gì
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<>();
		
		for(var apple: inventory)
			if(predicate.test(apple))
				result.add(apple);
		
		return result;
	}
}
