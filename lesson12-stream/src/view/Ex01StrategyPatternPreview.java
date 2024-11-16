package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01StrategyPatternPreview {

	public static void main(String[] args) {
		var inventory = DataModel.getApples();
		
		CollectionUtils.generate("Green aplle -->" , filter(inventory, t -> 
		      "green".equals(t.getColor())
				));
		
		CollectionUtils.generate("Red aplle -->" , filter(inventory, t -> 
	      "Red".equals(t.getColor())
			));
		
		CollectionUtils.generate("Apple is higher than 50" , filter(inventory, t -> 
	      t.getWeight() > 50
			));
		
		CollectionUtils.generate("Apple is lighter than 300" , filter(inventory, t -> 
	      t.getWeight() > 300
			));
		
		

	}
	
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		
		for(var apple:inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}
