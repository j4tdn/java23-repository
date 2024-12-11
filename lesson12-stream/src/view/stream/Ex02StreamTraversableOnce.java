package view.stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Dish;
import model.DataModel;

public class Ex02StreamTraversableOnce {

	public static void main(String[] args) {
		
		List<Dish> menu = DataModel.getDishes();

		Stream<Dish> dishes = menu.stream();
		
		System.out.println("1. Duyet lan dau");
		dishes.forEach(System.out::println);
		
		System.out.println("\n===========\n");
		
		System.out.println("2. Duyet lan hai");
		dishes.forEach(System.out::println);
	}
}
