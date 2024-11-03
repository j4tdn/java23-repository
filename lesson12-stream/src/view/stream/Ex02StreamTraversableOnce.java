package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Dish;
import model.DataModel;

public class Ex02StreamTraversableOnce {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		Stream<Dish> dish = menu.stream();
		System.out.println("Duyet lan 1" );
		dish.forEach(null);
		System.out.println("Duyet lan 1" );
	}
}
